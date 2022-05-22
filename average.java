class MyThread extends Thread
{
int[] arr;
int sum=0,pos;

MyThread(int p,int a[])
{
arr=a;
pos=p;
}

public void run()
{
for (int i=pos;i<pos+100;i++)
sum+=arr[i];
}
int getsum()
{
return sum;
}
}

class average
{
public static void main(String args[])throws InterruptedException
{
int sum=0;
int myarray[]=new int[1000];
for(int i=0;i<1000;i++)
myarray[i]=(int)(1000.0*Math.random());
MyThread[] t=new MyThread[10];
for(int i=0;i<10;i++)
{
t[i]=new MyThread(i*100,myarray);
t[i].start();
t[i].join();
}
for(int i=0;i<10;i++)
{
sum+=t[i].getsum();
System.out.println("Sum="+sum);
System.out.println("Average="+sum/100);
}
}
}
