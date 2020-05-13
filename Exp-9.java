interface Message
{
public void display();
}
class Tweet implements Message
{
public void display()
{
System.out.println("Your Message is displayed on Twitter");
}
}
class FacebookMsngr implements Message
{
public void display()
{
System.out.println("Your Message is displayed on Facebook");
}
}
class InterfaceDemo
{
public static void main(String args[])
{
Message t = new Tweet();
t.display();
FacebookMsngr fb = new FacebookMsngr();
fb.display();
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
interface Gross
{
double ta = 1000;
double da = 1000;
public void gross_sal();
}
class Employee
{
String Name;
double Basic_sal;
Employee(String name , double basic_sal)
{
Name = name;
Basic_sal = basic_sal;
}
public void display()
{
System.out.println("Name : "+Name);
System.out.println("Basic Salary : "+Basic_sal);
}
}
class Salary extends Employee implements Gross
{
double Hra;
Salary(String name , double basic_sal , double hra)
{
super(name,basic_sal);
Hra = hra;
}
public void gross_sal()
{
double gross_sal = ta + da + Basic_sal + Hra;
System.out.println("TA : "+ta);
System.out.println("DA : "+da);
System.out.println("Basic Salary : "+Basic_sal);
System.out.println("HRA : "+Hra);
System.out.println("Gross Salary : "+gross_sal);}
public void display_sal()
{
display();
gross_sal();
}
}
class MySalary
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Employee Name :");
String n = sc.next();
System.out.println("Enter Basic Salary : ");
double bs = sc.nextDouble();
System.out.println("Enter HRA : ");
double hra = sc.nextDouble();
Salary sal = new Salary(n,bs,hra);
sal.display_sal();
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
interface Exam
{
public void percal();
}
class Student
{
String Name , Roll_no;
int M1 , M2 , M3 ;
Student(String name,String roll_no,int m1,int m2,int m3)
{
Name = name;
Roll_no = roll_no;
M1 = m1;
M2 = m2;
M3 = m3;
}
}
class Result extends Student implements Exam
{
int total;
Result(String name,String roll_no,int m1,int m2,int m3)
{
super(name,roll_no,m1,m2,m3);
}
public void percal()
{
total = (M1 + M2 + M3)/3;
}
public void display()
{
System.out.println("Name : "+Name);
System.out.println("Roll No : "+Roll_no);
System.out.println("Marks in Physics : "+M1);
System.out.println("Marks in Chemistry : "+M2);
System.out.println("Marsks in Maths : "+M3);
System.out.println("Percentage : "+total+"%");}
}
class MyResult
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Student Name : ");
String n = sc.next();
System.out.println("Enter Student Roll No : ");
String r = sc.next();
System.out.println("Enter Marks in Physics : ");
int m1 = sc.nextInt();
System.out.println("Enter Marks in Chemistry : ");
int m2 = sc.nextInt();
System.out.println("Enter Marks in Maths : ");
int m3 = sc.nextInt();
Result rs = new Result(n,r,m1,m2,m3);
rs.percal();
rs.display();
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
interface Casette
{
public void accept_title(String x);
}
interface CD
{
public void accept(String y);
}
class Media implements Casette , CD
{
String c;
String d;
public void accept_title(String x)
{
c = x;
}
public void accept(String y)
{
d = y;
}
public void put(String c , String d)
{
accept_title(c);
accept(d);
}
public void get()
{
System.out.println("Casette : "+c);
System.out.println("Cd : "+d);
}
}
class MyMedia
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Casette & CD name : ");
String ca = sc.next();
String cd = sc.next();
Media m = new Media();
m.put(ca,cd);
m.get();
}
}
