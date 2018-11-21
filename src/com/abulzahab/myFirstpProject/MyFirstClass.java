package com.abulzahab.myFirstpProject;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.abulzahab.myFirstpProject.users.*;

public class MyFirstClass {

	public static void main(String[] args) throws IOException {
		
		User abood = new User();
		User wael = new User();
		
		abood.setFirstName("Abdulrahman");
		String nameOfAbood = abood.getFirstName() + " "+ abood.getLastName() + " is "+abood.getAge()+ " years old";
		
		BufferedWriter bf = new BufferedWriter(new FileWriter("C:\\Users\\aabulzah\\eclipse-workspace\\MyFirstProject\\src\\com\\abulzahab\\myFirstpProject\\data\\test.txt", true));
		
		bf.append("hello again!!");
		
		bf.close();
		
		
		
		
		/*
		abood.firstName = "Abdulrahaman"; 
		wael.firstName = "Wael"; 
		
		System.out.println(abood.firstName + " and "+ wael.firstName);
		
		*/
	}

}
