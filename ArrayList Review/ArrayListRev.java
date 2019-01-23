import java.util.*;
public class ArrayListRev
{
    private static ArrayList<String> getList(Scanner input){
        boolean boolQuit1 = false;
        ArrayList<String> list = new ArrayList<String>();
        while (boolQuit1 == false) {
            System.out.print("Enter a word ('XXX' to quit):");
            String tempIn = input.nextLine();
            tempIn = tempIn.toLowerCase();
            if (tempIn.equals("xxx")){
                boolQuit1 = true;
            }
            if (boolQuit1 == false) {
                list.add(tempIn);
            }
        }
        return list;
    }
    private static void displayList(ArrayList<String> myList){
        for (String i : myList){
            System.out.println(i);
        }
    }
    private static ArrayList mergeLists(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> list3 = new ArrayList<String>();
        for (int i = 0; i < list1.size() || i < list2.size(); i++){
            if (list1.size() > i){
                list3.add(list1.get(i));
            }    
            if (list2.size() > i){
                list3.add(list2.get(i));
            } 
        }
        return list3;
    }
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);	
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();
        ArrayList<String> list4 = new ArrayList<String>();
        System.out.println("Enter the first wordlist:");
        list1 = getList(input);
        System.out.println("Enter the second wordlist:");
        list2 = getList(input);
        System.out.println("Wordlist 1");
        System.out.println("---------");
        displayList(list1);
        System.out.println("Wordlist 2");
        System.out.println("---------");
        displayList(list2);
        System.out.print("List 1 Merged with List 2: ");
        list3 = mergeLists(list1,list2);
        System.out.println();
        displayList(list3);
        System.out.print("List 2 Merged with List 1: ");
        list4 = mergeLists(list2, list1);
        System.out.println();
        displayList(list4);
}
}