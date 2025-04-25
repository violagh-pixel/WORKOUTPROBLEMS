package stream;

import java.util.*;
import java.util.stream.Collectors;

public class MapFunctionInteger {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,  312, 333, 244,  212125);

		// 1. Double each element using map()
		System.out.println(numbers.stream().map(e->e+e).collect(Collectors.toList()));
		// 2.  Convert each integer to its square
		System.out.println(numbers.stream().map(e->e*e).collect(Collectors.toList()));
		//Convert each integer to a String with a prefix
		System.out.println(numbers.stream().map(e-> "Items-"+e).collect(Collectors.toList()));
		//Convert each number to boolean: is it even?
		System.out.println(numbers.stream().map(n -> n%2==0).collect(Collectors.toList()));
		//Convert a list of integers into a list of digit counts
		System.out.println(numbers.stream().map(n-> String.valueOf(n).length()).collect(Collectors.toList()));
		//Map numbers to even/odd label
		System.out.println(numbers.stream().map(n-> n%2==0 ? "Even: "+n : "Odd: "+n).collect(Collectors.toList()));

	}
}
