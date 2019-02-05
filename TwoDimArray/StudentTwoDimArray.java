import java.util.Scanner;

public class StudentTwoDimArray
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Student[][] period1 = new Student[3][4];

		period1[0][0] = new Student("Bob", "Miller", 10, 3.5);
		period1[0][2] = new Student("Karen", "Smith", 9, 3.9);
		period1[1][1] = new Student("Tina", "Tangle", 11, 2.3);
		period1[1][3] = new Student("Chris", "Morris", 10, 3.0);
		period1[2][0] = new Student("Emma", "Slimer", 12, 2.3);
		period1[2][2] = new Student("Oliva", "Baker", 11, 2.9);


		//Examples:
		System.out.println("Display first name: " + period1[2][0].getFirstName());
		System.out.println("Display last name: " + period1[2][0].getLastName());
		System.out.println("\nDisplay student using toString method: " + period1[2][0]);

		//**** Fill in code to display grade level and grade point average for the student in location [2][0] (just like the examples above)
		System.out.println("\nDisplay grade level: " + period1[2][0].getGradeLevel());
		System.out.println("\nDisplay grade point average: " + period1[2][0].getGradePointAverage());

		System.out.println();

		//Display "Seating Chart" with first names using traditional for loops
		System.out.println("--- Seating chart with first names using traditional for loops ---");

		for (int i  = 0; i < period1.length; i++)
		{
			for (int j  = 0; j < period1[i].length; j++)
			{
				if (period1[i][j] != null)
				{
					System.out.print(period1[i][j].getFirstName() + "\t");
				}
				else
				{
					System.out.print("-----\t");
				}
			}
			System.out.println();
		}
		System.out.println();


		//*** Display "Seating Chart" with last names using traditional for loops
		System.out.println("--- Seating chart with last names using traditional for loops ---");

		for (int i  = 0; i < period1.length; i++)
		{
			for (int j  = 0; j < period1[i].length; j++)
			{
				if (period1[i][j] != null)
				{
					System.out.print(period1[i][j].getLastName() + "\t");
				}
				else
				{
					System.out.print("-----\t");
				}
			}
			System.out.println();
		}

		System.out.println();

		//Display "Seating Chart" with first names using for-each loops(enhanced for loops)
		System.out.println("--- Seating chart with first names using for-each loops(enhanced for loops) ---");
		System.out.println("Seating chart of first names: ");

		for (Student[] currRow : period1)
		{
			for (Student curr : currRow)
			{
				if (curr != null)
				{
					System.out.print(curr.getFirstName() + "\t");
				}
				else
				{
					System.out.print("-----\t");
				}
			}
			System.out.println();
		}

		System.out.println();

		//*** Display "Seating Chart" with last names using for-each loops(enhanced for loops)
		System.out.println("--- Seating chart with last names using for-each loops(enhanced for loops) ---");

		for (Student[] currRow : period1)
		{
			for (Student curr : currRow)
			{
				if (curr != null)
				{
					System.out.print(curr.getLastName() + "\t");
				}
				else
				{
					System.out.print("-----\t");
				}
			}
			System.out.println();
		}

		System.out.println();

		//*** Display all student first names (row major order) using traditional for loop
		/* 	Sample output:
			1. Bob
			2. Karen
			3. Tina
			4. Chris
			5. Emma
			6. Olivia

			There are 6 students
		*/
		System.out.println("List of first names using traditional for loop: ");
		int counter = 0;
		for (Student[] currRow : period1)
		{
			for (Student curr : currRow)
			{
				if (curr != null)
				{
					counter++;
					System.out.print(counter + ". ");
					System.out.print(curr.getFirstName());
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("There are " + counter + " students");

		System.out.println();


		//*** Display all student first names (row major order) using a for-each loop
		/* 	Sample output:
			1. Bob
			2. Karen
			3. Tina
			4. Chris
			5. Emma
			6. Olivia

			There are 6 students
		*/
		System.out.println("List of first names using for-each loop: ");
		counter = 0;
		for (Student[] currRow : period1)
		{
			for (Student curr : currRow)
			{
				if (curr != null)
				{
					counter++;
					System.out.print(counter + ". ");
					System.out.print(curr.getLastName());
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("There are " + counter + " students");



		//*** Display the first and last name of students who are in the grade level entered by the user
		System.out.println("\nStudents in a particular grade");

		System.out.print("Enter a grade number ");
		int userGrade = input.nextInt();
		counter = 0;
		for (Student[] currRow : period1)
		{
			for (Student curr : currRow)
			{
				if (curr != null)
				{
					if (curr.getGradeLevel() == userGrade){
						System.out.print(curr.getFirstName());
						System.out.println();
						counter++;
					}
				}
			}
		}
		if (counter == 0){
			System.out.println("No Students!");
		}


		//*** Display first name of students with the minimum grade point average
		System.out.print("Enter a minimum grade point average: ");
		double minGradePoint = input.nextDouble();
		counter = 0;
		System.out.println("\nStudents with at least " + minGradePoint + " gpa: ");
		for (Student[] currRow : period1)
		{
			for (Student curr : currRow)
			{
				if (curr != null)
				{
					if (curr.getGradePointAverage() >= minGradePoint){
						System.out.print(curr.getFirstName());
						System.out.println();
						counter++;
					}
				}
			}
		}
		if (counter == 0){
			System.out.println("No Students!");
		}



	}
}