package test;
import java.sql.*;
import java.util.*;
public class DBCon10 {

	public static void main(String[] args) {

    try {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter acc no" );
    	long accno=Long.parseLong(s.nextLine());
    	System.out.println("ENter customer name" );
    	String custname=s.nextLine();
    	System.out.println("ENter balance" );
    	float bal =Float.parseFloat(s.nextLine());
    	System.out.println("ENter account type" );
    	String accType=s.nextLine();
    	System.out.println("ENter address" );
    	String addr=s.nextLine();
    	System.out.println("ENter mailid" );
    	String mid=s.nextLine();
    	System.out.println("ENter phone no" );
    	long phNo=Long.parseLong(s.nextLine());
    	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","sagar");
		//loading driver and creating connection
    	CallableStatement cs=con.prepareCall("{call CreateAccount41(?,?,?,?,?,?,?)}");
    	cs.setLong(1, accno);
    	cs.setString(2, custname);
    	cs.setFloat(3, bal);
    	cs.setString(4, accType);
    	cs.setString(5,addr);
    	cs.setString(6,mid);
    	cs.setLong(7,phNo);
    	cs.execute();//execute procedure
    	s.close();
    	con.close();
    	
    	
    	
    	
    	
    	
    }catch(Exception e)
    {
    	e.printStackTrace();
    }

	}

}
