package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		
		
		//Ask how many students we want to add
		System.out.println("Enter number of Students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numofStudents = in.nextInt();
		Student[] students = new Student[numofStudents];
		
		//Create n number of new students
		for(int n=0;n<numofStudents;n++) {
			 students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
		}
		
	}

}