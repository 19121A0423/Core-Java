package org.december12;

public class User implements Comparable<User>{

	private String name;
	private int age;

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(User user) {
		if(this.getAge()>user.getAge()) {
			return 1;
		}
		else if(this.getAge()<user.getAge()) {
			return -1;
		}
		return 0;
	}

}
