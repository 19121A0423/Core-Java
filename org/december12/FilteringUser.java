package org.december12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilteringUser {

	public static void main(String[] args) {

		List<User> userList = new ArrayList<User>();

		userList.add(new User("Raji", 20));
		userList.add(new User("Lakshmi", 23));
		userList.add(new User("Krishna", 48));
		userList.add(new User("Devi", 35));
		userList.add(new User("Geetha", 4));
		

//		List<User> ageList = userList.stream().filter(user -> user.getAge() > 20).collect(Collectors.toList());
////		System.out.println(ageList);
//
//		ageList.forEach(user -> System.out.println(user));
//		System.out.println();
//
//		// printing max and min age of users
//		IntSummaryStatistics obj = userList.stream().collect(Collectors.summarizingInt(User::getAge));
//		System.out.println("Minimum Age : " + obj.getMin());
//		System.out.println("Maximum Age : " + obj.getMax());
//		System.out.println();
//		
//		List<User> sortList=userList.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
//		System.out.println("Minimum Age : " + sortList.get(0).getAge());
//		System.out.println("Maximum Age : " + sortList.get(sortList.size()-1).getAge());
//		System.out.println();
//		
//		Comparator<User> compAge=(u1,u2)->{
//			if(u1.getAge()>u2.getAge()) {
//				return -1;
//			}
//			else if(u1.getAge()<u1.getAge()) {
//				return 1;
//			}
//			return 0;
//		};
//		List<User> sortList1=userList.stream().sorted(compAge).collect(Collectors.toList());
//		System.out.println("Minimum Age : " + sortList1.get(0).getAge());
//		System.out.println("Maximum Age : " + sortList1.get(sortList.size()-1).getAge());
//		
//		System.out.println(userList.stream().min(compAge).get().getAge());
//		System.out.println(userList.stream().max(compAge).get().getAge());
		
		
		
	}

}
