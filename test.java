  import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class test {

    public  static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/";
        String username="root";
        String password="Priya@1980";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Database name:");
        String dbname=sc.nextLine();
        System.out.println("Enter Table name:");
        String tbname=sc.nextLine();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url, username, password);
            Statement stmt=conn.createStatement();
            String query="CREATE DATABASE "+dbname;
            stmt.executeUpdate(query);
            System.out.println("created successfully");
             conn=DriverManager.getConnection(url+dbname, username, password);
             stmt=conn.createStatement();
             String create="CREATE TABLE "+tbname+"(emp_id INT ,emp_name VARCHAR(100),salary INT,dept VARCHAR(100))";
             stmt.executeUpdate(create);
             String insert="INSERT INTO "+tbname+" VALUES(101,'pravin',200000,cse);";
             stmt.executeUpdate(insert);
             String insert1="INSERT INTO "+tbname+" VALUES(102,'priya',300000,da);";
             stmt.executeUpdate(insert1);
             System.out.println("Inserted Successfully");
             String update="UPDATE TABLE SET emp_id=1 WHERE emp_name='pravin'";
             stmt.executeUpdate(update);
             String delete="DELETE FROM tablename WHERE salary<100000";
                stmt.executeUpdate(delete);
                String add="ALTER TABLE"+tbname+"ADD'email' VARCHAR(100)";
                       stmt.executeUpdate(add);
             sc.close();
            stmt.close();
            conn.close();
        } catch  (Exception e) {
            System.out.println(e);
        }
    }
    
}
