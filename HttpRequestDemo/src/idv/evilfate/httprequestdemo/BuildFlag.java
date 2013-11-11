package idv.evilfate.httprequestdemo;

public class BuildFlag {
	/**
	 * Flag that decide if we should print out the log.
	 */
	public static final boolean OPEN_LOG = BuildConfig.DEBUG ? true : false;

	/**
	 * Flag that decide if we want to track Fragment lifecycle.
	 */
	public static final boolean FRAGMENT_STATE_LOG_FLAG = true;

	/**
	 * Flag that decide if we want to track Activity lifecycle.
	 */
	public static final boolean ACTIVITY_STATE_LOG_FLAG = true;
}
