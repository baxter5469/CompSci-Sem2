public class DogTester
{
	public static void main(String[] args)
	{
		// create Dog object
		Dog d = new Dog("Collie","Bella");
		System.out.println(d.toString());
		System.out.println();
		ServiceDog d2 = new ServiceDog("Dalmation","john");
		System.out.println("First Constructor: \n" + d2.toString());
		System.out.println();
		ServiceDog d3 = new ServiceDog("Golden Retriever","Bob",5);
		System.out.println("Second Constructor: \n" + d3.toString());
		d3.addYear(2);
		System.out.println();
		System.out.println("Adding 2 years of service: \n" + d3.toString());
		d3.changeTrainer("Justin");
		System.out.println();
		System.out.println("Changing trainer name: \n" + d3.toString());
	}
}