package com.cts.demos.constructordemo4;

   public class Student   {
    private int roll;
    private String name;

      
/* 
 *   In the example we have gone for both the constructors
 *   1) Without parameter
 *   2) With parameter
 * 
 */
    public Student(int r,String n) {
    	 roll=r;
    	 name=n;
    }
    
    public Student()
    {
    	roll=0;
    	name="no data";
    }
    
    public void displayData()
    {
       System.out.println(roll);
       System.out.println(name);
    }

  }