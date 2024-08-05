package collectionsex.mycomparator;

import classesobjects.Emp;

import java.util.Comparator;

public class EmpSalaryComparator implements Comparator<Emp> {
    @Override
    public int compare(Emp o1, Emp o2) {
        System.out.println("Comparator's compare method called to compare emp salaries..");
        return (int)(o1.getEmpSal() - o2.getEmpSal());

        //if you do (int)(o2.getEmpSal()-o1.getEmpSal()) - then it will sort in the
        //descending order of emp salary
    }
}
