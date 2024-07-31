package classesobjects;

public class Main1 {

    public static void main(String[] args) {
     /*
        classesobjects.Emp1 e = new classesobjects.Emp1(1,"Ram",5000);
        System.out.println(e);

       // e.setEmpName("");
        e.setEmpSal(0);
        System.out.println(e);
        double sal = e.computeAnnSal();
        System.out.println(e.getEmpName()+" annual salary (no bonus):"+sal);

        e.setEmpSal(24000);
        classesobjects.Emp1 e2 = new classesobjects.Emp1(e);
        System.out.println(e2);

        classesobjects.Emp1 e3 = new classesobjects.Emp1(3,"Radha",50000);
        sal = e3.computeAnnSal(50000);
        System.out.println(e3.getEmpName()+" annual salary with bonus:"+sal);

    */

        Manager m = new Manager();
        System.out.println(m.getEmpId());

        Manager m1 = new Manager(3,"Geeta",100000,5,"Hr");
        System.out.println(m1.getEmpId());
        System.out.println(m1.computeAnnSal(50000));
        System.out.println(m1);


        meth(new Emp1(1,"Ram",5000));
        meth(m1);

       // classesobjects.Manager mm = new classesobjects.Emp1(); //error => classesobjects.Emp1 is-not-a classesobjects.Manager so assignment is incorrect
        Emp1 ee = new Manager(2,"Anita",50000,10,"Sales"); //no error => classesobjects.Manager is-a classesobjects.Emp1 so assignment is correct
        System.out.println(ee);
    }


    static void meth(Emp1 e)   //classesobjects.Emp1 e = m1
    {
        System.out.println(e); //gets converted to => e.toString()
    }
}
