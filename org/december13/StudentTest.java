package org.december13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentTest {
	
	public static void main(String[] args) {
		
		List<Student> studentsList = new ArrayList<Student>();
		
		studentsList.add(new Student(1,"Raji",'F',"ECE","Proddatur","Kadapa","Andhra Pradesh"));
		studentsList.add(new Student(2,"Swathi",'F',"CSE","Pwd Road","Bangalore","Karnataka"));
		studentsList.add(new Student(3,"Vinay",'M',"ECE","Nandhini layout","Nellore","Andhra Pradesh"));
		studentsList.add(new Student(4,"Goutham",'M',"ECE","Gandhi road","Tirupati","Andhra Pradesh"));
		studentsList.add(new Student(5,"Sushma",'F',"CSE","Badvel","Kadapa","Andhra Pradesh"));
		studentsList.add(new Student(6,"Karthik",'M',"CSE","Indira Nagar","Madras","Tamil Nadu"));
		studentsList.add(new Student(7,"Amrutha",'F',"Mech","KK nagar","Madras","Tamil Nadu"));
		studentsList.add(new Student(8,"Sowmya",'F',"ECE","Martahalli","Bangalore","Karnataka"));
		studentsList.add(new Student(9,"Uday",'M',"Mech","Electronic City","Bangalore","Karnataka"));
		studentsList.add(new Student(10,"Vijay",'M',"IT","WhiteField","Kochi","Kerala"));
		studentsList.add(new Student(11,"Uma",'F',"ECE","Hopefarm","Kottaya","Kerala"));
		studentsList.add(new Student(12,"Krishna",'M',"Mech","BTM layout","Bangalore","Karnataka"));
		
//		studentsList.stream().sorted(Comparator.comparing(Student::getName).reversed());
		
//		studentsList.stream().forEach(e->System.out.println(e));
//		System.out.println();
		studentsList.stream().parallel().forEach(e->System.out.println(e));
		
//		System.out.println("---------------Student names---------------");
//		studentsList.stream().map(Student::getName)
//				/* .collect(Collectors.toList()) */.forEach(name -> System.out.print(name+"  "));;
//		System.out.println();
//		
//		System.out.println("---------------Count of Male and Female students---------------");
//		studentsList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting())).entrySet().forEach(student->System.out.println(student.getKey() +"  -  "+student.getValue()));
//		
//		System.out.println("---------------CSE department list---------------");
//		studentsList.stream().filter(student -> student.getDepartment().equals("CSE")).collect(Collectors.toList()).forEach(student -> System.out.println(student));
//		
//		System.out.println("---------------Students catagerozied by departments---------------");
//		studentsList.stream().collect(Collectors.groupingBy(Student::getDepartment)).entrySet().forEach(entry -> {
//			System.out.println("Department - "+entry.getKey());
//			entry.getValue().forEach(student -> System.out.println(student.getName()));
//		});
//		
//		System.out.println("---------------Mech Female Students---------------");
//		studentsList.stream().filter(student -> student.getDepartment().equals("Mech") && student.getGender()=='F').collect(Collectors.toList()).forEach(student -> System.out.println(student));
//		System.out.println();
//		
//		System.out.println("---------------Count of cities on each State---------------");
//		studentsList.stream().collect(Collectors.groupingBy(Student::getState)).entrySet().forEach(entry -> {
//			System.out.println("State : "+entry.getKey());
//			entry.getValue().stream().collect(Collectors.groupingBy(Student::getCity , Collectors.counting())).entrySet().forEach(city -> {
//				System.out.println(city.getKey()+" - "+city.getValue());
//			});
//		});
		
//		studentsList.stream().collect(Collectors.groupingBy(Student::getState,Collectors.groupingBy(Student::getCity,Collectors.counting()))).entrySet().forEach(entry -> {
//		System.out.println(entry.getKey());
//		entry.getValue().entrySet().forEach(city -> System.out.println(city.getKey()+" - "+city.getValue()));
//		});
	}

}
