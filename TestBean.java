package core.sonata.JavaBean;

public class TestBean {
public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.setEmpId(123);
	e1.setEmpName("Rimpi");
	e1.setEmpSal(2345.67);
	//System.out.println(e1);
	
	Bank b1 = new Bank();
	b1.setaccNo(678);
	b1.setaccName("Goyal");
	b1.setaccBalance(5674);
	System.out.println(b1);
	
}
}
