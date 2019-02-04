import java.util.Scanner;
import java.io.*;
public class characters
{
	public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int tableWid = 2;
        int tableLng = 6;
        String[][] myArray = new String[tableWid][tableLng];
        myArray[0][0] = "Harry";
        myArray[0][1] = "Mike";
        myArray[0][2] = "Ben";
        myArray[0][3] = "Sam";
        myArray[0][4] = "Donald";
        myArray[0][5] = "Bill";
        myArray[1][0] = "Cox";
        myArray[1][1] = "Hunt";
        myArray[1][2] = "Dover";
        myArray[1][3] = "Sung";
        myArray[1][4] = "Duck";
        myArray[1][5] = "Gates";
        for (String[] i : myArray){

            for (String j : i){
                System.out.println(j);
            }
        }
        File file = 
        new File("Characters.txt"); 
        FileWriter writeToFile = new FileWriter(file);
        writeToFile.write("First and Last\n");
        int counter = 0;
        writeToFile.write("Row 0: ");
        writeToFile.write(myArray[0][0] + " " + myArray[1][0] + "\n");
        writeToFile.write("Row 1: ");
        writeToFile.write(myArray[0][1] + " " + myArray[1][1] + "\n");
        writeToFile.write("Row 2: ");
        writeToFile.write(myArray[0][2] + " " + myArray[1][2] + "\n");
        writeToFile.write("Row 3: ");
        writeToFile.write(myArray[0][3] + " " + myArray[1][3] + "\n");
        writeToFile.write("Row 4: ");
        writeToFile.write(myArray[0][4] + " " + myArray[1][4] + "\n");
        writeToFile.write("Row 5: ");
        writeToFile.write(myArray[0][5] + " " + myArray[1][5] + "\n");
        writeToFile.write("\nLast Name Only");
        counter = 0;
        for (int i = 1; i < tableWid; i++){
            writeToFile.write("\nRow " + counter + ":\n");
            for (int j = 0; j < tableLng; j++){
               // writeToFile.write(myArray[i][j]);
                writeToFile.write(myArray[i][j] + "\n");
            }
        }
        writeToFile.close();
        System.out.print("done");
}
}