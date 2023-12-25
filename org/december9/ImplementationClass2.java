package org.december9;

public class ImplementationClass2 {

	
	public static void main(String[] args) {
		
//		CreateInterface sumObj = (value1,value2) -> {
//			return value1+value2;
//		};
//		
//		System.out.println(sumObj.sum(234, 765));
		
		Math math=new Math();
		CreateInterface i = math::add;
		/* double result = */ i.sum(234,765);
//		System.out.println(result);
		
//		CreateInterface i1=Math::diff;
//		double result1 =  i1.sum(999, 333);
//		System.out.println(result1);
		
	}
}
