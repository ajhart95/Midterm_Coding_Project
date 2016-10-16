package com.cisc181.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PersonException extends Exception{
	private String t;
	public PersonException(String message){
		super(message);
		this.t = t;
	}
}
