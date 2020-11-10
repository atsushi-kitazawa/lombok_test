package com.example;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BuilderExample {
	public static void main(String[] args) {
		BuilderExample instance = BuilderExample.builder().name("hoge")
				.age(33).email(new Email("hoge@example.com")).build();
		System.out.println(instance);

	}

	private String name;
	private Integer age;
	private Email email;
	
	@Data
	static class Email {
		String address;
		
		public Email(String address) {
			this.address = address;
		}
	}
}
