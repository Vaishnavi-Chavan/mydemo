package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Datacon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vaishudb","root","vairac@123");
				Statement st=(Statement) conn.createStatement();
				//String str="insert into office values(110,'Parikshit',25,35000)";
				//st.executeUpdate(str);
				//String str1="update office set age=24 where name='Parikshit'";
				//st.executeUpdate(str1);
				String str2="delete from office where name='Parikshit'";
				st.executeUpdate(str2);
				ResultSet rset=st.executeQuery("select * from office");
				while(rset.next())
				{
					System.out.println(rset.getString(1)+"           "+rset.getString(2)+"                "+rset.getString(3)+"                "+rset.getString(4)); 
				}
				
			} catch (Exception e) 
			{
				System.out.println("The error are:   " + e);
			}

		}

	}