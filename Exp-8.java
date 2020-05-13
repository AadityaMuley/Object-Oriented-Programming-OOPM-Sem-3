import java.util.*;
public class ExceptionExample
{
public static void main(String arg[])
{
int a, b, result;
Scanner sc = new Scanner(System.in);
System.out.println("Input two numbers");
a = sc.nextInt();
b = sc.nextInt();
try
{
result = a/b;
System.out.println("Result of Division: "+ result);
}
catch(Exception e)
{
e.printStackTrace();
}
finally
{
System.out.println("Program handled successfully!");
System.out.println("Result of Addition: "+ (a+b));
System.out.println("Result of Subtraction: "+(a-b));
System.out.println("Result of Multiplication: "+(a*b));
}
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
class MyException extends Exception
{
MyException(String msg)
{
super(msg);
}
}class ExceptionTest
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n;
String s;
try
{
System.out.println("Enter a number");
s = sc.next();
n = Integer.parseInt(s);
//throw new MyException("Number is not int");
if(n<0)
{
throw new MyException("Number is Negative");
}
else
{
throw new MyException("Number is Positive");
}
}
catch(Exception e)
{
e.printStackTrace();
}
finally
{
System.out.println("Bye!");
}
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
public class ThrowDemo
{
static double divide(int num1, int num2)
{
if(num2 == 0)
{
throw new ArithmeticException("Num2 is zero, hence Exception is thrown");}
else
{
System.out.println("Both the parameters are correct");
}
return (double)num1/num2;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 2 numbers");
int a = sc.nextInt();
int b = sc.nextInt();
//System.out.println(ThrowDemo.divide(a, b));
System.out.println(divide(a, b));
}
}
