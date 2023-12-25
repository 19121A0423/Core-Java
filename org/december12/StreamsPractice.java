package org.december12;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {
	
	public static void main(String[] args) {
		
		List<User> userList = new ArrayList<User>();
		
		userList.add(new User("Vinay",21));
		userList.add(new User("Kiran",30));
		userList.add(new User("Krishna",37));
		userList.add(new User("Ramu",42));
		userList.add(new User("Karthik",24));
		userList.add(new User("Uday",20));
		userList.add(new User("Goutham",26));
		userList.add(new User("Ramu",20));
		
		long count =userList.stream().count();
//		System.out.println(count);
		System.out.println();
		
		Stream<User> s = userList.stream();
		s.forEach(user -> System.out.println(user));
//		System.out.println(s.filter(user -> user.getAge()%2==0));  //java.lang.IllegalStateException: stream has already been operated upon or closed
		
		
		userList.stream().distinct().collect(Collectors.toList()).forEach(u-> System.out.println(u));
		System.out.println();
		
		List<String> usersAge=userList.stream().map(u -> u.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println(usersAge);
		System.out.println();
		
		Optional<User> optional= userList.stream().filter(u -> u.getName().equals("Ramu")).findAny();
		System.out.println(optional.isPresent()?optional.get():"Element not found");
		System.out.println();
		
		System.out.println("------------Sorted List-------------");
		List<User> sortList=userList.stream().sorted().collect(Collectors.toList());
		sortList.forEach(user -> System.out.println(user));
		
		System.out.println();
		List<User> sortList1=userList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		sortList1.forEach(user -> System.out.println(user));
		
		System.out.println();
		List<User> sortList2=userList.stream().sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());
		sortList2.forEach(user -> System.out.println(user));
		System.out.println();

	}

}
