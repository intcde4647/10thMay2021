package com.cts.demo;

import java.util.Scanner;

// So we mainly achieve
// encapsulation by declaring 
// the members as private
public class Student {
private int roll;
private String name;
private int marks;

 public void setData()
 {
   Scanner scan=new Scanner(System.in); 
   System.out.println("Enter roll");
   roll=scan.nextInt();
 }
 
  public void dispData()
  {
	  System.out.println("ROLL "+roll);
  }
}
