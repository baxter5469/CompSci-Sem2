public class MeasurableTester
{
    public static void main(String[] args)
    {
        Measurable[] people = new Measurable[3];
        people[0] = new Person("Bob",52);
        people[1] = new Person("Alex",30);
        people[2] = new Person("Paul",16);

        double avgAge = Data.average(people);
        System.out.println("average age: " + avgAge);
    }
}