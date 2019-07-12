package com.nick.algorithms.strings;

import java.util.Arrays;

public class StringUtil {

	public String reverseString(String str) {
		char[] reverseStr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			char tmpChar = str.charAt(i);
			reverseStr[str.length() - i - 1] = tmpChar;
		}
		return new String(reverseStr);
	}

	public void replaceSpaces(char[] str, int trueLength) {

		// calculate the number of spaces
		int spaceCount = 0;
		int index;
		int i = 0;
		for (i = 0; i < str.length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}

		index = trueLength + spaceCount * 2;
		if (trueLength < str.length) {
			str[trueLength] = '\0'; // end array
		}

		// replace spaces starting at the end of the array and working backwards
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
	}
	
	public boolean isUnique(String str) {
		// you can't form a unique string with a length greater then 128-character
		// alphabet
		if (str == null || str.length() > 128) {
			return false;
		}

		boolean[] charSet = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (charSet[val] == true) {
				return false;
			}
			charSet[val] = true;
		}
		return true;
	}

	public boolean permutation(String str1, String str2) {

		if (str1 == null || str2 == null) {
			return false;
		}
		if (str1.length() != str2.length()) {
			return false;
		}
		// sort each string and compare
		return sort(str1).equals(sort(str2));
	}
	
	public boolean permutation2(String str1, String str2) {

		if (str1 == null || str2 == null) {
			return false;
		}
		if (str1.length() != str2.length()) {
			return false;
		}
		
		int[] letters = new int[128]; // ASCII
		for (int i = 0; i < str1.length(); i++) {
			letters[str1.charAt(i)]++;
		}
		
		for (int i = 0; i < str2.length(); i++) {
			letters[str2.charAt(i)]--;
			if (letters[str2.charAt(i)] < 0) {
				return false;
			}
		}
		return true;
	}

	public String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
}
