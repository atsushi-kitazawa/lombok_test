package com.example;

import lombok.NonNull;

public class NonNullExample {
	public static void main(String[] args) {
		NonNullExample instance = new NonNullExample();
		String ret = instance.hello("hoge");
		System.out.println(ret);

		String ret1 = instance.hello(null);
		System.out.println(ret1);
	}

	private String hello(@NonNull String name) {
		return "hello " + name + " !";
	}
}
