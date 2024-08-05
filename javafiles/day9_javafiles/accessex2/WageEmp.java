package accessex2;
import classesobjects.Emp;

public class WageEmp extends Emp{
    int totHrs;

    public int getTotHrs() {

        this.role = "WageEmp";//role is protected so visible to derived class in another package
      //  this.empSal = 6000; //empSal is default access and is not visible outside the package
        return totHrs;
    }
}
