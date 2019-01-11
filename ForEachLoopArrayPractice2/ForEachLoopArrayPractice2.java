// Below each comment, add the code indicated.  I already have code to display a description of each item in the output.

public class ForEachLoopArrayPractice2
{
	public static void main(String[] args)
	{
		// Declare and initialize array variable "intArray" to hold the values: 5,3,12,9,7
		int[] intArray = {5,3,12,9,7};


		// Display intArray using a for-each loop
		for (int i : intArray){
			System.out.println(i);
		}
		System.out.println("\n*******************************************************");
		System.out.println("intArray displayed using for each loop loop\n");



		// Sum of the elements of intArray is calculated and displayed using a for-each loop
		int totalArray = 0;
		for (int i : intArray){
			totalArray += totalArray + i;
		}
		System.out.println(totalArray);
		System.out.println("\n*******************************************************");
		System.out.println("Sum of the elements of intArray\n");



		// Count the number of elements in intArray that are between 5 and 10, inclusive.  Display the result: ___ elements are between 5 and 10
		int num510Count = 0;
		for (int i : intArray){
			if (i > 4 && i < 11){
				num510Count++;
			}
		}
		System.out.println(num510Count);
		System.out.println("\n***********************************************************");
		System.out.println("Counting number of items between 5 and 10.\n");



		// Search intArrayList for the number 7 using a for-each loop. Display "7 was found" or "7 was not found"
		int no7Count = 0;
		boolean foundSeven = false;
		for (int i : intArray){
			if (i == 7){
				foundSeven = true;
			}
			else {
				no7Count++;
			}
		}
		if (no7Count == intArray.length){
			System.out.print("No 7 was not found");
		}
		if (foundSeven == true){
			System.out.print("7 was found!");
		}
		System.out.println("\n***********************************************************");
		System.out.println("Search intArray for the number 7 using a for-each loop.\n");
		

		// Declare and initialize array variable "words" to hold the values: "keys", "camera", "vacation", "magic", "minivan"
		String[] arrayWords = {"keys","camera","vacation","magic","minivan"};


		// Display words using a for-each loop
		for (String i : arrayWords){
			System.out.println(i);
		}
		System.out.println("\n*******************************************************");
		System.out.println("words displayed using for each loop loop\n");



		// Length of each element of words is displayed
		for (String i : arrayWords){
			System.out.println(i.length());
		}
		System.out.println("\n*******************************************************");
		System.out.println("Length of each element of words is: \n");



		/* Count and display each element in words that start with "m".  Display the result.
		   For example, the output might be:
		   magic
		   minivan
		   2 words start with m
		*/
		int mCounter = 0;
		for (String i : arrayWords){
			i = i.toLowerCase();
			if (i.charAt(0) == 'm'){
				System.out.println(i);
				mCounter++;
			}
		}
		System.out.println("\n***********************************************************");
		System.out.println("Words that start with m.\n");

	}
}