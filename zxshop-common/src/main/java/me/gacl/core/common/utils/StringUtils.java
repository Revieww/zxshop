package me.gacl.core.common.utils;

public class StringUtils {

	public static boolean isBlank(Object string){
		if(string == null ||  String.valueOf(string).trim().equals("")){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isNotBlank(Object string){
		return !isBlank(string);
	}
}
