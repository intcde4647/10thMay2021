package methodoverloading1;

public class Calculator {
   private int num1;
   private int num2;
   private int num3;
   
   public void add(int num1,int num2,int num3)
   {
	   this.num1=num1;
	   this.num2=num2;
	   this.num3=num3;
	   System.out.println(this.num1+this.num2+this.num3);
   }
  // Return type can be same or different. Based on return type , we don't decide method overloading.
 // Either of methods we have to remove
   
   public  int add()
   {
	   return num1+num2+num3;
   }
   
   public void add(int num1,int num2)
   {
	   this.num1=num1;
	   this.num2=num2;
	   num3=100;
	   System.out.println(this.num1+this.num2+num3);
   }
	/*
	 * public void add() { System.out.println(num1+num2+num3); }
	 */
   
}
