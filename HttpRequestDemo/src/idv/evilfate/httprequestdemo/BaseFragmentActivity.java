package idv.evilfate.httprequestdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class BaseFragmentActivity extends FragmentActivity {
	protected String TAG;

	public BaseFragmentActivity() {
		super();
		TAG = ((Object) this).getClass().getSimpleName();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		if (BuildConfig.DEBUG && BuildFlag.ACTIVITY_STATE_LOG_FLAG) {
			LogUtil.d("ActivityState", TAG + " onCreate");
		}
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void onDestroy() {
		if (BuildConfig.DEBUG && BuildFlag.ACTIVITY_STATE_LOG_FLAG) {
			LogUtil.d("ActivityState", TAG + " onDestroy");
		}
		super.onDestroy();
	}

	@Override
	public void onLowMemory() {
		if (BuildConfig.DEBUG && BuildFlag.ACTIVITY_STATE_LOG_FLAG) {
			LogUtil.d("ActivityState", TAG + " onLowMemory");
		}
		super.onLowMemory();
	}

	@Override
	protected void onPause() {
		if (BuildConfig.DEBUG && BuildFlag.ACTIVITY_STATE_LOG_FLAG) {
			LogUtil.d("ActivityState", TAG + " onPause");
		}
		super.onPause();
	}

	@Override
	protected void onResume() {
		if (BuildConfig.DEBUG && BuildFlag.ACTIVITY_STATE_LOG_FLAG) {
			LogUtil.d("ActivityState", TAG + " onResume");
		}
		super.onResume();
	}

	@Override
	protected void onStart() {
		if (BuildConfig.DEBUG && BuildFlag.ACTIVITY_STATE_LOG_FLAG) {
			LogUtil.d("ActivityState", TAG + " onStart");
		}
		super.onStart();
	}

	@Override
	protected void onStop() {
		if (BuildConfig.DEBUG && BuildFlag.ACTIVITY_STATE_LOG_FLAG) {
			LogUtil.d("ActivityState", TAG + " onStop");
		}
		super.onStop();
	}
}
