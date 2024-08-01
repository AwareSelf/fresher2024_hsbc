package instanceofex;

public class Emp {
    private int empId;
    private String empName;
    private double sal;

    public Emp(int empId,String empName,double sal) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double computeAnnSal()
    {
        return this.sal * 12;
    }
}

class Manager extends Emp
{
    int teamSize;
    double bonus;

    public Manager(int empId, String empName,double sal,int teamSize, double bonus) {
        super(empId,empName,sal);
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    @Override
    public double computeAnnSal()
    {
        return super.computeAnnSal() + this.bonus;
    }

    public void delegate()
    {
        System.out.println("delegating to team of size:"+this.teamSize);
    }
}


class WageEmp extends Emp
{
    int noOfHrs;
    double dailyWages;

    public WageEmp(int empId, String empName, double sal, int noOfHrs, double dailyWages) {
        super(empId, empName, sal);
        this.noOfHrs = noOfHrs;
        this.dailyWages = dailyWages;
    }
}

class Main
{
    public static void main(String[] args) {
        Manager m = new Manager(2,"Shyam",10000,6,50000);
        m.computeAnnSal();
        m.delegate();



        Emp e = new Manager(1,"Ram",5000,3,10000);

        e.computeAnnSal();
        ((Manager)e).delegate();

        meth(e);
        meth(m);
        meth(new WageEmp(11,"Radha",5000,50,100));

    }


    static public void meth(Emp e)
    {
        e.computeAnnSal();

        if(e instanceof  Manager)
        {
            ((Manager)e).delegate();
        }
    }
}