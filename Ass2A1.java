class MyThread extends  Thread
{
String  message;
int n;
MyThread (String message, int n) throws Exception
{
this .message=message;
this.n=n;
//start();
//join();
}
public void run()
{
try
{
for(int i=1;i<=n;i++)
{
System.out.println(message +"-"+i+"Times");
Thread .sleep(500);
}
}
catch (InterruptedException ie){} 
}
}
 class Ass2A1

{
public static void main(String [] args) throws Exception
{
MyThread t1=new MyThread("COVID19",10);
System.out.println(t1);
t1.start();
MyThread t2=new MyThread("LOCKDOWN2020",20);
System.out.println(t2);
t2.start();
MyThread t3=new MyThread("VACCINATED2021",30);
System.out.println(t3);
t3.start();
}
}
