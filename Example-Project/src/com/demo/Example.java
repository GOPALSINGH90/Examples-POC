package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Example {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Gopal", "imageGopal1");
		Employee employee2 = new Employee(2, "rahul", "imageRahul1");
		Employee employee3= new Employee(3, "hari", "imageHari1");
		Employee employee4 = new Employee(4, "Ramesh", "imageRamesh1");
		Employee employee5 = new Employee(5, "Suresh", "imageSuresh1");
		
		
		List<Employee> list = new  ArrayList<Employee>();
		list.add(employee5);
		list.add(employee4);
		list.add(employee3);
		list.add(employee2);
		list.add(employee1);
		
		Map<Integer, List<String>> map =  new HashMap<Integer, List<String>>();
		Map<Integer, Employee> map1 = list.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
		
		Employee employee =  map1.get(1);
		Employee employee12 =  map1.get(7);
		System.out.println(employee);
		System.out.println(employee12);
		
	}
}
