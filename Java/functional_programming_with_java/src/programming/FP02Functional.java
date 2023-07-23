package programming;

import java.util.Comparator;
import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes"); 
		
//		int sum = addListFunctional(numbers);
//		System.out.println(sum);
		
//		findDistinctElementsFromList(numbers);
//		sortCoursesFromList(courses);
		SortByCourseNameLength(courses);
	}
	
private static void SortByCourseNameLength(List<String> courses) {
		courses.stream().sorted(Comparator.comparing(x->x.length())).forEach(System.out::println);
	}

private static void sortCoursesFromList(List<String> courses) {
//		courses.stream().sorted().forEach(System.out::println);
		courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		//descending order
		courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

private static void findDistinctElementsFromList(List<Integer> numbers) {
		numbers.stream().distinct().forEach(System.out::println);
	}

//	private static int sum(int a, int b) {
//		return a+b;
//	}
	private static int addListFunctional(List<Integer> numbers) {
//		return numbers.stream().reduce(0, FP02Functional::sum);
		return numbers.stream().reduce(0, Integer::sum);
	}
}
