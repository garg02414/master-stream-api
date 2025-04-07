package codingQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class FindLargestLengthWord {

	
	public static void main(String[] args) {
		
		String string = "my name is umang";
		
		String[] words = string.split("\\s+");
		
		String longestLength = Arrays.stream(words).max(Comparator.comparingInt(String::length)).get();
		
		System.out.println("Word with longest length is -> " + longestLength + " and Length is -> " + longestLength.length());
		
	}
}
