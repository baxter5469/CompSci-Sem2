public class DogTester
{
	public static void main(String[] args)
	{
		// create Dog object
		Dog d = new Dog("Collie","Bella");
		System.out.println(d.toString());
		System.out.println();
		ServiceDog d2 = new ServiceDog("Dalmation","john");
		System.out.printf("\nFirst Constructor: %77s",d2.toString());
		ServiceDog d3 = new ServiceDog("Golden Retriever","Bob",5);
		System.out.printf("\nSecond Constructor: %82s",d3.toString());
		d3.addYear(2);
		System.out.printf("\ntoString: %92s",d3.toString());
		System.out.printf("\nAdding 2 years of service: %1d",d3.getYears());
		d3.changeTrainer("Justin");
		System.out.printf("\nChanging trainer name: %10s",d3.getTrainer());
		
	}
}