/**
 * 
 */
package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.login.DBConnect;
import com.login.User;

public class DBConnect {
//  For connection pipeline
    public Connection con;
    
    // For executing queries 
    public Statement st;
    
    // To store data returned from statement
    public ResultSet rs;
   
    // Driver required to make SQL Server and application talk.
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    
    // Database URL (That is database location)
    static final String DB_URL = "jdbc:mysql://localhost:3305/employeeproject";
    
    // Database username and password.
    static final String DUSER = "root";
    static final String DPASS = "root"; // bad practice to store password like this instead store passwords in env variables.
    
    
    // Holds the query 
    public String query;
    
    // Holds user id. (Can be used as session ID)
    public String UserName;
    
    // Stores update flag. If database updated successfully then its set to true
    int executeUpdate;
    
        
    // Auto connects to database
    public DBConnect(){
        
        try{
            Class.forName(JDBC_DRIVER);
            
            // To set up a connect
            con = DriverManager.getConnection(DB_URL,DUSER,DPASS);
            
            // To execute statement 
            st = con.createStatement();
                      
        }catch(ClassNotFoundException | SQLException ex){System.out.println("Err in connect: " + ex);}
    }
    
    /*
    // REQUIRED DURING REG
    public boolean register(String email, String pass, String name, String birthday, String gender){
        
        // Hashing password to store into database
        long phash = pass.hashCode();
        
        try{
            // Check if user already exists in database
            query = String.format("SELECT * FROM register WHERE email = '%s' AND hash = '%s'",email,phash);
            rs = st.executeQuery(query);
           
            // If user does not exists.
            if (rs.next() == false)
            {
                // Inserting into database
                query = String.format("INSERT INTO register(email,hash,birthday,gender) VALUES('%s','%d','%s','%s')",email,phash,birthday,gender);
                
                // Returns 1 if success.
                executeUpdate = st.executeUpdate(query);
                
                // Insert name into user table
                query = String.format("INSERT INTO users(name) VALUES('%s')",name);
                                       
                executeUpdate = st.executeUpdate(query);
                
                if(executeUpdate == 1)
                {
                    System.out.println("Registered Succesfully!");
                    return true;
                }
                System.out.println("Success!");
                
            }
            else
            {                
                System.out.println("User by that email already exists!");
                return false;
            }
            
        }catch(Exception ex){System.out.println("Err register: "+ex);}
        
        return false;
    }
    
    */
  
    public boolean login(String username, String password)
    {
        
        query = String.format("SELECT * FROM login WHERE username = '%s' AND password = '%s'",username,password);
        
        try 
        {            
            rs = st.executeQuery(query);
            
            if(rs.next() == false)
            {
             // THEN SHOW ERROR AND DO NOT LET USER LOG IN !                
                return false;                
            }
            else
            {     return true;    
//                this.UID = rs.getInt("idregister"); 
//                
//                System.out.println("From loginfunction " + this.UID);
            }
                                    
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
        
    }
     
 public boolean admin(String id, String fname,String lname,String dep,String post,String email,String contact,String address,String date,String bs,String hra,String ta,String fbp,String bonus,String pf,String tax){
        
        // Hashing password to store into database
       // long phash = pass.hashCode();
        
        try{
            // Check if user already exists in database
            query = String.format("SELECT * FROM employeedata WHERE id = '%s'",id);
            rs = st.executeQuery(query);
           
            // If user does not exists.
            if (rs.next() == false)
            {
                // Inserting into database
                query = String.format("INSERT INTO employeedata(id,fname,lname,dep,post,email,contact,address,date,bs,hra,ta,fbp,bonus,pf,tax) VALUES('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')",id,fname,lname,dep,post,email,contact,address,date,bs,hra,ta,fbp,bonus,pf,tax);
                
                // Returns 1 if success.
                executeUpdate = st.executeUpdate(query);
                
                // Insert name into user table
           //     query = String.format("INSERT INTO users(name) VALUES('%s')",name);
                                       
             //   executeUpdate = st.executeUpdate(query);
                
                if(executeUpdate == 1)
                {
                    System.out.println("Registered Succesfully!");
                    return true;
                }
                System.out.println("Success!");
                
            }
            else
            {                
                System.out.println("id already exists!");
                return false;
            }
            
        }catch(Exception ex){System.out.println("Err register: "+ex);}
        
        return false;
    }
    
    
//    public boolean admin(String id, String fname,String lname,String dep,String post,String email,String contact,String address,String date,String bs,String hra,String ta,String fbp,String bonus,String pf,String tax)
//    {
//    	
//        
//        query = String.format("SELECT * FROM employeedata WHERE id = '%s'",id);
//        
//        try 
//        {            
//            rs = st.executeQuery(query);
//            
//            if(rs.next() == false)
//            {
//             // THEN SHOW ERROR AND DO NOT LET USER LOG IN !                
//            	System.out.println("same id is present");
//                return false;                
//            }
//            else
//            {     
//            	System.out.println("employee entered succesfully");
//            	
//            	return true;    
//            
//            	
////                this.UID = rs.getInt("idregister"); 
////                
////                System.out.println("From loginfunction " + this.UID);
//            }
//                                    
//        } catch (SQLException ex) {
//            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        return true;
//        
//    }
//     
    
  //  public ArrayList<User> userList(String username) {
//    	ArrayList<User> userList = new ArrayList<>();
//    	 try {          
//             
//             query = String.format("SELECT math,english,physics,chemistry FROM users WHERE username = '%s'",username);
//             
//             // Select data from database
//             rs = st.executeQuery(query);
//             User user;
////             System.out.println("Math mark " + rs.getString("math"));
//             while(rs.next()){
//            	 
//                 user = new User(rs.getString("math"),rs.getString("english"),rs.getString("physics"),rs.getString("chemistry"));
//                 
//                 // Add to user list
//                 userList.add(user);
//                 
//             }
//    	 }catch (SQLException ex) {
//             Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
//         }
//    	
//    	return userList;
//    }
 public ArrayList<User> employeelist(String id){
 	ArrayList<User> employeelist = new ArrayList<>();
 	System.out.println("Hello from dbconnect");
 	try {          
       
       query = String.format("SELECT * FROM employeedata where id='%s'",id);
       
       // Select data from database
       rs = st.executeQuery(query);
       
       User e;
       
       while(rs.next()){
      	 
           e = new User(rs.getString("id"),rs.getString("fname"),rs.getString("lname"),rs.getString("dep"),rs.getString("post"),rs.getString("email"),rs.getString("contact"),rs.getString("address"),rs.getString("date"),rs.getString("bs"),rs.getString("hra"),rs.getString("ta"),rs.getString("fbp"),rs.getString("bonus"),rs.getString("pf"),rs.getString("tax"));
           
           System.out.println(e.email);
           
         
           employeelist.add(e);
           
       }
	 }catch (SQLException ex) {
       Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
   }
 	
 	return employeelist;
}
 
// public ArrayList<User1> employeelist1(){
//	 	ArrayList<User1> employeelist1 = new ArrayList<>();
//	 	System.out.println("Hello from dbconnect");
//	 	try {          
//	       
//	       query = String.format("SELECT * FROM employeedata");
//	       
//	       // Select data from database
//	       rs = st.executeQuery(query);
//	       
//	       User1 e;
//	       
//	       while(rs.next()){
//	      	 
//	           e = new User1(rs.getString("id"),rs.getString("fname"),rs.getString("lname"),rs.getString("dep"),rs.getString("post"),rs.getString("email"),rs.getString("contact"),rs.getString("address"),rs.getString("date"),rs.getString("bs"),rs.getString("hra"),rs.getString("ta"),rs.getString("fbp"),rs.getString("bonus"),rs.getString("pf"),rs.getString("tax"));
//	           
//	           System.out.println(e.email);
//	           
//	         
//	           employeelist1.add(e);
//	           
//	       }
//		 }catch (SQLException ex) {
//	       Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
//	   }
//	 	
//	 	return employeelist1;
//	}
// 
 
 
// public ArrayList<User> employeelist1(){
//	 	ArrayList<User> employeelist1 = new ArrayList<>();
//	 	System.out.println("Hello from dbconnect");
//	 	try {          
//	       
//	       query = String.format("SELECT * FROM employeedata where id=111");
//	       
//	       // Select data from database
//	       rs = st.executeQuery(query);
//	       
//	       User e;
//	       
//	       while(rs.next()){
//	      	 
//	           e = new User(rs.getString("id"),rs.getString("fname"),rs.getString("lname"),rs.getString("dep"),rs.getString("post"),rs.getString("email"),rs.getString("contact"),rs.getString("address"),rs.getString("date"),rs.getString("bs"),rs.getString("hra"),rs.getString("ta"),rs.getString("fbp"),rs.getString("bonus"),rs.getString("pf"),rs.getString("tax"));
//	           
//	           System.out.println(e.email);
//	           
//	         
//	           employeelist1.add(e);
//	           
//	       }
//		 }catch (SQLException ex) {
//	       Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
//	   }
//	 	
//	 	return employeelist1;
//	}
// 
 
    // Always a good habit to close connections to database.
    public void close()
    {
        try { rs.close(); } catch (Exception e) { /* ignored */ }
        try { st.close(); } catch (Exception e) { /* ignored */ }
        try { con.close(); } catch (Exception e) { /* ignored */ }
    }

	public boolean employeelist(String id, String fname, String lname, String dep, String post, String email,
			String contact, String address, String date, String bs, String hra, String ta, String fbp, String bonus,
			String pf, String tax) {
		// TODO Auto-generated method stub
		return false;
	}



    
//	public boolean User(String id, String fname, String lname, String dep, String post, String email, String contact,
//			String address, String date, String bs, String hra, String ta, String fbp, String bonus, String pf,
//			String tax) {
//		// TODO Auto-generated method stub
//	    try{
//            // Check if user already exists in database
//            query = String.format("SELECT * FROM  WHERE  = '%s'",carname);
//            rs = st.executeQuery(query);
//           
//            // If user does not exists.
//            if (rs.next() == false)
//            {
//                // Inserting into database
//                query = String.format("INSERT INTO carmodels(carname,cartype,carprice) VALUES('%s','%s','%s')",carname,cartype,carprice);
//                
//                // Returns 1 if success.
//                executeUpdate = st.executeUpdate(query);
//                
//                // Insert name into user table
//                //query = String.format("INSERT INTO users(name) VALUES('%s')",name);
//                                       
//                //executeUpdate = st.executeUpdate(query);
//                
//                if(executeUpdate == 1)
//                {
//                    System.out.println("Car Added Succesfully!");
//                    return true;
//                }
//                System.out.println("Success!");
//                
//            }
//            else
//            {                
//                System.out.println("Try another Carname");
//                return false;
//            }
//            
//        }catch(Exception ex){System.out.println("Err register: "+ex);}
//        
//        return false;
//		
//	
//	}
//	
	
	
}
