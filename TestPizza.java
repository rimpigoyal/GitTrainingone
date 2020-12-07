package core.sonata.JavaBean;

public class TestPizza {

	public static void main(String[] args) {
		AddressPizza a1 = new AddressPizza();
		a1.setPhoneNumber(896568798);
		a1.setPincode(646547);
		
		Pizza p1 = new Pizza();
		p1.setPizzaType("veg");
		p1.setPizzaSize("medium");
		p1.setPizzaPrice(400);
		p1.setObj(a1);
		System.out.println(a1)}
}
