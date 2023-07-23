package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
//		printAllNumbersInListFunctional(numbers);
//		printAllEvenNumbersInListFunctional(numbers);
		printSquareOfEvenNumbersInListFunctional(numbers);
	}
	
//	private static void print(int number) {
//		System.out.println(number);
//	}
	
//	private static boolean isEven(int number) {
//		return number%2==0;
//	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//print all numbers in the list
//		numbers.stream().forEach(FP01Functional::print);
		numbers.stream().forEach(System.out::println);
		
	}
	
	private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {
		//print all even numbers in the list
//		numbers.stream()
//			   .filter(FP01Functional::isEven)
//			   .forEach(System.out::println);
		
		//using stream+filter+lambda
		numbers.stream()
		   .filter(number->number%2==0)
		   .forEach(System.out::println);
	}
	
	private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers) {
		//using stream+filter+lambda+map
		numbers.stream()
		   .filter(number->number%2==0)
		   .map(number->number*number)
		   .forEach(System.out::println);
	}
}
