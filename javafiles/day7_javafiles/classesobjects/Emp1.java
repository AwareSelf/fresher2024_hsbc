package classesobjects;

public class Emp1 {
    private  int empId;
    private String empName;
    private double empSal;
    static int ct =0 ;

    public Emp1() {

        System.out.println("classesobjects.Emp1 constructor called...");
    }

    public Emp1(int empId, String empName, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
        System.out.println("classesobjects.Emp1 arg-wala constructor called...");
    }

    //copy constructor
    public Emp1(Emp1 x)
    {
        //exact copy of x
        this.empId = x.empId;
        this.empName = x.empName;
        this.empSal = x.empSal;

    }


    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSal() {
        return empSal;
    }

    public static int getCt() {
        return ct;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSal(double empSal) {
      if(empSal>0) {
          this.empSal = empSal;
      }
      else
      {
          System.out.println("emp salary should be greater than 0");
      }
    }

    public static void setCt(int ct) {
        Emp1.ct = ct;
    }

    public double computeAnnSal()
    {
        return this.empSal*12;
    }

    //overloaded method
    public double computeAnnSal(double bonus)
    {
        return this.empSal*12 + bonus;
    }



    @Override
    public String toString() {
        return "classesobjects.Emp1{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                '}';
    }
}
