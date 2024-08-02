package collections;
import java.util.*;

import collections.model.Emp;


public class EmpComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		System.out.println("Emp comparator based on salary called");
		return (int) (o1.getEmpSal() - o2.getEmpSal());
	}

}
