package org.november10;

import java.util.Scanner;

public class MarksProgram {
	
	public void findMaxMarks(int[] marks) {
		int maxMarks=marks[0];
		for(int index=0;index<marks.length;index++) {
			if(maxMarks<marks[index]) {
				maxMarks=marks[index];
			}
		}
		System.out.println("Maximum marks: "+maxMarks);
	}
	
	public void findMinMarks(int[] marks) {
		int minMarks=marks[0];
		for(int index=0;index<marks.length;index++) {
			if(minMarks>marks[index]) {
				minMarks=marks[index];
			}
		}
		System.out.println("Minimum marks: "+minMarks);
	}
	
	public void findAvgMarks(int[] marks) {
		int totalMarks=0;
		for(int index=0;index<marks.length;index++) {
			totalMarks+=marks[index];
		}
		float avgMarks=totalMarks/(float)marks.length;
		System.out.println("Maximum marks: "+avgMarks);
		findingGrade(avgMarks);
	}
	
	public void findingGrade(float percentage) {
		if(percentage>80)
		{
			System.out.println("Distinction");
		}
		else if (percentage>=60 && percentage<=79)
		{
			System.out.println("First class");
		}
		else if (percentage>=40 && percentage<=59)
		{
			System.out.println("Second Class");
		}
		else
		{
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MarksProgram marksProgram=new MarksProgram();
		System.out.println("enter maths marks");
		int maths=scanner.nextInt();
		System.out.println("enter physics marks");
		int physics=scanner.nextInt();
		System.out.println("enter chemistry marks");
		int chemistry=scanner.nextInt();
		System.out.println("enter english marks");
		int english=scanner.nextInt();
		System.out.println("enter hindi marks");
		int hindi=scanner.nextInt();
		
		int []marks= {maths,physics,chemistry,english,hindi};
		
		marksProgram.findMaxMarks(marks);
		marksProgram.findMinMarks(marks);
		marksProgram.findAvgMarks(marks);
		
	}

}
