//String functions
import java.util.*;
public class ass_2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string :");
String st = sc.nextLine();
String s = st.toUpperCase();
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Vectors
import java.util.*;
public class ass_3
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);Vector a = new Vector();
a.add(new Integer(1));
a.add(new Integer(2));
a.add(new Integer(3));
a.add(new Integer(4));
a.add(new Integer(5));
a.add(new String("ABCD"));
a.add(new String("EFGH"));
a.add(new String("IJKL"));
a.add(new Character('M'));
a.add(new Character('N'));
a.add(new Double(6.9));
a.add(new Double(69.69));
System.out.println(a);
System.out.println("Adding at and.");
a.add(new String("OPQR"));
System.out.println(a);
a.removeElementAt(1);
System.out.println("Removing 2nd");
System.out.println(a);
System.out.println("Enter to search");
String s = new String();
s = sc.next();
boolean x = a.contains(s);
if(x == true)
System.out.println("Element is present");
else
System.out.println("Element is not present");
System.out.println("LAST = "+a.lastElement());
System.out.println("FIRST = "+a.firstElement());
System.out.println(a);
}}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//String character position
class charpos
{
public static void main(String args[])
{
String s = "Hello Universe";
System.out.println("Length of original string : "+s.length());
for(int i=0;i<s.length();i++)
{
System.out.println("Character at "+(i+1)+" position is :
"+s.charAt(i));
}
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Language vector
import java.util.*;
public class LanguageVector
{
public static void main(String args[])
{
Vector list = new Vector();
int length = args.length;
for(int i=0;i<length;i++)
{
list.addElement(args[i]);
}
list.insertElementAt("COBOL",2);
int size = list.size();
String listArray[] = new String[size];
list.copyInto(listArray);
System.out.println("list of languages");
for(int i=0;i<size;i++)
{
System.out.println(listArray[i]);
}
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Password
import java.util.*;
public class password
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String pass = "julia";
System.out.println("Enter password.");
String p = sc.nextLine();
if(p.equalsIgnoreCase(pass))
{
System.out.println("Correct Password.");
String q = p+" !!!Welcome to Java!!!";
System.out.println(q);
StringBuffer sb = new StringBuffer(q);
System.out.println(sb.reverse());
System.out.println(q.replace('!','*'));
}
else
{
System.out.println("Incorrect password.");
}
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//more String functions
class strfunc
{
public static void main(String args[])
{
StringBuffer s = new StringBuffer("Hello Universe....");
System.out.println("OG string : "+s);System.out.println("length : "+s.length()+" OG capacity :
"+s.capacity());
System.out.println("Cahr at 5th pos : "+s.charAt(4));
System.out.println(s.append(". Hee Hee Haa Haa."));
System.out.println(s.insert(3," Yo. "));
System.out.println(s.indexOf(" Yo. "));
System.out.println(s.delete(3," Yo. ".length()));
System.out.println(s.substring(3));
System.out.println(s.reverse());
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//String modify
class StringModify
{
public static void main(String args[])
{
StringBuffer s = new StringBuffer("Java Browser");
s.insert(4,"-Enabled");
System.out.println(s);
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//substring
import java.util.*;
public class strSearch{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter String");
String s = sc.nextLine();
System.out.println("Enter search string");
String b = sc.next();
int f = 0;
for(int i=0;i<s.length()-b.length()-1;i++)
{
if(s.charAt(i) == b.charAt(0))
{
String s2 = s.substring(i,b.length());
if(s2.equalsIgnoreCase(b))
f++;
}
}
System.out.println("freq = "+f);
}
}
