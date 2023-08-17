import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Person tom = new Person();
        tom.displayInfo();
    }
}

class Person{
    String name;
    int age;
    void displayInfo(){
        System.out.println("Name: %s \tAge: %d\n");
    }
}


