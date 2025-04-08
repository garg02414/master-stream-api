package codingQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		
		//remove duplicate in String and print in same order
		String str= "uummaangg";
		
		Arrays.stream(str.split("")).distinct().forEach(System.out::print);
		
		//Find the word that have second highest length.
		
		String str2 = "I am a java developer";
		
		Optional<String> get1= Arrays.stream(str2.split(" ")).sorted(Comparator.comparingInt(String::length).reversed()).skip(1).findFirst();
		System.out.println("\n" + "second word with highest length "+ get1.get());
	}
}
