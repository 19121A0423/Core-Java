package org.november16;

public class VariableChanging implements Interface{

	public static void main(String[] args) {
		VariableChanging variableChanging = new VariableChanging();
		variableChanging.abstractMethod1();
//		number=7473; //The final field Interface2.number cannot be assigned
		
	}

	@Override
	public void abstractMethod1() {
		System.out.println("Abstract Method");
	}

}
