package com.cts.demos.constructordemo2;

   public class Student   {
    private int roll;
    private String name;

      
// Constructors are having the same name as that of the class name
// In our case as the class name is Student , constructor is also
// named as Student
// Constructors are basically a method.   
// Constructors are used to initialise objects.
// Constructors don't any have return type       
// Constructors are of two type , one is default constructor
 //  ( The constructor which is provided when we don't write our own 
  //  constructor and it won't be having any parameters.We can write this
   // parameterless constructor in our code , then the constructor which
   // is defined by us will be called)
// We can have parameterized constructor also.
    public Student() {
    	 roll=1;
    	 name="CTS";
    }
    
    public void displayData()
    {
       System.out.println(roll);
       System.out.println(name);
    }

  }