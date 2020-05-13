//Define a class to represent a bank account.
import java.util.*;
public class bankdetails
{
static String name;
static long accno;
static double balance;
static String acctype;
static Scanner sc = new Scanner(System.in);
void getData()
{
System.out.println("Enter name of account holder :");
name = sc.next();
System.out.println("Enter account number :");
accno = sc.nextLong();
System.out.println("Enter balance :");
balance = sc.nextDouble();
System.out.println("Enter account type :");
acctype = sc.next();
}
void deposit()
{
System.out.println("Enter amount to deposit :");
double balance = sc.nextDouble();
this.balance = this.balance + balance;
}
void withdraw()
{
System.out.println("Enter amount to withdraw :");
double balance = sc.nextDouble();
this.balance = this.balance - balance;
}void display()
{
System.out.println("Name\tAccountNumber\tType\tBalance($)");
System.out.println(name+"\t"+accno+"\t"+acctype+"\t"+balance);
}
public static void main(String args[])
{
bankdetails ob = new bankdetails();
while(true)
{
boolean x = false;
System.out.println("Enter you choice :");
System.out.println("1] Enter data");
System.out.println("2] Deposit");
System.out.println("3] Withdraw");
System.out.println("4] Display");
System.out.println("5] Exit");
int choice = sc.nextInt();
switch(choice)
{
case 1:
ob.getData();
break;
case 2:
ob.deposit();
break;
case 3:
ob.withdraw();
break;
case 4:
ob.display();
break;
case 5:
x = true;
break;
default :
System.out.println("Wrong Choice");
}if(x == true)
break;
}
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Define a class to create a customized calculator to calculate armstrong, palindrome, duck number.
import java.util.*;
public class customizedCalc
{
static Scanner sc = new Scanner(System.in);
static int no;void armstrong()
{
int t=no;
int r,s=0;
while(t!=0)
{
r=t%10;
s=s+(r*r*r);
t=t/10;
}
if(s==no)
System.out.println("The entered number is Armstrong.");
else
System.out.println("The entered number is not Armstrong.");
}
void palindrome()
{
int t=no;
int r,s=0;
while(t!=0)
{
r=t%10;
s=(s*10)+r;
t=t/10;
}
if(s==no)
System.out.println("The entered number is Palindrome.");
else
System.out.println("The entered number is not Palindrome.");
}
void duck()
{
int t=no;
int r,s=0;
boolean x=false;
while(t!=0)
{
r=t%10;if(t/10==0)
{
if(r==0)
break;
}
if(r==0)
{
x=true;
break;
}
t=t/10;
}
if(x==true)
System.out.println("The entered number is Duck Duck Go.");
else
System.out.println("The entered number is not Duck Duck Go.");
}
public static void main(String args[])
{
customizedCalc ob = new customizedCalc();
System.out.println("Enter a number :");
no = sc.nextInt();
System.out.println("Enter your choice :");
System.out.println("1] Armstrong");
System.out.println("2] Palindrome");
System.out.println("3] Duck Duck Go");
int choice=sc.nextInt();
switch(choice)
{
case 1:
ob.armstrong();
break;
case 2:
ob.palindrome();
break;
case 3:
ob.duck();
break;
default : System.out.println("Wrong choice.");
}}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Student info database search
import java.util.*;
public class Exp_2_menudriven
{
static int rollno[] = {1,2,3};
static String name[] = new String[3];
static Float pointer[] = new Float[3];
static String address[] = new String[3];public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
while(true)
{
System.out.println("Enter your choice : ");
System.out.println("1) Enter details ");
System.out.println("2) Search ");
System.out.println("3) Display ");
int choice = sc.nextInt();
switch(choice)
{
case 1 :
for(int i=0;i<rollno.length;i++)
{
System.out.println("Enter name, pointer, address of "+(i+1)+"
student");
name[i] = sc.next();
pointer[i] = sc.nextFloat();
address[i] = sc.next();
}
break;
case 2 :
System.out.println("Enter roll no to search :");
int r = sc.nextInt();
System.out.println("Name : "+name[r-1]);
System.out.println("Pointer : "+pointer[r-1]);
System.out.println("Address : "+address[r-1]);
break;
case 3 :
System.out.println("Roll_No\tName\tPointer\tAddress");
for(int i=0;i<rollno.length;i++)
{
System.out.println(rollno[i]+"\t"+name[i]+"\t"+pointer[i]
+"\t"+address[i]);
}
break;
default : System.out.println("Wrong choice");
}
System.out.println("Enter 1 to try again anything else to exit");
char f = sc.next().charAt(0);
if(f!='1')break;
}
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Greatest number
import java.util.*;
public class greatest_3
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter 3 numbers :");
int no1 = sc.nextInt();
int no2 = sc.nextInt();
int no3 = sc.nextInt();
if(no1>no2 && no1>no3)
System.out.println("Greatest number is : "+no1);
else if(no2>no1 && no2>no3)
System.out.println("Greatest number is : "+no2);
else
System.out.println("Greatest number is : "+no3);
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Prime number
import java.util.*;
public class prime_no
{
public static void main(String args[])
{
prime_no ob =new prime_no();
Scanner sc = new Scanner(System.in);
System.out.println("Enter a limit to check for prime numbers :");
int no = sc.nextInt();
int f=0;
for(int i=1;i<=no;i++)
{
boolean x = ob.isPrime(i);
if(x==true)
f++;
}
System.out.println("Total no of prime nos : "+f);}
boolean isPrime(int a)
{
int f=0;
for(int i=1;i<=a;i++)
{
if(a%i==0)
{
f++;
}
}
if(f==2)
{
System.out.println(a);
return(true);
}
else
return(false);
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Reverse number
import java.util.*;
public class reverse_no
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to reverse :");
int no = sc.nextInt();
int t=no;
int r,s=0;while(t!=0)
{
r=t%10;
s=(s*10)+r;
t=t/10;
}
System.out.println("Reverse of the number is : "+s);
}
}
