package chap06.section1;

public class PersonTest {
    private String name;
    private int age;

    public PersonTest(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}   //getter setter

class Main{
    public static void main(String args[]){
        PersonTest p1 = new PersonTest("Kildong", 30);
        //p1.name = "Dooly" //접근 불가
        p1.setName("Dooly");
        System.out.println(p1.getName());
    }
}