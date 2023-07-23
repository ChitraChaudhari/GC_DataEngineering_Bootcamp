package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Excercise {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes"); 
		
		System.out.println("Excercise7 : Square every number in the list and find sum of squares");				
		System.out.println(addListOfSquares(numbers));
		
		System.out.println("Excercise8 : Cube every number in list and find sum of cubes");				
		System.out.println(addListOfCubes(numbers));
		
		System.out.println("Excercise9 : Find sum of odd numbers in list");				
		System.out.println(addOddNumbersFromList(numbers));
		
		System.out.println("Excercise10 : Create list with even numbers filtered from the numbers list");	
		List<Integer> evenNumbers = filterEvenNumbers(numbers);
		System.out.println(evenNumbers);
		
		System.out.println("Excercise11 : Create list with lengths of course titles");	
		List<Integer> lengthList = makeListOfLength(courses);
		System.out.println(lengthList);
	}
	
	private static List<Integer> makeListOfLength(List<String> courses) {
		return courses.stream().map(x -> x.length()).collect(Collectors.toList());
	}

	private static List<Integer> filterEvenNumbers(List<Integer> numbers) {
		return numbers.stream()
				.filter(number->number%2==0)
				.collect(Collectors.toList());
	}

	private static int addOddNumbersFromList(List<Integer> numbers) {
		return numbers.stream()
					  .filter(number->number%2!=0)
					  .reduce(0, Integer::sum);
	}

	private static int addListOfCubes(List<Integer> numbers) {
		return numbers.stream()
				      .map(number -> number*number*number)
				      .reduce(0,Integer::sum);
	}

	private static int addListOfSquares(List<Integer> numbers) {
		return numbers.stream().map(number->number*number).reduce(0, Integer::sum);
	}
}
