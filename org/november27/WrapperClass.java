package org.november27;

public class WrapperClass implements Wrapper{
	
	//program3
	@Override
	public void stringToPrimitive() {
		float value1 = Float.parseFloat("73628.687f");
		long value2 = Long.parseLong("1011",2);
		boolean value3 = Boolean.parseBoolean("true");
//		char value4 = Character.parseCharacter("b");	//The method parseCharacter(String) is undefined for the type Character
		
		System.out.println("--------String to primitive--------");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		

	}
	
	//program4 and program5
	@Override
	public void checkIntegerOrNot() {
		String value = "574";
		if(isNumber(value)) {
			System.out.println(value + " is number");
		}
		else {
			System.out.println(value + " is string");
		}
		
//		int intValue = Integer.parseInt("jdns");
	}
	
	//program6
	@Override
	public void wrapperMethods() {
		Boolean value1 = Boolean.valueOf("jhdhj");
		Integer value2 = Integer.valueOf(638476);
		Integer value3 = Integer.valueOf("10",2);
		
		float value4 = Float.parseFloat("73628.687f");
		long value5 = Long.parseLong("1011",2);
		boolean b = Boolean.parseBoolean("true");
		
//		Long value = value5.doubleValue();	//Cannot invoke doubleValue() on the primitive type long
		Integer temp=7865456;
		Double value6 = temp.doubleValue();
		
		Integer value7 = new Integer(10); 	//toString() method to convert the Wrapper object or primitive to String
        String svalue = value7.toString(); 
//      String cvalue = Character.toString('a'); 
        String value8 = Long.toString(6,2);   //toString() method to convert primitive to specified radix String.
		
		System.out.println("valuOf method : "+value1);
		System.out.println("valuOf method : "+value2);
		System.out.println("valueOf method : "+value3);
		System.out.println("parseXXX method : "+value4);
		System.out.println("parseXXX method : "+value5);
		System.out.println("XXXXValue method : "+value6);
		System.out.println("toString method : "+svalue);
		System.out.println("toString method : "+value8);
		
		
	}
	
	//program7
	@Override
	public void boxing() {
		byte bvalue = 100;
		short svalue = 300;
		char cvalue = 'h';
		
		Character value1 = new Character(cvalue);
		Short value2 = new Short(svalue);
		Byte value3 = new Byte(bvalue);
		
		Float value4 = new Float(755.856f);
		Boolean value5 = false;
		
		System.out.println("----------Boxing-----------");
		System.out.println("Primitive byte value : "+bvalue+"  -------->  Wrapper Byte value : "+value1);
		System.out.println("Primitive short value : "+svalue+" --------> Wrapper Short value : "+value2);
		System.out.println("Primitive character value : "+cvalue+" --------> Wrapper Character value : "+value3);
		System.out.println("Primitive boolean value : "+false+" --------> Wrapper Boolean value : "+value5);
		System.out.println("Primitive float value : "+755.856f+" --------> Wrapper Float value : "+value4);
		
	}
	
	//program7
	@Override
	public void unBoxing() {
		Integer ivalue = new Integer(6478524);
		Long lvalue = new Long(6548765697l);
		Double dvalue = 758765.987;
		
		int value1 = ivalue;
		long value2 = lvalue;
		double value3 = dvalue;
		
		System.out.println(Byte.BYTES);
		
		System.out.println("----------UnBoxing-----------");
		System.out.println("Wrapper Integer value : "+755.856f+" --------> Primitive int value : "+value1);
		System.out.println("Wrapper Long value : "+755.856f+" --------> Primitive long value : "+value1);
		System.out.println("Wrapper Double value : "+755.856f+" --------> Primitive double value : "+value1);
	}
	
	public boolean isNumber(String input) {
		try {
			Double.parseDouble(input);
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
		
		
		
	}
	
}
