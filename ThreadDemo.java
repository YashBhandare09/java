import java.util.*;
import java.io.*;

class ThreadDemo implements Runnable
{
	public static void main(String args[])	public  void run()
{
	for(int i=1;i<5;i++)
	System.out.println("Hello"+i);
}
}
class RunnableDemo
 {

	public static void RunnableDemo(String args[])
{

ThreadDemo th=new ThreadDemo();
Thread t1= new Thread(th);
System.out.println("t1");
t1.start();
}
}



