/*  Prompt the user for the number of coin flips.
Flip the count the designated number of times - displaying the number of the coin flip and the result
Display the number of coin heads and number of tails!

How many flips would you like? 4
1. heads
2. tails
3. heads
4. heads

The results:
3 heads - 75.0%
1 tails - 25.0%
*/
import java.util.Scanner;
public class CoinFlipper
{
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        System.out.print("How many flips would you like? : ");
        double usrIn = input.nextDouble();
        int headCount = 0;
        int tailCount = 0;
        int unknownCount = 0;
        Coin myCoin = new Coin("quarter",1859);
        for (int i = 0; i < usrIn; i++){
            String coinFlip = myCoin.flip();
            System.out.println(coinFlip);
            if (coinFlip.equals("heads")){
                headCount++;
            }
            else if (coinFlip.equals("tails")){
                tailCount++;
            }
            else {
                unknownCount++;
            }
            System.out.println(i+1 + ". " + coinFlip);
        }
        System.out.println("results: ");
        System.out.println(headCount + " Heads " + " " + (headCount / usrIn) * 100 + "%");
        System.out.println(tailCount + " Tails " + " " + (tailCount / usrIn) * 100 + "%");
        System.out.println(unknownCount + " Unknowns " + " " + (unknownCount / usrIn) * 100 + "%");
	}
}