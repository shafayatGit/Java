package OOP;

import java.util.Scanner;

java.util.Scanner;



public class StudentClass {
//    Creating new data type
 public static class Student {
    String name;
    int rno;
    double percent;

}

    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in); //Taking object using for taking input

        Student x = new Student(); //declaration of object from class----> Class is Student and object is x
        x.name = "Shafayat";
        x.rno = 10;
        x.percent = 93.5;
        System.out.println("Name:"+x.name+" Roll:"+x.rno+" Percent:"+x.percent);

        Student y = new Student(); //Here class is Fixed which is Student and we can make a lot of objects like x,y
        y.name = "Hossain";
        y.rno = 12;
        y.percent = 90.5;


    }
}
