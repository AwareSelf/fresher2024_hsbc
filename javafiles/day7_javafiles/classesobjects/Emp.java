package classesobjects;

import java.io.Serializable;

public class Emp implements Serializable {

    private  int empId;
    String empName;
    double empSal;
    protected String role;
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

     public Emp(int empId,String name)
     {
         this(empId,name,1000.0);
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

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
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
