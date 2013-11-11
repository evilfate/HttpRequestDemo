package idv.evilfate.httprequestdemo;

import java.io.File;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.AllowAllHostnameVerifier;

import com.squareup.okhttp.HttpResponseCache;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.apache.OkApacheClient;

public class HttpClientHelper {

	private static HttpClient httpClient;
	private static OkHttpClient okHttpClient;

	private HttpClientHelper() {

	}

	public static synchronized HttpClient getHttpClient() {
		if (null == httpClient) {
			httpClient = createMyHttpClient();
		}

		return httpClient;
	}

	public static OkHttpClient getOkHttpClient() {
		if (okHttpClient == null) {
			try {
				okHttpClient = new OkHttpClient();

				SSLContext sc = SSLContext.getInstance("TLS");
				TrustManager mTrustManager = new X509TrustManager() {

					@Override
					public void checkClientTrusted(X509Certificate[] chain,
							String authType) throws CertificateException {
					}

					@Override
					public void checkServerTrusted(X509Certificate[] chain,
							String authType) throws CertificateException {
					}

					@Override
					public X509Certificate[] getAcceptedIssuers() {
						return null;
					}
				};
				sc.init(null, new TrustManager[] { mTrustManager },
						new java.security.SecureRandom());
				javax.net.ssl.SSLSocketFactory newFactory = sc
						.getSocketFactory();
				okHttpClient.setSslSocketFactory(newFactory);
				okHttpClient
						.setHostnameVerifier(new AllowAllHostnameVerifier());
				File httpCacheDir = new File(MyApplication.getContext()
						.getCacheDir(), "http_cache");
				long httpCacheSize = 10 * 1024 * 1024; // 10 MB
				try {
					// Add response cache provided by OkHttp
					okHttpClient.setResponseCache(new HttpResponseCache(
							httpCacheDir, httpCacheSize));
				} catch (IOException e) {
					e.printStackTrace();
				}

				okHttpClient.setConnectTimeout(30000, TimeUnit.MILLISECONDS);
				okHttpClient.setReadTimeout(30000, TimeUnit.MILLISECONDS);
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();

			} catch (KeyManagementException e) {
				e.printStackTrace();
			}
		}
		return okHttpClient;
	}

	public static HttpClient createMyHttpClient() {
		OkHttpClient client = getOkHttpClient();
		if (client != null) {
			return new OkApacheClient(client);
		}
		return new OkApacheClient();
	}
}
