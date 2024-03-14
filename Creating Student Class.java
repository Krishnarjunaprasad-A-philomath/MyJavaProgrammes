import java.util.*;
class Student{
   public double id;
   public String name;
   public String course;
   public int m1,m2,m3,m4,m5;
   public double total(){
       return m1+m2+m3+m4+m5;
   }
   public double average(){
       return total()/5;
   }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student S=new Student();
        System.out.println("ID of the Student:");
        S.id= sc.nextDouble();
        System.out.println("Name of the Student:");
        S.name= sc.next();
        System.out.println("course of the Student:");
        S.course= sc.next();
        System.out.println("Marks of the Student for 5 Subjects:");
        System.out.println("Marks for 1st Subject:");
        S.m1= sc.nextInt();
        System.out.println("Marks for 2nd Subject:");
        S.m2= sc.nextInt();
        System.out.println("Marks for 3rd Subject:");
        S.m3= sc.nextInt();
        System.out.println("Marks for 4th Subject:");
        S.m4= sc.nextInt();
        System.out.println("Marks for 5th Subject:");
        S.m5= sc.nextInt();
        System.out.println("Total Marks of the Student:"+S.total());
        System.out.println("Average Marks of the Student:"+S.average());

    }
}