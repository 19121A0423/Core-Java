package org.november23;

public class Engineer extends Person{

	int id;
	String profession="Engineer";
	
	public Engineer(String name,int age,int id) {
		super(name,age);
		this.id=id;
		
	}
	
	public void getProfession() {
		System.out.println(super.profession);
		System.out.println(this.profession);
	}

	@Override
	public String toString() {
		return "Engineer  id=" + id + ", profession=" + profession + ", name=" + name + ", age=" + age ;
	}

}
