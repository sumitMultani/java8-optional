package com.example;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {

		Optional<Object> empty = Optional.empty();
		// System.out.println(empty);

		User user = new User(1, "reddy", "hyderabad");
		// Optional<String> city = Optional.of(user.getCity());

		Optional<String> cityOptional = Optional.ofNullable(user.getCity());
//		if (cityOptional.isPresent()) {
//			System.out.println(cityOptional.get());
//		}

		//System.out.println(cityOptional.orElse("hyd"));
		//System.out.println(cityOptional.orElseThrow(() ->new IllegalArgumentException("city name is not found.")));
	System.out.println(cityOptional.map(String::toUpperCase).orElseGet(() -> "default City"));
	
	}
}
