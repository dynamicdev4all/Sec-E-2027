package com.app.config;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class SecretReader {
	// this function will only be used if your application has regions (Locales)
	static Locale getLocale(String lang, String country) {
		Locale locale = Locale.of(lang, country);
		return locale;
	}
	
	public static String getSecrets(String key, String lang, String country) {
		ResourceBundle rb = ResourceBundle.getBundle("appSecrets", getLocale(lang, country));
		return rb.getString(key);
	}
	
	static String getDateTime(int style) {
		Date date = new Date();
		DateFormat dtf = DateFormat.getDateInstance(style, getLocale("zh", "CN"));
		return dtf.format(date);
	}
	
	static String ERROR_LOG(String msg) {
		String COLOR = "\u001B[33m";
		return COLOR+getDateTime(0)+ " TYPE : ERROR " + msg;
	}
	
	static void INFO_LOG() {
		
	}

	static void SUCCESS_LOG() {
	
}
	public static void main(String a[]) {
		System.out.println(ERROR_LOG("Invalid Email or Password."));
	}
}
