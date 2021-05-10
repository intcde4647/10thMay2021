package methodoverloading2;

public class Calculator {
   private int a;
   private int b;
   private float y;
   private float z;
   
   public void add(int a,int b)
   {
	   this.a=a;
	   this.b=b;
	   System.out.println(this.a+this.b);
   }
   public void add(int a,int b, float y)
   {
	   this.a=a;
	   this.b=b;
	   this.y=y;
	   System.out.println(this.a+this.b+this.y);
   }
   public void add(float y, float z)
   {
	   this.y=y;
	   this.z=z;
       System.out.println(this.y+this.z);
   }
   
}
