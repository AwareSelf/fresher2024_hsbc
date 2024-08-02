package collections;
import java.util.*;
import inheritance.Emp;
public class EmpSalSort implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return (int)(o1.getEmpSal() - o2.getEmpSal());
	
	}

	
	

}
