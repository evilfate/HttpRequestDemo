package idv.evilfate.httprequestdemo;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class MyApplication extends Application {
	private static Context context;
	private static boolean isNetConnected;
	private static final String TAG = MyApplication.class.getSimpleName();

	public static Context getContext() {
		return context;
	}

	public static boolean isNetConnected() {
		return isNetConnected;
	}

	private final BroadcastReceiver mNetworkStateReceiver = new BroadcastReceiver() {
		@Override
		public void onReceive(Context context, Intent intent) {
			if (intent.getAction().equals(
					ConnectivityManager.CONNECTIVITY_ACTION)) {

				ConnectivityManager connectivityManager = (ConnectivityManager)

				context.getSystemService(Context.CONNECTIVITY_SERVICE);
				NetworkInfo info = connectivityManager.getActiveNetworkInfo();
				if (info != null && info.isAvailable()) {
					// Net connected
					isNetConnected = true;
					LogUtil.i(TAG, "Net connected");
				} else {
					isNetConnected = false;
					LogUtil.i(TAG, "Net disconnected");
				}
			}
		}
	};

	@Override
	public void onCreate() {
		super.onCreate();
		LogUtil.i(TAG, "onCreate");
		context = getApplicationContext();
		IntentFilter mNetworkStateFilter = new IntentFilter(
				ConnectivityManager.CONNECTIVITY_ACTION);
		registerReceiver(mNetworkStateReceiver, mNetworkStateFilter);
	}

	@Override
	public void onTerminate() {
		super.onTerminate();
		unregisterReceiver(mNetworkStateReceiver);
	}
}
