package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tutionBalance=0;
	private static int costOfCourse=600;
	private static int id=1000;
	
	//Constructor with prompt user to enter name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name");
		this.firstName = in.nextLine();
		
		
		System.out.println("Enter studnet last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshmen\n2 - For Sophomore\n3 - Junior\n4 - Senior\n Enter student class level");
		this.gradeYear = in.nextInt();
		
		
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName+ " " + gradeYear+" "+ studentID);
	}
	
	
	//generate 5 digit unique ID
	
	private void setStudentID() {
		//Grade level + static id
		id++;
		this.studentID = gradeYear+""+id;
	}
	
	//enroll in courses
	
	public void enroll() {
		//Get in a loop , until user hits Q
		do {
			System.out.println("Enter a course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			
			if(!course.equals("Q") && !course.equals("q")) {
				courses = courses + "\n" + course;
				tutionBalance = tutionBalance + costOfCourse;
			}
			else {break;}
		}while(1!=0);	
		
		
	}
	
	//View balance 
	public void viewBalance() {
		System.out.println("Your tution balance is: $"+ tutionBalance);
	}
	
	//pay tuition fee
	
	public void payTuition() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the amount you wish to pay");
		int payment = in.nextInt();
		tutionBalance -= payment;
		System.out.println("Thanks for your payment of: $"+payment);
		viewBalance();
	}
	
	
	
	//Print show status info for the student
	public String showInfo() {
		return "Name: "+firstName+" "+lastName+
				"\nGrade Level: "+gradeYear+
				"\nStudentID:-"+studentID+
				"\nCourses Enrolled: "+courses+
				"\nBalance is: "+tutionBalance;
	}
	
	
}