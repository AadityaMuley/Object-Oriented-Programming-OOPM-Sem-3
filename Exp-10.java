class X implements Runnable
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("thread X = "+i);
}
System.out.println("end of thread");
}
}
class Y implements Runnable
{
public void run()
{
for(int i=6;i<=10;i++)
{
System.out.println("thread Y is = "+i);
}
System.out.println("end of thread 2");
}
}
class Z implements Runnable
{
public void run()
{
for(int i=11;i<=12;i++)
{
System.out.println("thread Z = "+i);
}
System.out.println("end of thread 3");
}
}
class RunnableTest
{
public static void main(String[]args)
{
X x1=new X();
Y y1=new Y();
Z z1=new Z();
new Thread(x1).start();
new Thread(y1).start();new Thread(z1).start();
System.out.println("end of main thread");
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.lang.*;
class Even extends Thread
{
public void run()
{
try
{
for(int i=2;i<=10;i=i+2)
{
System.out.println("\tEven thread: "+i);
Thread.sleep(500);
}
}
catch(InterruptedException e)
{}
}
}
class Odd extends Thread
{
public void run()
{
try
{
for(int i=1;i<=10;i=i+2)
{
System.out.println("\tOdd thread: "+i);
Thread.sleep(500);
}}
catch(InterruptedException e)
{}
}
}
class EvenOdd
{
public static void main(String[]args)
{
new Even().start();
new Odd().start();
System.out.println("exit from main");
}
}
