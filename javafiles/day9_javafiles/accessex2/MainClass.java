package accessex2;

import accessspecifierex.MyClass;
import classesobjects.Emp;

public class MainClass {

    MyClass ob;

    void mymeth() {
        MyClass localvar = new MyClass();
        localvar.meth1();
        // localvar.meth2();

        Emp e = new Emp(1, "Radha", 5000);
        //gives error as protected is not visible outside the package to non-derived class
        // e.role = "MainClass";
    }
}
