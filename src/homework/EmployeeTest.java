package homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {

	public static void main(String[] args) {
	List<Employee> list = new ArrayList<Employee>();
	Set<Employee> sixsixsix = new TreeSet<Employee>(new EmployeeTreeTest());
	list.add(new Employee("one", "redcat", "industry", 5000));
	list.add(new Employee("two", "bluerabbit", "industry", 9000));
	list.add(new Employee("three", "shuke", "industry", 7000));
	list.add(new Employee("four", "beita", "industry", 6000));
	list.add(new Employee("five", "deideidei", "industry", 7000));
	for(Iterator<Employee> it = list.iterator();it.hasNext();) {
		Employee str = it.next();
		System.out.println(str);
	}
	sixsixsix.add(new Employee("one", "redcat", "industry", 5000));
	sixsixsix.add(new Employee("two", "bluerabbit", "industry", 9000));
	sixsixsix.add(new Employee("three", "shuke", "industry", 8000));
	sixsixsix.add(new Employee("four", "beita", "industry", 6000));
	sixsixsix.add(new Employee("five", "deideidei", "industry", 7000));
	for(Employee e:sixsixsix) {
		System.out.println(e);
	}
	
    
    
    
	}

}
