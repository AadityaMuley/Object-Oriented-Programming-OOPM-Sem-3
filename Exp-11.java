import java.util.*;
class ArrayListDemo{
public static void main(String args[])
{
System.out.println("Program for implementing ArrayList");
ArrayList<String>obj = new ArrayList<String>();
System.out.println("Inserting names of bank account holders");
obj.add("Tom Hnaks");
obj.add("Christian Bale");
obj.add("Leonardo Dicaprio");
obj.add("Matt Damon");
obj.add("Adam Sandler");
System.out.println("The elements are : "+obj);
System.out.println("Inserting names in between");
obj.add(4,"Gordon Ramsay");
System.out.println("Array elements after inserting in between : "+obj);
System.out.println("Removing some elements from array : ");
obj.remove(1);
System.out.println("Array elements after removing in between : "+obj);
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
class Fortune {
public static void main(String args[]) {
ArrayList<String>obj = new ArrayList<String>();
obj.add("You will go to hell");
obj.add("You will live long");obj.add("You will be rejected");
obj.add("You are going to die");
obj.add("You will have a nice day");
obj.add("You will fall from stairs");
obj.add("Your crush will propose you");
obj.add("You will fail in exams");
obj.add("You will beat someone in games");
obj.add("You will have a hard day");
obj.add("You will lose your job");
obj.add("You will have a breakup");
System.out.println("Enter your favourite number :");
int n = (new Scanner(System.in)).nextInt();
n%=12;
System.out.println(obj.get(n));
}
}
