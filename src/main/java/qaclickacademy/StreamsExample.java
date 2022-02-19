package qaclickacademy;

import java.lang.reflect.Array;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.Collections;

import java.util.List;

import java.util.stream.Collectors;

import java.util.stream.Stream;

//import org.apache.poi.util.SystemOutLogger;

import org.testng.annotations.Test;

public class StreamsExample {

	@Test

	public void streamExample()

	{

		Integer[] aa = { 1, 3, 2, 5, 3, 5, 7, 4 };

		String[] s1 = { "Murali" };

		ArrayList<String> array = new ArrayList<String>();

		array.add("kMurali");

		array.add("lManohar");

		array.add("Akhil");

		array.add("Ali");

		array.add("Muralis");

		array.add("kishore");

		array.add("Bhuvana");

		array.add("Navya");

		array.add("Murali Manohar");

		// array.stream().filter(s->s.startsWith("M")).map(s->s.split("
		// ")[0]).forEach(s->System.out.println(s));

		/*
		 * List<String> lts =
		 * array.stream().filter(s->(s.length()>4)).limit(3).sorted().collect(Collectors
		 * .toList());
		 * 
		 * 
		 * 
		 * lts.
		 * 
		 * 
		 * 
		 * lts.stream().forEach(s->System.out.println(s));
		 */

		List<String> li = Arrays.asList(s1);

		// List<String> lit = List.of(s);

		// li.stream().sorted().forEach(s->System.out.println(s));

		// li.stream().filter(s->s.re)

		String input = "dog,cat,bird";

		// Stream<String> stream = input.stream().;

		// stream.forEach(System.out::println);

	}

}
