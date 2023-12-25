package org.december14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.december13.Student;

public class TestStudent {

	public static void main(String[] args) {

		List<Student> studentsList = new ArrayList<Student>();

		studentsList.add(new Student(1, "Raji", 'F', "ECE", "Proddatur", "Kadapa", "Andhra Pradesh"));
		studentsList.add(new Student(2, "Swathi", 'F', "CSE", "Pwd Road", "Bangalore", "Karnataka"));
		studentsList.add(new Student(3, "Vinay", 'M', "ECE", "Nandhini layout", "Nellore", "Andhra Pradesh"));
		studentsList.add(new Student(4, "Goutham", 'M', "ECE", "Gandhi road", "Tirupati", "Andhra Pradesh"));
		studentsList.add(new Student(5, "Sushma", 'F', "CSE", "Badvel", "Kadapa", "Andhra Pradesh"));
		studentsList.add(new Student(6, "Karthik", 'M', "CSE", "Indira Nagar", "Madras", "Tamil Nadu"));
		studentsList.add(new Student(7, "Amrutha", 'F', "Mech", "KK nagar", "Madras", "Tamil Nadu"));
		studentsList.add(new Student(8, "Sowmya", 'F', "ECE", "Martahalli", "Bangalore", "Karnataka"));
		studentsList.add(new Student(9, "Uday", 'M', "Mech", "Electronic City", "Bangalore", "Karnataka"));
		studentsList.add(new Student(10, "Vijay", 'M', "IT", "WhiteField", "Kochi", "Kerala"));
		studentsList.add(new Student(11, "Uma", 'F', "ECE", "Hopefarm", "Kottaya", "Kerala"));
		studentsList.add(new Student(12, "Krishna", 'M', "Mech", "BTM layout", "Bangalore", "Karnataka"));

		Comparator<Student> compName = (student1,student2)->{
			if(student1.getName().length() > student2.getName().length()) {
				return 1;
			}
			else if(student1.getName().length() < student2.getName().length()) {
				return -1;
			}
//			return 0;
			return student1.getName().compareTo(student2.getName());
		};
		
		
//		studentsList.stream().sorted(compName).forEach(student -> System.out.println(student));
		
		List<Student> maleStudWithJ = studentsList.stream().filter(student -> student.getGender()=='M' && student.getName().startsWith("J")).collect(Collectors.toList());
//		if(maleStudWithJ.size()==0) {
//			System.out.println("No male student names starting with J");
//		}
//		else {
//			maleStudWithJ.forEach(student -> System.out.println(student));
//		}
		
		
		
	}

}
