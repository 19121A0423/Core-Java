package org.december8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Person {
	private int id;
	private String name;
	private String gender;

	public Person(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	
}

public class Collection_Test {
	public static void main(String[] arg) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "Core", "M"));
		persons.add(new Person(2, "Nuts", "M"));
		persons.add(new Person(3, "Sbr", "F"));
		persons.add(new Person(4, "Rose", "M"));
		persons.add(new Person(5, "Jazz", "F"));
		Map<String, List<Person>> genderMap = new TreeMap<>();
		List<Person> tempPersons = new ArrayList<>();
		for (Person person : persons) {
			if (genderMap.containsKey(person.getGender())) {
				tempPersons = genderMap.get(person.getGender());
			}
			tempPersons.add(person);
			genderMap.put(person.getGender(), tempPersons);
		}
		for (Map.Entry<String, List<Person>> element : genderMap.entrySet()) {
			System.out.println(element.getKey() + " : " + element.getValue());
		}
	}
}
