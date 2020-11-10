package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class DataExample {
	public static void main(String[] args) {
		DataExample instance = new DataExample();
		instance.setS("hoge");
		instance.setI(100);
		instance.setList(Arrays.asList("aaa", "bbb"));
		instance.setMap(Collections.singletonMap(1, "value"));
		System.out.println(instance);
	}

	private String s;
	private int i;
	private List<String> list;
	private Map<Integer, String> map;
}
