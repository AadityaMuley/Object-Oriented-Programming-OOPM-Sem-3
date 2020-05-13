//From a list of numbers given as argument list input find the even and odd numbers and print the output accordingly
import java.util.*;
public class oddeven
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a[] = new int[5];
System.out.println("Enter 5 numbers");
for(int i=0;i<5;i++)
{
a[i] = sc.nextInt();
if(a[i]%2==0)
{
System.out.println("The number "+a[i]+" is even");
}
else
{
System.out.println("The number "+a[i]+" is odd");
}
}
}
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Java Program to Find ASCII Value of each character of given command line arguments.
import java.util.*;
public class ascii
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
char ch = sc.next().charAt(0);
System.out.println((int)ch);
}
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Java Program to Check Whether an Alphabet is Vowel or Consonant. Take the input from the user using Scanner Class.
import java.util.*;import java.util.*;
public class vowelconso
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
char ch = sc.next().charAt(0);
if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' ||
ch=='o' || ch=='u')
System.out.println("Vowel");
else
System.out.println("Consonent");
}
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Java Program to Convert Milliseconds to Minutes and Seconds. Take the input from the user.
import java.util.Scanner;
public class seconds
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Time in milliseconds :");
double ms = sc.nextInt();
System.out.println("Seconds = "+ (ms/100));
System.out.println("Minutes = "+ (ms/100/60));
}
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Sum of Integers
public class add
{
public static void main(String args[])
{
int sum=0;
for(int i=0;i<args.length;i++)
{
sum = sum + Integer.parseInt(args[i]);
}
System.out.println("Sum = "+sum);
}
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Student info
import java.util.Scanner;
public class Scanners
{
public static void main(String args[])
{Scanner sc = new Scanner(System.in);
System.out.println("Roll no :");
int rno = sc.nextInt();
System.out.println("Age :");
int age = sc.nextInt();
System.out.println("Name :");
String name = sc.next();
System.out.println("Gender :");
char gen = sc.next().charAt(0);
System.out.println("Fee");
Double fee = sc.nextDouble();
System.out.println("Roll no : "+rno);
System.out.println("Name : "+name);
System.out.println("Gender : "+gen);
System.out.println("Age : "+age);
System.out.println("Fee : "+fee);
}
}
