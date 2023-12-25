package org.november.solid;

//File management class handling multiple responsibilities
class FileManager {
 public void readFile(String fileName) {
	 System.out.println("ReadFile");
 }

 public void writeFile(String fileName, String data) {
	 System.out.println("WriteFile");
 }

 public void manipulateFile(String fileName) {
	 System.out.println("ManipulateFile");
 }
}



class FileReader {
    public void readFile(String fileName) {
    	System.out.println("ReadFile");
    }
}

class FileWriter {
    public void writeFile(String fileName, String data) {
    	System.out.println("WriteFile");
    }
}

class FileManipulator {
    public void manipulateFile(String fileName) {
    	System.out.println("ManipulateFile");
    }
}
