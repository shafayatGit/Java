package OOP;

import java.util.Scanner;

public class StudentClass {
//    public static void fun(Student x){ //scope error
//        System.out.println(x.name); //
//    }
public static void fun(Stud x){ //That will not give scope error bcz of the outside calling
   System.out.println(x.name); //
   }

    public static class Stud {
        String name;
        int rno;
        double percent;

    }


    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in); //Taking object using for taking input

        class Student { //Declaring into main function. if I declare this into main function it will fall in scope
            String name;
            int rno;
            double percent;

        }

        Student x = new Student(); //declaration of object from class----> Class is Student and object is x
        x.name = "Shafayat";
        x.rno = 10;
        x.percent = 93.5;
        System.out.println("Name:"+x.name+" Roll:"+x.rno+" Percent:"+x.percent);
        //fun(x); //i cant call this function because of the scope

        Stud s1 = new Stud();
        s1.name = "King";
        fun(s1);

        Student y = new Student(); //Here class is Fixed which is Student, and we can make a lot of objects like x,y
        y.name = "Hossain";
        y.rno = 12;
        y.percent = 90.5;
        System.out.println("Name:"+y.name+" Roll:"+y.rno+" Percent:"+y.percent);


    }
}
