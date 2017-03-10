package com.testweb;


public class StaticTest
{
	private static class Singleton
	{
		static final StaticTest instance = new StaticTest();
	}

	public static StaticTest getInstance()
	{
		return Singleton.instance;
	}

	public int val()
	{
		return 1;
	}

	// Not accessible from jtwig ?
	public static int staticVal()
	{
		return 1;
	}
}
