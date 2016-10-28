package com.anuradha.stringProblem;
import java.lang.*;

public class stringRemove {
	// This function iterates thru each character of the string and it does not match the target character, it is appended to the stringbuilder object
	// I choose stringbuilder because it is mmutable.
	public static String removeCharacterInString(String str, char c){
		StringBuilder temp = new StringBuilder();
		int n = str.length();
		for (int i = 0; i<n; i++) {
		    if(str.charAt(i) != c){
		    	temp.append(str.charAt(i));
		    }
		}
		return temp.toString();
	}
	
	//This function uses the built in function replace
	public static String removeCharacterInStringUsingReplace(String str, char c){
		return str.replace(Character.toString(c), "");
	}
}


