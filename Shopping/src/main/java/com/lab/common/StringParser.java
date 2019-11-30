package com.lab.common;

public class StringParser {
	
	public static boolean isNotEmpty(String str) {
		boolean result = true;
		if(str != null && !"".equals(str)) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
}
