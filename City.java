import java.util.*;
import java.io.*;
public class City
{
public static void main(String args[]) throws IOException
{
String city;
ArrayList<String> a1 = new ArrayList<String>();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("How many Cities");
int no = Integer.parseInt(br.readLine());
for(int i=0; i<no; i++)
{
	System.out.println("Enter city"+ (i+1) + ":");
	city=br.readLine();
	a1.add(city);
}
System.out.println(a1);
Iterator itr = a1.iterator();
while(itr.hasNext())
{
	itr.next();
	itr.remove();
}
System.out.println("After removing Elements list is empty");
}
}

