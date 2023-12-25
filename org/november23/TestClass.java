package org.november23;

import org.junit.Test;

public class TestClass {

	@Test
	public void testStudent() {
		
		Student student1=new Student("Rajeswari");

		System.out.println("Student1 name : "+student1.name);
		
		Student student2=new Student();
		System.out.println("Student2 name : "+student2.name);
		
		Student student3=new Student("Sushma");
		System.out.println("Student3 name : "+student3.name);
		
		Student student4=new Student("Amrutha");
		System.out.println("Student4 name : "+student4.name);
		
		System.out.println();
	}
	
	@Test
	public void testperson() {
		Person person1=new Engineer("Krishna",40,423);
		System.out.println(person1);
//		System.out.println(person1.getProfession());	//The method getProfession() is undefined for the type Person
		Engineer person=(Engineer)person1;
		person.getProfession();
		
		
		Person person2=new Person("Uma",35);
		System.out.println(person2);
		
		System.out.println();
		
	}
	
	@Test
	public void testForm() {
		Form form1=new Form("Geetha",87958365370l,"hjdjeh");
		System.out.println(form1);
		
		Form form2=new Form("Lakshmi",7569634257l,"hjdsd");
//		System.out.println(form1);
		System.out.println(form2);
		
		System.out.println();
		
	}
	
}
