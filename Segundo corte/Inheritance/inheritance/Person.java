package inheritance;

public class Person {
    protected String name;
    protected char gender;
    protected int age;
    protected String address;

    //Empty constructor
    public Person() {
    }
    //Constructor with one datum
    public Person(String name){
        this.name = name;
    }
    //Constructor with two data for Employee
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Constructor with all data
    public Person(String name,  int age, char gender, String address){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }
    public String detail(){
        return "Name: %s Age: %d".formatted(this.name, this.age);
    }
    //Getters and setters
    public String getName (){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGender () {
    return this.gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public int getAge () {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress (){
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{Name = ").append(this.name);
        sb.append(", Gender = ").append(this.gender);
        sb.append(". Age = ").append(this.age);
        sb.append(", Address = ").append(this.address);
        sb.append ("}");
        return sb.toString();
    }
}