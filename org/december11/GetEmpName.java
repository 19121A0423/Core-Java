package org.december11;

public class GetEmpName {
	
	public static void main(String[] args) {
		
		GetInterface<Employee> getInterface = Employee::new;
		
		Employee name=getInterface.getObj(1,"Raji",12345);
		
		System.out.println(name.getName());
		
	}

}
