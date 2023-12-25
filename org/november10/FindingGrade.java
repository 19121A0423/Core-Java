package org.november10;

import java.util.Scanner;

public class FindingGrade {
	
	public void findingGradeUsingSwitch(float percentage) {
		int percentageDigit = (int) (percentage==100?10:percentage/10);
		switch(percentageDigit) {
		case 10:
		case 9:
		case 8:
			System.out.println("Distinction");
			break;
		case 7:
		case 6:
			System.out.println("First Class");
			break;
		case 5:
		case 4:
			System.out.println("Second Class");
			break;
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Fail");
			break;
		default:
			System.out.println("Incorrect marks");	
		}
	}
	
	public void findingGradeUsingElseIf(float percentage) {
		if(percentage>=80.0)
		{
			System.out.println("Distinction");
		}
		else if (percentage>=60.0 && percentage<=79.9)
		{
			System.out.println("First class");
		}
		else if (percentage>=40.0 && percentage<=59.9)
		{
			System.out.println("Second Class");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	public float findAvgMarks(int[] marks) {
		int totalMarks=0;
		for(int index=0;index<marks.length;index++) {
			totalMarks+=marks[index];
		}
		float avgMarks=totalMarks/(float)marks.length;
		System.out.println(avgMarks);
		return  avgMarks;
	}
	
	public static void main(String[] args) {
		FindingGrade findingGrade = new FindingGrade();
		
		Scanner scanner = new Scanner(System.in);
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
		System.out.println("enter hindi marks");
		int social=scanner.nextInt();
		
		int []marks= {maths,physics,chemistry,english,hindi,social};
		
		float percentage = findingGrade.findAvgMarks(marks);
		findingGrade.findingGradeUsingSwitch(percentage);
		findingGrade.findingGradeUsingElseIf(percentage);
		
	}

}
