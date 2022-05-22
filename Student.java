import java.util.*;
import java.io.*;
public class Student
{
public static void main(String args[]) throws IOException
{
String stud;
LinkedList<String> a1 = new LinkedList<String>();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("How many Students");
int no = Integer.parseInt(br.readLine());
for(int i=0; i<no; i++)
{
	System.out.println("Enter Student Name"+ (i+1) + ":");
	stud=br.readLine();
	a1.add(stud);
}
System.out.println(a1);
Iterator itr = a1.iterator();
while(itr.hasNext())
{
	itr.next();
	itr.remove();
}
System.out.println("After removing Elements");
}
}

