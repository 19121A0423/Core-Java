package org.november17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImplementingExceptions implements Exceptions{

	@Override
	public void arrayExceptions() {
		System.out.println("Method started");
		
		// Unchecked Exception
		int []array= {2,4,6,26};
		try {
			int value=array[array.length];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException handled ");
		}
		
		
		
		System.out.println("Method ended");
		System.out.println();
	}
	
	@Override
	public void arithmethicOperations() {
		
		System.out.println("Method started");
		int numerator=83;
		int denominator=0;
		try {
			int result=numerator/denominator;
			System.out.println("Result : "+result);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException handled");
		}
		System.out.println("Method ended");
		System.out.println();
		
	}
	
	@Override
	public void fileOperations() {
		
		System.out.println("Method started");
		
		// Checked Exception
		FileInputStream fileInputStream=null;
		try {
			fileInputStream = new FileInputStream("Demo.txt");
		} 
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException handled");
		}
		catch (FileNotFoundException e) {
			System.out.println("FileNotFoundExceptionException handled");
		}
		catch (IOException e) {
			System.out.println("File is closed");
		}
		finally {
			if(fileInputStream!=null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println("File is closed");
				}
			}
		}
		
		
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("file.txt");
		} 
		catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("FileNotFoundException handled");
		}
		finally {
			if(fileOutputStream!=null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					System.out.println("File is closed");
				}
			}
			
		}
		System.out.println("Method ended");
		System.out.println();
		
	}
	
	@Override
	public void stringExceptions() {
		
		System.out.println("Method Started");
		String name="Rajeswari";
		String name1=null;
		try {
			System.out.println("String : "+name.charAt(9));
		}
		finally {
			System.out.println("Finally block");
			try {
				char character=name1.charAt(9);
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("StringIndexOutOfBoundsException handled");
			}
		}
		
		
		try {
			int length=name1.length();
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException handled");
		}
		
		try {
			char character=name1.charAt(9);
			int length=name1.length();
		}
		catch(RuntimeException e) {
			System.out.println("Runtime Exceptions handled using single catch block");
		}
		System.out.println("Method ended");
		
	}
	
	
	public static void main(String[] args) {
		ImplementingExceptions implementingExceptions=new ImplementingExceptions();
		
		implementingExceptions.arrayExceptions();
		implementingExceptions.arithmethicOperations();
		implementingExceptions.fileOperations();
		implementingExceptions.stringExceptions();
		
		
	}
	
}
