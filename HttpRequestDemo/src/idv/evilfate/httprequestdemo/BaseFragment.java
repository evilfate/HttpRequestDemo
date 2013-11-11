package idv.evilfate.httprequestdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BaseFragment extends Fragment {
	protected String TAG;

	public BaseFragment() {
		super();
		TAG = ((Object) this).getClass().getSimpleName();
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		if (BuildConfig.DEBUG && BuildFlag.FRAGMENT_STATE_LOG_FLAG) {
			LogUtil.d("FragmentState", TAG + " onActivityCreated");
		}
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (BuildConfig.DEBUG && BuildFlag.FRAGMENT_STATE_LOG_FLAG) {
			LogUtil.d("FragmentState", TAG + " onActivityResult");
		}
		super.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public void onAttach(Activity activity) {
		if (BuildConfig.DEBUG && BuildFlag.FRAGMENT_STATE_LOG_FLAG) {
			LogUtil.d("FragmentState", TAG + " onAttach");
		}
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		if (BuildConfig.DEBUG && BuildFlag.FRAGMENT_STATE_LOG_FLAG) {
			LogUtil.d("FragmentState", TAG + " onCreate");
		}
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (BuildConfig.DEBUG && BuildFlag.FRAGMENT_STATE_LOG_FLAG) {
			LogUtil.d("FragmentState", TAG + " onCreateView");
		}
		return super.onCreateView(inflater, container, savedInstanceState);
	}

	@Override
	public void onDestroy() {
		if (BuildConfig.DEBUG && BuildFlag.FRAGMENT_STATE_LOG_FLAG) {
			LogUtil.d("FragmentState", TAG + " onDestroy");
		}
		super.onDestroy();
	}

	@Override
	public void onDestroyView() {
		if (BuildConfig.DEBUG && BuildFlag.FRAGMENT_STATE_LOG_FLAG) {
			LogUtil.d("FragmentState", TAG + " onDestroyView");
		}
		super.onDestroyView();
	}

	@Override
	public void onDetach() {
		if (BuildConfig.DEBUG && BuildFlag.FRAGMENT_STATE_LOG_FLAG) {
			LogUtil.d("FragmentState", TAG + " onDetach");
		}
		super.onDetach();
	}

	@Override
	public void onPause() {
		if (BuildConfig.DEBUG && BuildFlag.FRAGMENT_STATE_LOG_FLAG) {
			LogUtil.d("FragmentState", TAG + " onPause");
		}
		super.onPause();
	}

	@Override
	public void onResume() {
		if (BuildConfig.DEBUG && BuildFlag.FRAGMENT_STATE_LOG_FLAG) {
			LogUtil.d("FragmentState", TAG + " onResume");
		}
		super.onResume();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		if (BuildConfig.DEBUG && BuildFlag.FRAGMENT_STATE_LOG_FLAG) {
			LogUtil.d("FragmentState", TAG + " onSaveInstanceState");
		}
		super.onSaveInstanceState(outState);
	}

	@Override
	public void onStart() {
		if (BuildConfig.DEBUG && BuildFlag.FRAGMENT_STATE_LOG_FLAG) {
			LogUtil.d("FragmentState", TAG + " onStart");
		}
		super.onStart();
	}

	@Override
	public void onStop() {
		if (BuildConfig.DEBUG && BuildFlag.FRAGMENT_STATE_LOG_FLAG) {
			LogUtil.d("FragmentState", TAG + " onStop");
		}
		super.onStop();
	}
}
