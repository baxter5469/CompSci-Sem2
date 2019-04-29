public class Person implements Measurable
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
}