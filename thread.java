import java.util.*;
import java.io.*;

class ThreadDemo extends Thread
{
	public void run()
{
	for(int i=1;i<5;i++)
	System.out.println("Hello"+i);
}
}
	class My {

	public static void main(String args[])
{
ThreadDemo t1=new ThreadDemo();
System.out.println(t1);
t1.start();
}
}

