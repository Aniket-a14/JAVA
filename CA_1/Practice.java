import java.util.*;

public class Practice {
    String name;
    int age;

    Practice(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        Practice p1 = new Practice("Aniket", 20);
        System.out.println(p1);
    }
}
