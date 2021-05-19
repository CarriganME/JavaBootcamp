//Created by: Mike Carrigan
//to: test the Dog class
public class Kennel {

	public static void main(String[] args) {
		Dog d1 = new Dog ("Fido", 5);
		System.out.println(d1.getAge());
		d1.setAge(6);
		System.out.println(d1.getName());
		System.out.println(d1.personAge());
		System.out.println(d1);
	}

}
