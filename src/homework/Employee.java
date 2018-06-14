package homework;

public class Employee {
      private String sid;
      private String name;
      private String position;
      private double salary;
      
	public Employee(String sid, String name, String position, double salary) {
		super();
		this.sid = sid;
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}if(getClass()!=obj.getClass()) {
			return false;
		}
		final Employee other = (Employee)obj;
		if(this.sid!=other.sid) {
			return false;
		}if((this.name == null)?(other.name!=null):!this.name.equals(other.name)) {
			return false;
		}if(this.salary != other.salary) {
			return false;
		}if(this.position!=other.position) {
			return false;
		}
		return true;
	}
	@Override
	public int hashCode() {
		int hash = 5;
		hash = 19*hash+(this.name!=null?this.name.hashCode():0);
		hash = (int) (19*hash+(int)(Double.doubleToLongBits(salary))^(Double.doubleToLongBits(salary)>>>32));
        return hash;

	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return  "[sid="+sid+",name="+name+",position="+position+",salary="+salary+"]";
	}
      
}
