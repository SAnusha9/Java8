package com.anu.java.streamapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("Java");
		list.add("Spring");
		list.add("Services");
		list.add("Cloud");
		for(String s:list) {
			System.out.println(s);
		}
		
		list.stream().forEach(t->System.out.println(t));
		list.stream().filter(t->t.startsWith("S")).forEach(t->System.out.println(t));
		
		Map<Integer, String> map=new HashMap<>();
		map.put(1,"Hello");
		map.put(2, "How");
		map.put(3, "are");
		map.put(4, "you");
		
		map.forEach((key,value)->System.out.println(key+":"+value));
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));
		Consumer<String>consumer=t->System.out.println(t);
		//consumer.accept("Welcome");
		for(String s:list) {
			consumer.accept(s);
		}
	}

}
