public class Emp {

    int empId;
    String empName;
    double empSal;

  /*
    void display()
    {
        System.out.println("Emp details: emp id:"+empId
                          +",emp Name:"+empName
                          +",emp sal:"+empSal);
    }
    */

    public Emp()
    {
        System.out.println("Emp 0 arg constructor called...");
    }

     public Emp(int empId,String name,double sal)
     {
         System.out.println("Emp arg-wala constructor called...");
         this.empId = empId;
        this.empName = name;
        this.empSal = sal;



     }

     public double computeAnnSal()
     {
         return this.empSal*12;
     }

     public String toString()
     {
         return "Emp details: emp id:"+this.empId
                 +",emp Name:"+this.empName
                 +",emp sal:"+this.empSal;
     }

}
