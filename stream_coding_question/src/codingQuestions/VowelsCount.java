package codingQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class VowelsCount {

	public static void main(String[] args) {
		
		String str = "I am learning Stream api";
		
		Arrays.stream(str.split(" ")).filter(x-> x.replaceAll("[^aeiouAEIOU]", "")
				.length()==2).forEach(System.out::println);
		
		String str2 = "aabbcdeeefggggh";
		Map<Object, Long> copy1 =  Arrays.stream(str2.split("")).collect(Collectors.groupingBy(x->x, Collectors.counting()));
		System.out.println(copy1);
	}
	

}
