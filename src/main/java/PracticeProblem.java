/**
 * File: If statements
 * Author: Jacky Lui
 * Date Last Modified: Mar 27, 2026
 */
public class PracticeProblem {

	public static void main(String args[]) {

	}
	
	public static String evenOrOdd(int number) {
		String evenOrOdd ="Odd";
		if ((number%2) == 0) {
			 evenOrOdd = "Even";
		}
		return evenOrOdd;
	      
	}

	public static String teacherOrStudent(String name) {
		String teacherOrStudent = "Student";
		if(name == "Kalisz") {
        teacherOrStudent = "Teacher";
		}
		return teacherOrStudent;
	}

	public static int fartherFromZero(int number) {
		int fartherFromZero = 0;
		if(number > 0) {
			fartherFromZero = (number + 5);
		}
        if(number < 0) {
			fartherFromZero = (number - 5);
		}
		return fartherFromZero;
	}

}
