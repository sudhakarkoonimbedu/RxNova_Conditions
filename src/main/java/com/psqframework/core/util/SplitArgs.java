package com.psqframework.core.util;

public class SplitArgs
{
	public String[] splitStrings(String input)
	{
		String[] args = input.split(";");
		return args;
	}
}