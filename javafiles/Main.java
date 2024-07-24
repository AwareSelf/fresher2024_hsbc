//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Hello and welcome!");

        Main ob; //created a reference of type Main
        ob = new Main(); //instantiate object of type Main and assign it to ob reference
        String s = ob.greetme(); //bcz greetme() is member of Main type you can invoke it on instance of Main
        System.out.println(s);
        int no;

        //greetme();  //cant call nonstatic method from static context (ie static method)


        Emp e;
        e = new Emp();
        //Emp e = new Emp();
        //e.display();
        System.out.println(e);
        Emp e1 = new Emp();
        System.out.println(e1);

        Emp e2;
        e2 = e1;

        Emp x = new Emp(1,"Namrata",5000);
        System.out.println(x); //x.toString();
        System.out.println(x.empName);
        System.out.println(x.computeAnnSal());





    }

    String  greetme()
    {
        return "Hello Everyone!";
    }
}