//Scanner class
import java.util.*;
public class array_display
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println(" Enter 10 numbers :");
int a[] = new int[10];
for(int i=0;i<10;i++)
{
a[i] = sc.nextInt();
}
System.out.println();
System.out.println("The 10 integers are = ");
for(int i=0;i<10;i++)
{
System.out.println(a[i]);
}
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//sum of numbers
import java.util.*;
public class array_sum
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println(" Enter 10 numbers to calculate the sum :");
int a[] = new int[10];
int sum=0;
for(int i=0;i<10;i++)
{
a[i] = sc.nextInt();
sum = sum+a[i];
}
System.out.println("The sum of 10 integers = "+sum);
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Largest number
import java.util.*;
public class array_largest
{
public static void main(String args[])
{Scanner sc = new Scanner(System.in);
System.out.println(" Enter 10 numbers :");
int a[] = new int[10];
for(int i=0;i<10;i++)
{
a[i] = sc.nextInt();
}
int max = a[0];
for(int i=1;i<10;i++)
{
if(a[i]>max)
max = a[i];
}
System.out.println("Largest number = "+max);
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Integer and String array sort
import java.util.*;
public class array_sort
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println(" Enter 10 numbers :");
int a[] = new int[10];
for(int i=0;i<10;i++)
{
a[i] = sc.nextInt();
}System.out.println(" Enter 10 Strings :");
String b[] = new String[10];
for(int i=0;i<10;i++)
{
b[i] = sc.next();
}
System.out.println("Original integer array :");
for(int i=0;i<10;i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
System.out.println("Original string array :");
for(int i=0;i<10;i++)
{
System.out.print(b[i]+" ");
}
System.out.println();
Arrays.sort(a);
Arrays.sort(b);
System.out.println("Sorted integer array :");
for(int i=0;i<10;i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
System.out.println("Sorted string array :");
for(int i=0;i<10;i++)
{
System.out.print(b[i]+" ");
}
System.out.println();
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Matrix calculation
import java.util.*;
public class matrix_op
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println(" Enter values into 1st 3x3 matrix :");int a[][] = new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
a[i][j] = sc.nextInt();
}
}
System.out.println(" Enter values into 2nd 3x3 matrix :");
int b[][] = new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
b[i][j] = sc.nextInt();
}
}
int c[][] = new int[3][3];
System.out.println("Addition :");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
c[i][j] = a[i][j] + b[i][j];
}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println();
}
System.out.println("Subtrction :");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++){
c[i][j] = a[i][j] - b[i][j];
}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println();
}
System.out.println("Multiplication :");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
c[i][j] = 0;
for (int k=0;k<3;k++)
c[i][j] += a[i][k] * b[k][j];
}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Common in 2 arrays
import java.util.*;
public class array_common
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String a[] = new String[3];
String b[] = new String[3];
System.out.println("Enter string values for 1st array:");
for(int i=0;i<3;i++)
{
a[i] = sc.next();
}
System.out.println();
System.out.println("Enter string values for 2nd array:");
for(int i=0;i<3;i++)
{
b[i] = sc.next();
}
System.out.println("Common values:");
for(int i=0;i<3;i++)
{for(int j=0;j<3;j++)
{
if(a[i].equalsIgnoreCase(b[j]))
System.out.println(a[i]+" "+b[j]);
}
}
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//sum of numbers - array
import java.util.*;
class sumTest
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a[] = new int[6];
System.out.println("Enter 6 numbers :");
for(int i=0;i<6;i++)
{
a[i] = sc.nextInt();
}
System.out.println("Enter the sum amount :");
int sum = sc.nextInt();
for(int i=0;i<6;i++)
{
for(int j=i+1;j<6;j++)
{
if(a[i]+a[j]==sum)
{
System.out.println(a[i]+" "+a[j]);
}}
}
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//2nd largest number - array
import java.util.*;
public class array_2ndlargest
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println(" Enter 10 numbers :");
int a[] = new int[10];
for(int i=0;i<10;i++)
{
a[i] = sc.nextInt();
}
int max1 = a[0];
int max2 = a[0];
for(int i=1;i<10;i++)
{
if(a[i]>max1)
{
max2=max1;
max1 = a[i];
}
}
System.out.println("2nd largest number = "+max2);
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//evn odd array sort
import java.util.*;
class oddevensort
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println(" Enter 10 numbers :");
int a[] = new int[10];
int o[] = new int[10];
int e[] = new int[10];
int k=0,l=0;
for(int i=0;i<10;i++)
{
a[i] = sc.nextInt();
if(a[i]%2==0)
{
e[k] = a[i];
k++;
}
else
{
o[l] = a[i];
l++;
}
}
int t = k;
k=0;l=0;
int c[] = new int[10];
for(int i=0;i<10;i++)
{
if(i<=(t-1))
{
c[i] = e[k];
k++;
}
else
{
c[i] = o[l];
l++;
}
}
System.out.println("Sorted array acc even and odd:");
for(int i=0;i<10;i++)
{
System.out.print(c[i]+" ");
}
System.out.println();
}
}
