class Animal {
void eat() {
System.out.println("Eating...");
}
}
class Dog extends Animal {
void eat() {
System.out.println("Eating bread...");
}
void bark() {
System.out.println("Barking...");
}
void work() {
super.eat();
bark();
}
}
class TestSuper2 {
public static void main(String args[]) {
Dog obj = new Dog();
obj.work();
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Animal {
String color="White";
}
class Dog extends Animal {
String color="Black";void display() {
System.out.println("Child class : "+color);
System.out.println("Parent class : "+super.color);
}
}
class TestSuper1 {
public static void main(String args[]) {
Dog obj = new Dog();
obj.display();
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
class Account {
int Acc_no;
String Name;
String Address;
long Mobile;
double Balance;
Account(int acc_no, String name, String address, long mobile, double balance) {
Acc_no = acc_no;
Name = name;
Address = address;
Mobile = mobile;
Balance = balance;
}
public void AccountHolder() {
System.out.println("Account number is : "+Acc_no);
System.out.println("Account Holder name is : "+Name);
System.out.println("Account Holder Address is : "+Address);
System.out.println("Account Holder Phone no. is : "+Mobile);
System.out.println("Account Holder balance is : "+Balance);
}
}
class SavingsAccount extends Account {double Interest;
SavingsAccount(int acc_no, String name, String address, long mobile, double
balance, double interest) {
super(acc_no, name, address, mobile, balance);
Interest = interest;
}
public void displayBalance(double withdraw) {
double new_balance = Balance-withdraw;
System.out.println("Account Interest: "+Interest);
System.out.println("Account Balance: "+new_balance);
}
public void calculateInterest() {
double Account_Interest = (Balance*Interest)/100.0;
System.out.println("Interest for the year: "+Account_Interest);
}
}
public class BankSingleInheritance {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Account number: ");
int Acc_no=sc.nextInt();
System.out.println("Enter Account Holder's name: ");
String Name = sc.next();
System.out.println("Enter Account Holder's Address: ");
String Address = sc.next();
System.out.println("Enter Account Holder's Mobile no: ");
long Mobile = sc.nextLong();
System.out.println("Enter Account Holder's balance: ");
double Balance = sc.nextDouble();
System.out.println("Enter Account Interest: ");
double interest = sc.nextDouble();
System.out.println("Enter withdrawl amount: ");
double withdraw = sc.nextDouble();
SavingsAccount saving = new
SavingsAccount(Acc_no,Name,Address,Mobile,Balance,interest);
saving.AccountHolder();
saving.displayBalance(withdraw);
saving.calculateInterest();
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class A {
void m1() {
System.out.println("Inside A's m1 method");
}
}
class B extends A {
void m1() {
System.out.println("Inside B's m1 method");
}
}
class C extends A {
void m1() {
System.out.println("Inside C's m1 method");
}
}
class DynamicDispatch {
public static void main(String args[]) {
A a = new A();
B b = new B();
C c = new C();
A ref;
ref = a;
ref.m1();ref=b;
ref.m1();
ref=c;
ref.m1();
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Person {
String Name;
int Age;
Person(String name, int age) {
Name = name;
Age = age;
}
void display() {
System.out.println("Name : "+Name);
System.out.println("Age : "+Age);
}
}
class Employee extends Person {
String emp_designation;
double emp_salary;
Employee(String name, int age, String desg, double sal) {
super(name, age);
emp_designation = desg;
emp_salary = sal;
}
void display() {
super.display();
System.out.println("Employee designation : "+emp_designation);
System.out.println("Employee salary : "+emp_salary);
}
public static void main(String args[]) {
Employee e = new Employee("Aaditya", 19, "Student", 100.0 );
e.display();
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Square {
int length;
Square(int l) {
length = l;
}
}
void area() {
System.out.println("Area of square : "+(length*length));
}
class Rectangle extends Square {
int breadth;
Rectangle(int l, int b) {
super(l);
breadth = b;
}
}
void rectArea() {
super.area();
System.out.println("Area of rectangle : "+(super.length*breadth));
}
class Box extends Rectangle {
int height;
Box(int l, int b, int h) {
super(l,b);
height = h;
}
void volume() {
super.rectArea();System.out.println("Volume of cube : "+
(super.length*super.breadth*height));
}
}
public static void main(String args[]) {
Box b = new Box(2,3,4);
b.volume();
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
class Bank {
int getRateOfInterest() {
return 0;
}
}
class SBI extends Bank {
int getRateOfInterest() {
return 9;
}
}
class ICICI extends Bank {
int getRateOfInterest() {
return 7;
}
}
class AXIS extends Bank {
int getRateOfInterest() {
return 13;
}
}
class Assgn {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
Bank b;
SBI sbi = new SBI();
ICICI icici = new ICICI();
AXIS axis = new AXIS();}
}
System.out.println(" Enter your choice : ");
System.out.println("1. SBI");
System.out.println("2. ICICI");
System.out.println("3. AXIS");
System.out.println("Enter your option : ");
switch(sc.nextInt()) {
case 1:
b = new SBI();
System.out.println("Rate of interest : "+b.getRateOfInterest());
break;
case 2:
b = new ICICI();
System.out.println("Rate of interest : "+b.getRateOfInterest());
break;
case 3:
b = new AXIS();
System.out.println("Rate of interest : "+b.getRateOfInterest());
break;
default:
System.out.println("Wrong choice!");
}
