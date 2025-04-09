package codingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSumOfUniqueElement {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,3,3,5);
		
		Integer sum = list.stream().distinct().collect(Collectors.summingInt(Integer::intValue));
		
		System.out.println(sum);
		
		int[] intt = {1,2,3,4,4};
		int sums = Arrays.stream(intt).distinct().sum();
		
		System.out.println(sums);
	}
}
