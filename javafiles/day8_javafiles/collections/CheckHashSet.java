package collections;
import java.util.*;

import collections.model.Course;

public class CheckHashSet  {
	
	public static void main(String[] args) {
		Set<Student> s = new HashSet<Student>();
		
		s.add(new Student(1, "Raj", new Course(10, "Science")));
		s.add(new Student(2, "Ram", new Course(11, "Commerce")));
		s.add(new Student(3, "Shyam", new Course(12, "Physics")));
		s.add(new Student(4, "Cheenu", new Course(12, "Physics")));
		s.add(new Student(5, "Raju", new Course(10, "Science")));
		s.add(new Student(6, "Ramu", new Course(11, "Commerce")));
		s.add(new Student(1, "Raj", new Course(10, "Science")));
		
		
		
		TreeSet<Student> t = new TreeSet<Student>();
		
		t.add(new Student(1, "Raj", new Course(10, "Science")));
		t.add(new Student(2, "Ram", new Course(11, "Commerce")));
		t.add(new Student(3, "Shyam", new Course(12, "Physics")));
		t.add(new Student(4, "Cheenu", new Course(12, "Physics")));
		t.add(new Student(5, "Raju", new Course(10, "Science")));
		t.add(new Student(6, "Ramu", new Course(11, "Commerce")));
		t.add(new Student(1, "Raj", new Course(10, "Science")));
		
		System.out.println(t);
		System.out.println(t.contains(new Student(1, "Raj", new Course(10, "Science"))));
		
	

	}

}
