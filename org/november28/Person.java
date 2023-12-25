package org.november28;

public class Person<T1,T2> {

	private T1 name;
	private T2 phoneno;

	public T1 getName() {
		return name;
	}

	public void setName(T1 name) {
		this.name = name;
	}

	public T2 getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(T2 phoneno) {
		this.phoneno = phoneno;
	}

}
