package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
    	words.add("Hello");
    	words.add("Kind!");
		words.add("World!");
    	// List.of("Hello", "Kind", "World!");
        words.forEach(System.out::println);
	}
}
