//Student info objects
class Student4
{
int id;
String name;
Student4(){}
Student4(int id, String name)
{
this.id=id;
this.name=name;
}
void display(){
System.out.println(id+" "+name);}
public static void main(String args[])
{
Student4 ob3 = new Student4();
Student4 ob1 = new Student4(111,"Karan");
Student4 ob2 = new Student4(112,"Ran");
ob1.display();
ob2.display();
ob3.display();
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Student info 
class Student5
{
int id;
String name;int age;
Student5(int i, String n)
{
id = i;
name = n;
}
Student5(int i, String n, int a)
{
id = i;
name = n;
age=a;
}
void display()
{
System.out.println(id+" "+name+" "+age);
}
public static void main(String args[])
{
Student5 s1 = new Student5(111,"Karan");
Student5 s2 = new Student5(222,"Aryan",25);
s1.display();
s2.display();
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//More student info
class Student6
{
int id;
String name;
Student6(int i,String n)
{
id = i;
name = n;
}
Student6(Student6 s)
{
id = s.id;
name =s.name;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Student6 s1 = new Student6(111,"Karan");
Student6 s2 = new Student6(s1);
s1.display();
s2.display();
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Function overload - area()
import java.util.*;
public class area_overload
{
void area(int l, int b)
{
double area = l*b;
System.out.println("Area of rectangle = "+area);
}
void area(int s)
{
double area = s*s;
System.out.println("Area of square = "+area);
}
void area(double r)
{
double area = 3.14*(r*r);
System.out.println("Area of circle = "+area);
}
void area(double h, double b)
{
double area = (0.5)*h*b;
System.out.println("Area of triangle = "+area);
}
public static void main(String args[])
{
area_overload ob = new area_overload();
Scanner sc = new Scanner(System.in);
boolean x = true;
while(x == true)
{
System.out.println("Enter your choice :");
System.out.println("1] Area of rectangle");
System.out.println("2] Area of square");
System.out.println("3] Area of circle");
System.out.println("4] Area of triangle");System.out.println("5] Exit");
int choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter values of length and breadth:");
int l = sc.nextInt();
int b = sc.nextInt();
ob.area(l,b);
break;
case 2:
System.out.println("Enter value of side:");
int S = sc.nextInt();
ob.area(S);
break;
case 3:
System.out.println("Enter value of radius:");
double r = sc.nextDouble();
ob.area(r);
break;
case 4:
System.out.println("Enter values of height and base:");
double h = sc.nextDouble();
double d = sc.nextDouble();
ob.area(h,d);
break;
case 5:
x = false;
default : System.out.println("Wrong choice.");
}
if(x = false)
break;
}
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Function overload - fraction()
import java.util.*;
public class fraction
{
int f;
float fr;
double frac;
fraction(int n, int d)
{
f = n/d;
System.out.println("Interger fraction = "+f);
}
fraction(float n, float d)
{
fr = n/d;
System.out.println("Float fraction = "+fr);
}
fraction(double n, double d)
{frac = n/d;
System.out.println("Double fraction = "+frac);
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter 2 integers :");
fraction ob1 = new fraction(sc.nextInt(), sc.nextInt());
System.out.println();
System.out.println("Enter 2 floats :");
fraction ob2 = new fraction(sc.nextFloat(), sc.nextFloat());
System.out.println();
System.out.println("Enter 2 doubles :");
fraction ob3 = new fraction(sc.nextDouble(), sc.nextDouble());
System.out.println();
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Complex number split into real and imaginary
import java.util.*;
public class Complex
{
int real,img;
Complex()
{
real = 9;
img = 7;}
Complex(int real, int img)
{
this.real = real;
this.img = img;
}
void calculate(Complex ob1, Complex ob2)
{
int r = ob1.real+ob2.real;
int i = ob1.img+ob2.img;
System.out.println(r+" + "+i+"i");
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Complex ob1 = new Complex();
System.out.println("Enter real and imaginary parts :");
Complex ob2 = new Complex(sc.nextInt(), sc.nextInt());
Complex ob3 = new Complex();
ob3.calculate(ob1, ob2);
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Pattern
import java.util.*;
public class Pattern_MD
{
void pattern(int rows, char ch)
{
for(int i=1;i<=rows;i++)
{
for(int j=1;j<=i;j++){
System.out.print(ch+" ");
}
System.out.println();
}
}
void pattern(int no)
{
for(int i=1;i<=no;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}
void pattern(char ch)
{
for(int i=65;i<=(int)ch;i++)
{
for(int j=65;j<=i;j++)
{
System.out.print((char)j+" ");
}
System.out.println();
}
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Pattern_MD ob = new Pattern_MD();
System.out.println("Enter no of rows and a character :");
int r = sc.nextInt();
char ch = sc.next().charAt(0);
ob.pattern(r,ch);
System.out.println("Enter a number :");r = sc.nextInt();
ob.pattern(r);
System.out.println("Entr a Capital Alphabet :");
ch = sc.next().charAt(0);
ob.pattern(ch);
}
}
