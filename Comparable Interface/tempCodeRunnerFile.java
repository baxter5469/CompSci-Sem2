public class PersonTester 
{
    public static void main(String[] args)
    {
        //Measurable[] people = new Measurable[3];
        //Person[] people = new Person[3];
        Comparable[] people = new Comparable[3];
        people[0] = new Person("Bob",52);
        people[1] = new Person("Alex",30);
        people[2] = new Person("Paul",16);
        int oldest = people[2].compareTo(people[1]);
        if (oldest == -1){
            System.out.println("Person 2 is older");
        }
        else if (oldest == 0){
            System.out.println("They are both the same age");
        }
        else if (oldest == 1){
            System.out.println("Person 1 is older");
        }
    }
}