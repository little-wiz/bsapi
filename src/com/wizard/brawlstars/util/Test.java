package com.wizard.brawlstars.util;

import com.google.gson.Gson;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

public class Test {

	@JsonAdapter(UsernameDeserializer.class)
	public int test;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello World\n");
		Test test = new Gson().fromJson("{\"test\":{\"test\":2}}", Test.class);
		System.out.print(test.test);
	}
}
