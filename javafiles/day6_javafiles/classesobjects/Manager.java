package classesobjects;

public class Manager extends Emp1{

    int teamSize;
    String mgrType;

    public Manager() {

        System.out.println("classesobjects.Manager constructor called...");
    }


    public Manager(int empId,String empName,double empSal,int teamSize,String mgrType)
    {
        super(empId,empName,empSal);
        this.teamSize = teamSize;
        this.mgrType = mgrType;
        System.out.println("Manger arg-wala constructor called...");

    }

    @Override
    public String toString() {
        return "manager:" +
                super.toString() +
               ", teamSize="+teamSize +
                ", mgrType="+mgrType+
                '}';
    }


}
