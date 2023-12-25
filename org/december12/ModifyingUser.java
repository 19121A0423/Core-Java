package org.december12;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ModifyingUser {

	public static void main(String[] args) {
		
		List<User> userList = new ArrayList<User>();

		userList.add(new User("Raji", 20));
		userList.add(new User("Lakshmi", 23));
		userList.add(new User("Krishna", 48));
		userList.add(new User("Devi", 35));
		userList.add(new User("Geetha", 4));
		
		Set<Integer> modifiedAge = userList.stream().map(user -> user.getAge()+5).collect(Collectors.toSet());
		modifiedAge.forEach(user-> System.out.print(user+"  "));
		System.out.println();
		
		int sum=userList.stream().mapToInt(User::getAge).reduce(0,(value1,value2)-> value1+value2);
		System.out.println("Sum of ages : "+sum);
		
	}

}
