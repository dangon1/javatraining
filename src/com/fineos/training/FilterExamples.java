package com.fineos.training;

import java.util.ArrayList;
import java.util.List;

public class FilterExamples {
	
	public static void ex01(){
		List<String> names = new ArrayList<>();
		names.add("Daniel");
		names.add("Aaron");
		names.add("Tony");
		
		System.out.println("Old Style: " + findNameOldStyle(names));
		System.out.println("New Style: " + findNameNewStyle(names));
	}

	private static String findNameNewStyle(List<String> names) {
		return names.stream()
				.filter(name -> name.equals("Daniel"))
				.findFirst()
				.orElse(null);
	}

	private static String findNameOldStyle(List<String> names) {
		String wantedName = null;
		for(String name : names){
			if(name.equals("Daniel")){
				wantedName = name;
			}
			break;
		}
		return wantedName;
	}

}
