public class Person implements Measurable,Comparable
{
    private double age;
    private String name;
    public Person(String _name,double _age){
        age = _age;
        name = _name;
    }
    public double getMeasure(){
        return age;
    }
    public int compareTo(Object anotherObject)
    {
        Person anotherPerson = (Person) anotherObject;
        double anotherAge = anotherPerson.getMeasure();
        int _age = (int)anotherAge;
        if (age > _age){
            return 1;
        }
        else if (age < _age){
            return -1;
        }
        return 0;
    }
}