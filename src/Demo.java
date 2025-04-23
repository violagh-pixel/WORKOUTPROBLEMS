import java.util.*;
import java.util.stream.Collectors;
class Demo{



	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("as","swq");

		// Find the name of the oldest person
		System.out.println(numbers.stream().map(e->e.substring(0,1).toUpperCase()+e.substring(1)).collect(Collectors.toList()));
	}
}