package stream;

import java.util.*;

public class ReduceInMaps {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		int s= nums.stream().reduce(0,(a,b)-> a+b);
		System.out.println("sum "+s);
		//other way
		int s1=nums.stream().reduce(Integer::sum).get();
		System.out.println("sum " +s1);
		//max
		int m=nums.stream().reduce(Integer::max).get();
		System.out.println("max " +m);
		int m1=nums.stream().reduce((a,b)-> a>b ? a:b).get();
		System.out.println("max " +m1);
		//product
		int p=nums.stream().reduce((a,b)->a*b).get();
		System.out.println("max " +p);
		//filter and then find product
		//product
		int p1=nums.stream().filter(f->f%2!=0).reduce((a,b)->a*b).get();
		System.out.println("max " +p1);
		// not reduce fucntion just findig the second highest number
		int m3= nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		int min=nums.stream().distinct().sorted().findFirst().get();
		System.out.println("SECOND HIGHEST " +m3 +" || Minimum " +min);
		int min1= nums.stream().reduce(Integer::min).get();
		System.out.println("minimum "+min1);
	}
}
