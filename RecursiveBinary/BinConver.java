public class BinConver {

public static void main(String[] args) {
    convert(100);
}

public static void convert(int number) {
    if (number>0) {
        convert(number/2);
        System.out.print(number % 2 + " ");
    }
}
}