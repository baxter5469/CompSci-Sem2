public class SortTester {
    public static void main(String[] args) {

        int[] myInt = {5,2,3,4,5,3,7,8,9,0};
        String[] myStr = {"B","G","F","D","E","A","G","H","I","J","K"};
        Sorts.selectionSort(myInt);
        Sorts.selectionSort(myStr);
        System.out.println("Selection Sort:");
        for (int i : myInt){
            System.out.print(i +" ");
        }
        System.out.println();
        for (String i : myStr){
            System.out.print(i +" ");
        }
        System.out.println();
        Sorts.insertionSort(myInt);
        Sorts.insertionSort(myStr);
        System.out.println("Insertion Sort:");
        for (int i : myInt){
            System.out.print(i +" ");
        }
        System.out.println();
        for (String i : myStr){
            System.out.print(i +" ");
        }
        Sorts.mergeSort(myInt);
        Sorts.mergeSort(myStr);
        System.out.println();
        System.out.println("Merge Sort:");
        for (int i : myInt){
            System.out.print(i +" ");
        }
        System.out.println();
        for (String i : myStr){
            System.out.print(i +" ");
        }
    }
}