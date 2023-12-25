package org.december13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

import org.december12.User;

public class Test {

	public static void main(String[] args) {

//		List<User> userList = new ArrayList<User>();

//		userList.add(new User("Vinay", 21));
//		userList.add(new User("Kiran", 30));
//		userList.add(new User("Krishna", 37));
//		userList.add(new User("Ramu", 42));
//		userList.add(new User("Karthik", 24));
//		userList.add(new User("Uday", 20));
//		userList.add(new User("Goutham", 26));
		
//		userList.stream().collect(ArrayList::new , , null)
		
		List<String> alphabets = new ArrayList<String>();
		
		alphabets.add("a");
		alphabets.add("b");
		alphabets.add("c");
		alphabets.add("d");
		alphabets.add("e");
		
//		BiConsumer<StringBuilder , StringBuilder> biconsumer1 = (x,y) -> {
//			System.out.println(x +"  "+y);
//			x.append(y);
//		};
//		
//		BiConsumer<StringBuilder , StringBuilder> biconsumer2 = (x,y) -> {
//			System.out.println(x +"  "+y);
//			x.append(",").append(y);
//		};
		
//		alphabets.stream().collect(StringBuilder::new, (x,y) -> {
//			System.out.println(x +"  "+y);
//			x.append(y);
//		},
//				(x,y) -> {
//			System.err.println(x +"  "+y);
//			x.append(",").append(y);
//		}
//);
		
		alphabets.stream().parallel().collect(StringBuilder::new, (x,y) -> {
			System.out.println(x +"  "+y);
			x.append(y);
		}, (x,y) -> {
			System.err.println(x +"  "+y);
			x.append(",").append(y);
		});
		
//		alphabets.stream().peek(null);
		
	}

}
