public class TesterClass {
    public static int newCalc(int n)
    {
       if (n < 0)
       {
          return -1;
       }
       else if (n < 10)
       {
          return n;
       }
       else
       {
          return (1 + newCalc(n / 10));
       }
    }
}