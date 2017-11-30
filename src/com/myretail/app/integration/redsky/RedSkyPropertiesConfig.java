package com.myretail.app.integration.redsky;

public class RedSkyPropertiesConfig {
	
	// Defaults to this for this project sake.
	private static String serverURL ="http://redsky.target.com/v2/pdp/tcin/";

	// load from properties file or however u like
	public static void intializeConfig(String URL) {
		serverURL = URL;
	}

	public static String getServerURL() {
		return serverURL;
	}
}
