package com.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	public static void main(String[] args) {
		
		String phonenumber = "123--456-8987";
		String regex = "([0-9]{3})?[-.\\s].*([0-9]{3})[-.\\s]?([0-9]{4})$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		    Matcher matcher = pattern.matcher(phonenumber);
		    System.out.println(phonenumber +" : "+ matcher.matches());
		
		
	}

}
