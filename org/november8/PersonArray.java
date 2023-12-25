package org.november8;

import org.november6.Person;

public class PersonArray {

	public Person[] createPersonArray() {
		Person[] personArray = new Person[4];

		Person person1 = new Person();
		person1.setName("Rajeswari");
		person1.setPhone(9390145041l);
		personArray[0]=person1;

		Person person2 = new Person();
		person2.setName("Lakshmi");
		person2.setPhone(7569634257l);
		personArray[1]=person2;

		Person person3 = new Person();
		person3.setName("Krishna");
		person3.setPhone(9492772382l);
		personArray[2]=person3;

		Person person4 = new Person();
		person4.setName("Rajeswari");
		person4.setPhone(9390145041l);
		personArray[3]=person4;
		
		return personArray;
		//return new Person[] {person1,person2,person3,person4};
	}

	public static void main(String[] args) {
		PersonArray personArray=new PersonArray();
		
		Person persons[]=personArray.createPersonArray();
		System.out.println(persons);
		
		System.out.println(persons[0]);
		System.out.println(persons[1]);
		System.out.println(persons[2]);
	}

}
