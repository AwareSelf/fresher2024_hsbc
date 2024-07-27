package classesobjects;

public class Emp {

     int empId;
    String empName;
    double empSal;
   static int ct =0 ;

  /*
    void display()
    {
        System.out.println("classesobjects.Emp details: emp id:"+empId
                          +",emp Name:"+empName
                          +",emp sal:"+empSal);
    }
    */


    public Emp()
    {
        System.out.println("classesobjects.Emp 0 arg constructor called...");
        ct++;
    }

     public Emp(int empId,String name,double sal)
     {
         System.out.println("classesobjects.Emp arg-wala constructor called...");
         ct++;
         this.empId = empId;
        this.empName = name;
        this.empSal = sal;



     }

     static void meth()
     {
         System.out.println("this is static method");
       //  this.empId=7; //this will give compiler error - as static method cant access instance property
         //as instance might not have been created when this method is called...
     }
     public double computeAnnSal()
     {
         return this.empSal*12;
     }


     @Override
     public boolean equals(Object o)//Object o = e3
     {
         System.out.println("Emp's equal method called...");
         return this.empId==((Emp)o).empId;

     }


     public String toString()
     {
         return "classesobjects.Emp details: emp id:"+this.empId
                 +",emp Name:"+this.empName
                 +",emp sal:"+this.empSal;
     }

}
