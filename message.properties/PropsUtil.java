package com.pak;

import java.util.ResourceBundle;

public class PropsUtil {
	public static String getPropertyKey(String key) {
		ResourceBundle rb;
		try {
			rb = ResourceBundle.getBundle("message");
			key = (String) rb.getString(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return key.trim();
	}
}
