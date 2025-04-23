package stream;

import java.util.*;
import java.util.stream.Collectors;

public class MapFunctions {

	
	public static void main(String[] args) {
		  List<String> names = Arrays.asList("john", "alice", "boby","eva","alice");
		  // 1. Convert List of Strings to Uppercase
		  System.out.println(names.stream().map(String::toUpperCase).collect(Collectors.toList()));
		  // 2. Convert only the first character to Uppercase
		  System.out.println(names.stream().map(e-> e.substring(0,1).toUpperCase()+e.substring(1).toLowerCase()).collect(Collectors.toList()));
		  // 3. Add a prefix/suffix to each string
		  System.out.println(names.stream().map(e-> "Ms. " + e.substring(0,1).toUpperCase()+e.substring(1)).collect(Collectors.toList()));
		  // 4. Get length of each string
		  System.out.println(names.stream().map(String::length).collect(Collectors.toList()));
		  // 5. Convert each string to its first character
		  System.out.println(names.stream().map(e->e.substring(0,1).toUpperCase()).collect(Collectors.toList()));
		  // 6. Filter + Map: Convert only strings with length > 3 to uppercase
		  System.out.println(names.stream().filter(e->e.length()>3).map(String::toUpperCase).collect(Collectors.toList()));
		  // 7. Sort a list of strings in reverse and then convert to uppercase
		  System.out.println(names.stream().sorted(Comparator.reverseOrder()).map(String::toUpperCase).collect(Collectors.toList()));
		  // 8. Remove duplicates and convert to lowercase
		  System.out.println(names.stream().distinct().map(String::toLowerCase).collect(Collectors.toList()));
		  // 9. Count number of strings with a certain prefix
		  System.out.println(names.stream().map(e-> "count: "+e.length()).collect(Collectors.toList()));
	}
}
