import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
public class externalfile
{
	public static void main(String[] args) throws Exception {
        //File file = new File("C:\\Users\\andrewault\\Documents\\Github\\CompSci-Sem2\\2DTextFile\\text.txt");
        File file = new File("text.txt");
        Scanner input = new Scanner(file);
        int counter = 0;
        int tableLng = 0;
        int tableWid = 0;
        if (counter < 1){
            counter++;
            if (input.hasNextInt()){
                tableLng = input.nextInt();
            }
            else {
                System.out.print("Invalid Number!");
                return;
            }
        }
        if (counter < 2 && counter >= 1){
            counter++;
            if (input.hasNextInt()){
                tableWid = input.nextInt();
            }
            else {
                System.out.print("Invalid Number!");
                return;
            }
        }
        int[][] myArray = new int[tableWid][tableLng];
        for (int i = 0; i < tableWid; i++){
            for (int j = 0; j < tableLng; j++){
                if (input.hasNextInt()){
                    myArray[i][j] = input.nextInt();
                }
                else {
                    System.out.print("Invalid Number!");
                    return;
                }
            }
        }
        System.out.println(Arrays.deepToString(myArray));
        double rowAvg = 0;
        for (int j = 0; j < tableWid; j++){
            rowAvg = 0;
            for (int i = 0; i < tableLng; i++){
                rowAvg += myArray[j][i];
            }
            rowAvg = rowAvg / tableLng;
            System.out.println("Row " + j + " Average: " + rowAvg);
        }
}
}