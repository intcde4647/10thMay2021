package com.cts.demos.settergetter1;
  public class Employee  {
        private int id;
        private String name;
       
        public void setId(int id)
          {
              id=id;   // Here the id is again be reassigned to the parameter id 
                       // and to the member variable id
          }
        public int getId() {
         
             return id;
         } 
 
        public void setName(String name)
         {
          name=name;
         }

        public String getName(){
          
              return name;
          }            
    
    }    
    
