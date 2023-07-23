package programming;

import java.util.List;

public class FP01Excercises {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes"); 
		
		System.out.println("Excercise1 : Print Only odd nubers from List");
		printOddNumberFromList(numbers);
		System.out.println("Excercise2 : Print all courses individually");
		printAllCourses(courses);
		System.out.println("Excercise3 : Print courses containing word Spring");
		printAllCoursesWithSpring(courses);
		System.out.println("Excercise4 : Print courses whose name has atleast 4 letters");
		printAllCoursesWith4Letters(courses);
		System.out.println("Excercise5 : Print the cube of odd numbers");
		printCubeOfOddNumbers(numbers);
		System.out.println("Excercise6 : Print the number of characters in each course name");
		printNumOfCharForEachCourse(courses);
	}

	private static void printNumOfCharForEachCourse(List<String> courses) {
		courses.stream().map(course->course.length()).forEach(System.out::println);
	}

	private static void printCubeOfOddNumbers(List<Integer> numbers) {
		numbers.stream()
			   .filter(number->number%2!=0)
			   .map(number->number*number*number)
			   .forEach(System.out::println);
	}

	private static void printAllCoursesWith4Letters(List<String> courses) {
		courses.stream().filter(course->course.length()>=4).forEach(System.out::println);
	}

	private static void printAllCoursesWithSpring(List<String> courses) {
		courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
	}

	private static void printAllCourses(List<String> courses) {
		courses.stream().forEach(System.out::println);
	}

	private static void printOddNumberFromList(List<Integer> numbers) {
		numbers.stream().filter(number->number%2!=0).forEach(System.out::println);
	}

}
