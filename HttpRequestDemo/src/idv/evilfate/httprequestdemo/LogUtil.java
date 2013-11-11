package idv.evilfate.httprequestdemo;

import android.util.Log;

/**
 * Log wrapper which support print out the line number.
 * 
 * Help to identify where the LogUtil being called.
 * 
 * @author Fate Chang
 * 
 */
public class LogUtil {
	public static boolean OPEN_DETAIL_LOG = false;
	public static boolean OPEN_LOG = BuildFlag.OPEN_LOG;
	private static String TAG = "HttpRequestDemo";

	public static void d(String msg) {
		if (OPEN_LOG) {
			if (OPEN_DETAIL_LOG) {
				Throwable throwable = new Throwable();
				throwable.fillInStackTrace();
				StackTraceElement[] elements = throwable.getStackTrace();
				Log.d(elements[1].getClassName(),
						"At line : " + elements[1].getLineNumber());
			}
			Log.d(TAG, msg);
		}
	}

	public static void d(String TAG, String msg) {
		if (OPEN_LOG) {
			if (OPEN_DETAIL_LOG) {
				Throwable throwable = new Throwable();
				throwable.fillInStackTrace();
				StackTraceElement[] elements = throwable.getStackTrace();
				Log.d(elements[1].getClassName(),
						"At line : " + elements[1].getLineNumber());
			}
			Log.d(TAG, msg);
		}
	}

	public static void e(String msg) {
		if (OPEN_LOG) {
			if (OPEN_DETAIL_LOG) {
				Throwable throwable = new Throwable();
				throwable.fillInStackTrace();
				StackTraceElement[] elements = throwable.getStackTrace();
				Log.e(elements[1].getClassName(),
						"At line : " + elements[1].getLineNumber());
			}
			Log.e(TAG, msg);
		}
	}

	public static void e(String msg, Exception e) {
		if (OPEN_LOG) {
			if (OPEN_DETAIL_LOG) {
				Throwable throwable = new Throwable();
				throwable.fillInStackTrace();
				StackTraceElement[] elements = throwable.getStackTrace();
				Log.e(elements[1].getClassName(),
						"At line : " + elements[1].getLineNumber());
			}
			Log.e(TAG, msg, e);
		}
	}

	public static void e(String TAG, String msg) {
		if (OPEN_LOG) {
			if (OPEN_DETAIL_LOG) {
				Throwable throwable = new Throwable();
				throwable.fillInStackTrace();
				StackTraceElement[] elements = throwable.getStackTrace();
				Log.e(elements[1].getClassName(),
						"At line : " + elements[1].getLineNumber());
			}
			Log.e(TAG, msg);
		}
	}

	public static void i(String msg) {
		if (OPEN_LOG) {
			if (OPEN_DETAIL_LOG) {
				Throwable throwable = new Throwable();
				throwable.fillInStackTrace();
				StackTraceElement[] elements = throwable.getStackTrace();
				Log.i(elements[1].getClassName(),
						"At line : " + elements[1].getLineNumber());
			}
			Log.i(TAG, msg);
		}
	}

	public static void i(String TAG, String msg) {
		if (OPEN_LOG) {
			if (OPEN_DETAIL_LOG) {
				Throwable throwable = new Throwable();
				throwable.fillInStackTrace();
				StackTraceElement[] elements = throwable.getStackTrace();
				Log.i(elements[1].getClassName(),
						"At line : " + elements[1].getLineNumber());
			}
			Log.i(TAG, msg);
		}
	}

	public static void v(String msg) {
		if (OPEN_LOG) {
			if (OPEN_DETAIL_LOG) {
				Throwable throwable = new Throwable();
				throwable.fillInStackTrace();
				StackTraceElement[] elements = throwable.getStackTrace();
				Log.v(elements[1].getClassName(),
						"At line : " + elements[1].getLineNumber());
			}
			Log.v(TAG, msg);
		}
	}

	public static void v(String TAG, String msg) {
		if (OPEN_LOG) {
			if (OPEN_DETAIL_LOG) {
				Throwable throwable = new Throwable();
				throwable.fillInStackTrace();
				StackTraceElement[] elements = throwable.getStackTrace();
				Log.v(elements[1].getClassName(),
						"At line : " + elements[1].getLineNumber());
			}
			Log.v(TAG, msg);
		}
	}

	public static void w(String msg) {
		if (OPEN_LOG) {
			if (OPEN_DETAIL_LOG) {
				Throwable throwable = new Throwable();
				throwable.fillInStackTrace();
				StackTraceElement[] elements = throwable.getStackTrace();
				Log.w(elements[1].getClassName(),
						"At line : " + elements[1].getLineNumber());
			}
			Log.w(TAG, msg);
		}
	}

	public static void w(String TAG, String msg) {
		if (OPEN_LOG) {
			if (OPEN_DETAIL_LOG) {
				Throwable throwable = new Throwable();
				throwable.fillInStackTrace();
				StackTraceElement[] elements = throwable.getStackTrace();
				Log.w(elements[1].getClassName(),
						"At line : " + elements[1].getLineNumber());
			}
			Log.w(TAG, msg);
		}
	}
}
