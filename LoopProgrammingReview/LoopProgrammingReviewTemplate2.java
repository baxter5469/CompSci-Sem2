import java.util.*;

public class LoopProgrammingReviewTemplate2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int progNum = 1;
		{
			System.out.println("*** Program " + progNum + " ***");
			//  add or remove // at start of line
			boolean sCheck = false;
			String answer;

			do
			{
				sCheck = false;
				System.out.print("Enter a string that does not contain the letter s: ");
				answer = input.nextLine();

				for (int i = 0; i < answer.length(); i++){
					if (answer.charAt(i) == 's'){
						sCheck = true;
						System.out.println("S!");
					}
				}
				if (sCheck == true)  //ADD
				{
					System.out.println("Error - string should not contain the letter s\n");
				}
			}while (sCheck == true); //ADD

			System.out.println("Yay - a string with no letter s\n");
			progNum++;
		}



		{
			System.out.println("*** Program " + progNum + " ***");

			boolean numCheck = false;
			int num;

			do
			{
				numCheck = false;
				System.out.print("Enter an int in the range [3,8]: "); //NOTE: When checking your program, be sure to check the boundary/edge cases - particulary the value 3 and 8
				num = input.nextInt();

				if (num <= 2)	//ADD
				{
					System.out.println("Error - number is less than 3\n");
					numCheck = true;
				}
				if (num >= 9)	//ADD
				{
					System.out.println("Error - number is greater than 8\n");
					numCheck = true;
				}
			}while (numCheck == true);//ADD

			System.out.println("Yay: " + num + " is in the range [3,8]\n");
			progNum++;
		}


		{
			System.out.println("*** Program " + progNum + " ***");
			

			int num;				//current number entered by user
			int sum = 0;			//sum of the negative numbers entered
			int numNegatives = 0; 	//number of negative numbers entered


			System.out.println("Please enter four negative numbers below.");
			System.out.println("The sum of the negative numbers will be calculated and displayed.");

			do
			{
				System.out.print("Enter int #" + (numNegatives + 1)+ ": ");
				num = input.nextInt();
				input.nextLine(); // throwaway remaining new line char
				if (num < 0.0)	//ADD
				{
					sum = sum + num;
					numNegatives++;
				}
				else
				{
					System.out.println("Error - number is not negative\n");
				}

			}while (numNegatives < 4);	//ADD

			System.out.println("The sum of the negative number is: " + sum + "\n");
			
			progNum++;
		}

		{
			System.out.println("*** Program " + progNum + " ***");
			
			boolean checker = false;
			String answer;
			String lastCharacter;
			int lastLetterPlace = 0;
			do
			{
				checker = false;
				System.out.print("Enter a string that has length of at least 5 and the last letter is an s: ");
				answer = input.nextLine();
				answer = answer.toLowerCase();
				lastCharacter = answer.substring(answer.length() - 1); //ADD code to find the last character (using substring) and store it in variable lastCharacter
				if (answer.length() < 5 && !lastCharacter.equals("s"))	//ADD
				{
					System.out.println("String is too short and the last letter is not an s\n");
					checker = true;
				}
				else if (answer.length() < 5)	//ADD
				{
					System.out.println("String is too short\n");
					checker = true;
				}
				else if(!lastCharacter.equals("s"))	//ADD
				{
					System.out.println("last letter is not an s\n");
					checker = true;
				}

			}while (checker == true);		//ADD

			System.out.println("Yay - the length is " + answer.length() + " and last letter is an s\n");
			
			progNum++;
		}

		{
			System.out.println("*** Program " + progNum + " ***");
			// Fill in the code to display the fibonacci sequence
			// The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, etc...
			// The next number is found by adding up the two numbers before it.
			// The 2 is found by adding the two numbers before it (1+1)
			// The 3 is found by adding the two numbers before it (1+2),
			// And the 5 is (2+3) and so on! 
			

			ArrayList<Integer> myArray = new ArrayList<Integer>();
			myArray.add(0);
			myArray.add(1);
			int stoppingPoint;
			System.out.print("What stopping point would you like to use?: ");// prompt for an integer to use as a stopping point
			// while scanner does not have next int
			while(!input.hasNextInt()){
				System.out.println("not an int!");// print "Not an integer number"
				input.nextLine(); // throw away everything currently in the scanner
				System.out.print("What stopping point would you like to use?: ");// prompt for an integer to use as a stopping point
			}
			stoppingPoint = input.nextInt();
			while(myArray.get(myArray.size() - 1) < stoppingPoint && myArray.get(myArray.size() - 1) + myArray.get(myArray.size() - 2) < stoppingPoint)
			{
				int temp = myArray.get(myArray.size() - 1) + myArray.get(myArray.size() - 2);
				myArray.add(temp);
			}
			int array[] = new int[myArray.size()];
			for (int i = 0; i<myArray.size();i++){
				array[i] = myArray.get(i);
			}
			
			for (int k : array){
				System.out.print(k + " ");
			}
			progNum++;
			System.out.println();
		}

		{
			System.out.println("*** Program " + progNum + " ***");
			// Ask the user for several numbers or Q to quit. Then calculate the average of their numbers.

			
			double count = 0;
			double sum = 0;
			double average = 0;
			boolean quitCheck = true;
			String usrIn;
			while (quitCheck == true) // repeat until the use types Q then break
			{
				// prompt for an integer or Q to quit.
				System.out.print("Give an integer or Q to quit: ");
				if (input.hasNextInt())
				{
					 // if the scanner has next int
					sum = sum + input.nextInt();
					input.nextLine(); // throws away next line char
					// get the next int and add it to the sum
					// increment the count
					count++;
				}
				
				else if (input.hasNextLine())
				{
				//the scanner's next line is Q
					usrIn = input.nextLine();
					usrIn = usrIn.toLowerCase();
					if (usrIn.equals("q"))
					{
						quitCheck = false;
					}
					else if (!usrIn.equals("q"))
					{
						System.out.println("Not an int!");
					}
				}
			}
			if (count > 0)
			{
				average = sum / count;
				// calculate and print average
				System.out.println("Average: " + average);
			}
			
			
		}

	
	}
}
