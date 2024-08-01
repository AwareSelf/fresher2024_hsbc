package containmentex;


import java.io.Serializable;

public class Emp implements Serializable {
    private  int empId;
    private String empName;
    private double empSal;
    transient private Dept empdep;

    static int ct =0 ;


    public Emp(int empId, String empName, double empSal, Dept empdep) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
        this.empdep = empdep;
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

    public Dept getEmpdep() {
        return empdep;
    }

    public void setEmpdep(Dept empdep) {
        this.empdep = empdep;
    }

    public static void setCt(int ct) {
        Emp.ct = ct;
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
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                ", empdep=" + empdep +
                '}';
    }
}
