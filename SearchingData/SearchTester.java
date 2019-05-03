public class SearchTester 
{
    public static void main(String[] args)
    {
        String[] myString = {"Aaaa","Bbbb","Cccc","Dddd"};
        int[] myLinear = {1,24,6,8,34,56};
        int[] myBinary = {1,2,3,4,5,6,7};
        System.out.println("expected: 3");
        System.out.println(Searches.sequentialSearch(myLinear,8));
        System.out.println("expected: 2");
        System.out.println(Searches.sequentialSearch(myString,"Cccc"));
        System.out.println("expected: 5");
        System.out.println(Searches.binarySearch(myBinary,6));
        System.out.println("expected: 3");
        System.out.println(Searches.binarySearch(myString,"Dddd"));
    }

}