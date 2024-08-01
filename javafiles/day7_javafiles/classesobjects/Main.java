package classesobjects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    int x;

    public static void main(String[] args) {

        Emp.meth();

        System.out.println("Hello and welcome!");

        Main ob; //created a reference of type classesobjects.Main
        ob = new Main(); //instantiate object of type classesobjects.Main and assign it to ob reference
        String s = ob.greetme(); //bcz greetme() is member of classesobjects.Main type you can invoke it on instance of classesobjects.Main
        System.out.println(s);
        int no;

        //greetme();  //cant call nonstatic method from static context (ie static method)


        Emp e;
        e = new Emp();
        //System.out.println(e.empId);
        System.out.println(e.computeAnnSal());
        Emp.meth();
       // System.out.println("emp count:"+e.ct);
        System.out.println("emp count:"+Emp.ct);
        //classesobjects.Emp e = new classesobjects.Emp();
        //e.display();
        System.out.println(e);
        Emp e1 = new Emp();
        System.out.println(e1);
       // System.out.println("emp count:"+e1.ct);
        System.out.println("emp count:"+Emp.ct); //recommended way to use sattic variable classname.static variable

        Emp e2;
        e2 = e1;

        Emp x = new Emp(1,"Namrata",5000);
        System.out.println(x); //x.toString();
        System.out.println(x.empName);
        System.out.println(x.computeAnnSal());

        double d = x.computeAnnSal();
        System.out.println(d);



        {
            int i =4;
            System.out.println(i);
        }

        //i++; //i is local to block so not visible and accessible outside the block scope


        Emp.meth();

    }

    String  greetme()
    {

        return "Hello Everyone!";
    }
}