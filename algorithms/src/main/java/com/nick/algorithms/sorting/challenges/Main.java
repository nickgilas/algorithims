package com.nick.algorithms.sorting.challenges;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        
        // should return false
        System.out.println(checkForPalindrome("hello"));
        
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
    	Stack<Character> stack = new Stack<>();
    	string = string.replaceAll("[^a-zA-Z]", "").toLowerCase().trim();
    	StringBuilder builder = new StringBuilder(); 
    	
    	
    	// create stack
    	for (char c : string.toCharArray()) {
    		stack.push(c);
    		builder.append(c);
    	}
    	
    	String currentOrderString = builder.toString();
    	
    	String reversedString  = builder.reverse().toString();
    	return currentOrderString.equals(reversedString);
    }}
