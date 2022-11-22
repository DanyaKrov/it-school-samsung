import java.lang.String;

public class Person {
    protected int age;
    protected String name;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public String work(){
        return "None";
    }
    @Override
    public String toString(){
        return  String.format("(" + this.name + ", " + this.age + ")");
    }
}

class Employee extends Person {
    String company;
    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public String getCompany(){
        return this.company;
    }
    @Override
    public String work(){
        return "Manager";
    }
    @Override
    public String toString(){
        return  String.format("(" + super.name + ", " + super.age + ", " + this.company + ")");
    }
}