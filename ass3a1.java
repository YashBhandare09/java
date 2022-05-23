import java.io.*;
import java.sql.*;
class ass2B1_jdbc
{
	public static void main(String args[])throws IOException
	{
		Connection conn=null;
		ResultSet rs=null;
		PreparedStatement ps1=null;
		PreparedStatement ps2=null;
		Statement st=null;
		
		int ch=1;
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection("jdbc:postgresql://localhost/TYDIVB","scos","scos");
			System.out.println("Successfull connection");
			 st=conn.createStatement();
		
			while(ch==1)
			{
				System.out.println("Menu:- \n1.Insert \n2.Modify \n3.Delete \n4.Search \n5.View All \n6.Exit");
				System.out.println("Enter your choice:-  ");
				int a=Integer.parseInt(br.readLine());
				switch(a)
				{
					case 1:System.out.println("Enter RollNo:  ");
					int r=Integer.parseInt(br.readLine());
					System.out.println("Enter student name:-  ");
					String nm=br.readLine();
					System.out.println("Enter percentage:-  ");
					int per=Integer.parseInt(br.readLine());
					String iq="insert into student values("+r+","+nm+","+per+")";
					st.executeUpdate(iq);
					break;
					
					case 2:System.out.println("Enter Roll no to Update:-  ");
					int r1=Integer.parseInt(br.readLine());
					System.out.println("Updation keys:- 1.Name \n 2.Marks");
					int k=Integer.parseInt(br.readLine());
					if(k==1)
					{
						System.out.println("Enter new name:-  ");
						String nm1=br.readLine();
						String uq1="update student set name="+nm1+" where rno="+r1;
						st.executeUpdate(uq1);
					}
					if(k==2)
					{
						System.out.println("Enter new percentage:-   ");
						int p1=Integer.parseInt(br.readLine());
						String uq2="update student set percentage="+p1+" where rno="+r1;
						st.executeUpdate(uq2);
					}
					while(rs.next())
					{
						System.out.println("Roll No:-  "+rs.getInt(1));
						System.out.println("Name:-  "+rs.getString(2));
						System.out.println("Percentage:-  "+rs.getInt(3));
					}
					break;
					
					case 3:System.out.println("Enter Roll no to Delete:-  ");
					int r2=Integer.parseInt(br.readLine());
					ps1=conn.prepareStatement("delete from student where rno="+r2);
					ps1.executeUpdate();
					while(rs.next())
					{
						System.out.println("Roll No:-  "+rs.getInt(1));
						System.out.println("Name:-  "+rs.getString(2));
						System.out.println("Percentage:-  "+rs.getInt(3));
					}
					break;
					
					case 4:System.out.println("Enter Roll no to search:-  ");
					int r3=Integer.parseInt(br.readLine());
					//ps2=conn.prepareStatement("select * from student where rno="+r3);
					rs=st.executeQuery("select * from student where rno="+r3);
					while(rs.next())
					{
						System.out.println("Roll No:-  "+rs.getInt(1));
						System.out.println("Name:-  "+rs.getString(2));
						System.out.println("Percentage:-  "+rs.getInt(3));
					}					break;
					
					case 5:rs=st.executeQuery("select * from student");
					while(rs.next())
					{
						System.out.println("Roll No:-  "+rs.getInt(1));
						System.out.println("Name:-  "+rs.getString(2));
						System.out.println("Percentage:-  "+rs.getInt(3));
					}
					break;
					
					case 6:
							st.close();
							conn.close();
							System.exit(0);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error..."+e);
		}
	}
}
					
ass2B1_jdbc.java
Displaying ass2B1_jdbc.java.