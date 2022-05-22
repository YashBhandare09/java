import java.util.*;
import java.io.*;

public class CurrentThreadDemo
{
	public static void main(String[] args)
{
	Thread t = Thread.currentThread();
	System.out.println("Current thread name = "+ t.getName());
	System.out.println("Priority = "+t.getPriority());
	if(t.isAlive())
System.out.println("Main thread is alive");
	else 
System.out.println("Main thread is not alive");
}
}
