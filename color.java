import java.util.*;
import java.io.*;
 class color
{
public static void main(String args[]) throws IOException
   {
        TreeSet<String> ts=new TreeSet<String>();
          String ip;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter How Many Colours");
        int no=Integer.parseInt(br.readLine());
        for(int i=0;i<no;i++)
        {
            System.out.println("Enter name of colour"+ (i+1) + ":");
            ip=br.readLine();
            ts.add(ip);
    }
          System.out.println("-----------Display contents---------");
          System.out.println(ts);
          System.out.println("enter colour name to search");
          String f=br.readLine();
          boolean b=ts.contains(f);
          if(b)
           System.out.println("yes");
           else
           System.out.println("No");  
}
}
