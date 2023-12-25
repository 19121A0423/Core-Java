package org.december7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DividingEmployees {
	
	public List createEmployeeList() {

		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee("Raji","IT","Banglore"));
		employeeList.add(new Employee("Amrutha","IT","Hyderabad"));
		employeeList.add(new Employee("Sushma","Non-IT","Chennai"));
		employeeList.add(new Employee("Vinay","IT","Banglore"));
		employeeList.add(new Employee("Goutham","Non-IT","Hyderabad"));
		employeeList.add(new Employee("Uday","Non-IT","Banglore"));
		employeeList.add(new Employee("Karthik","IT","Chennai"));
		
//		System.out.println(employeeList);
		
//		employeeList.forEach((e)->{
//			System.out.println(e);
//		});
		
		return employeeList;
		
		
	}
	
	public void divideBasedOnLocation(List<Employee> employeeList) {
		
		Map<String , List<Employee>> locationsMap = new LinkedHashMap<String,List<Employee>>();
		
		List<Employee> locationList = null;
		
		for(Employee employee : employeeList) {
			String location=employee.getLocation();
			if(locationsMap.containsKey(location)) {
				locationList = locationsMap.get(location);
				locationList.add(employee);
				locationsMap.put(location, locationList);
			}
			else {
				locationList = new ArrayList<Employee>();
				locationList.add(employee);
				locationsMap.put(location, locationList);
			}
			
		}
//		System.out.println(locationsMap.size());
//		
//		for(Entry<String, List<Employee>> entry:locationsMap.entrySet()) {
//			System.out.println(entry.getKey()+" - "+entry.getValue());
//		}
		
	}
	
	public void divideEmps(List<Employee> employees) {
		
		Map<String,Map<String,List<Employee>>> employeesMap = new HashMap<String,Map<String,List<Employee>>>();
		
		Map<String,List<Employee>> deptMap = null; 
		List<Employee> employeesList = null;
		
		
		for(Employee employee : employees) {
			String location=employee.getLocation();
			String dept=employee.getDept();
			
			if(employeesMap.containsKey(location)) {
				deptMap = employeesMap.get(location);
				if(deptMap.containsKey(dept)) {
					employeesList = deptMap.get(dept);
					employeesList.add(employee);
					deptMap.put(dept, employeesList);
					employeesMap.put(location, deptMap);
				}
				else {
					employeesList = new ArrayList<Employee>();
					employeesList.add(employee);
					deptMap.put(dept, employeesList);
					employeesMap.put(location, deptMap);
				}
				
			}
			else {
				deptMap = new HashMap<String,List<Employee>>();
				if(deptMap.containsKey(dept)){
					deptMap = employeesMap.get(location);
					employeesList = deptMap.get(dept);
					employeesList.add(employee);
					deptMap.put(dept, employeesList);
					employeesMap.put(location, deptMap);
					
				}
				else {
					employeesList = new ArrayList<Employee>();
					employeesList.add(employee);
					deptMap.put(dept, employeesList);
					employeesMap.put(location, deptMap);
				}
			}
			
		}
		
		for(Entry<String, Map<String, List<Employee>>> locations : employeesMap.entrySet())
		{
			System.out.println("----------------"+locations.getKey()+"-----------------");
			for(Entry<String, List<Employee>>  depts:locations.getValue().entrySet()) {
				System.out.println(depts.getKey());
				for(Employee employee:depts.getValue()) {
					System.out.println(employee);
				}
			}
			System.out.println();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		DividingEmployees dividingEmployees=new DividingEmployees();
		List<Employee> employeesList = dividingEmployees.createEmployeeList();
		dividingEmployees.divideBasedOnLocation(employeesList);
		
		dividingEmployees.divideEmps(employeesList);
	}
	

}
