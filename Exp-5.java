//Calculator - packages
package Calculator;
public class Operate {
public void add(int a, int b) {
System.out.println("Addition is "+(a+b));
}
public void subtract(int a, int b) {
System.out.println("Subtract is "+(a-b));
}
public void multiply(int a, int b) {
System.out.println("Multiplication is "+(a*b));
}
public void division(int a, int b) {
System.out.println("Division is "+(a/b));
}
public void mod(int a, int b) {
System.out.println("Modulus is "+(a%b));
}
}
import Calculator.Operate;
import java.util.*;
public class CalcPrg {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("1. Addition");System.out.println("2. Subtraction");
System.out.println("3. Multiplication");
System.out.println("4. Division");
System.out.println("5. Modulus");
System.out.println("Enter your choice :");
int ch = sc.nextInt();
System.out.println("Enter the numbers : ");
int a = sc.nextInt();
int b = sc.nextInt();
Operate o = new Operate();
switch(ch) {
case 1:
o.add(a,b);
break;
case 2:
o.subtract(a,b);
break;
case 3:
o.multiply(a,b);
break;
case 4:
o.division(a,b);
break;
case 5:
o.mod(a,b);
break;
default:
System.out.println("Wrong choice!");
}
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Banking - packages
package Banking;
public class Bank {
double bal;
public Bank() {
bal = 10000;
}
public void withdraw(double amt) {
bal -= amt;
}
public void deposit(double amt) {
bal += amt;
}
public double loan(double p, int n) {
double interest = p*17*n/100.0;
return interest;
}
}
import Banking.Bank;
import java.util.*;
public class Loan {
public static void main(String args[]) {
Bank bank = new Bank();
System.out.println("1. Deposit");
System.out.println("2. Withdraw");
System.out.println("3. Loan");
System.out.println("Enter your choice : ");
Scanner sc = new Scanner(System.in);switch(sc.nextInt()) {
case 1:
System.out.println("Enter the amount to be deposited:");
bank.deposit(sc.nextDouble());
break;
case 2:
System.out.println("Enter the amount to be withdrawn:");
bank.withdraw(sc.nextDouble());
break;
case 3:
System.out.println("Enter the principle and years for loan:");
double loan = bank.loan(sc.nextDouble(), sc.nextInt());
System.out.println("Loan = "+loan);
break;
default:
System.out.println("Wrong choice!");
}
System.out.println("Balance : "+bank.bal);
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//package - demo
package packdemo;
public class Simple {
public static void main(String args[]) {
System.out.println("Inside packdemo.Simple");
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//box - package
package Box;
public class Volume {
public void calculate(int l, int b, int h) {
System.out.println("Volume of box is "+(l*b*h));
}
}
package CalculateVolume;
import Box.*;
public class Calc {
public static void main(String args[]) {
Volume obj = new Volume();
obj.calculate(10,10,10);
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//more packages
package Apack;
public class A {
public void displayA() {
System.out.println("Inside Apack.A");
}
}package Bpack;
import Apack.A;
public class B {
public static void main(String args[]) {
A a1 = new A();
a1.displayA();
}
}
