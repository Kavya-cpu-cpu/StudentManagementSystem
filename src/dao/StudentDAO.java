package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import db.DBConnection;

public class StudentDAO {

    Connection con = null;

    Scanner sc = new Scanner(System.in);

    // Add Student
public void addStudent() {

    try {

        con = DBConnection.getConnection();

        int id;

while (true) {

    System.out.println("Enter Student Id:");
    id = sc.nextInt();

    if (id > 0) {
        break;
    } else {
        System.out.println("Student Id must be positive");
    }
}

sc.nextLine();

        String name;

        while (true) {

            System.out.println("Enter Student Name:");
            name = sc.nextLine();

            if (!name.isEmpty()) {
                break;
            } else {
                System.out.println("Name cannot be empty");
            }
        }

        int age;

        while (true) {

            System.out.println("Enter Student Age:");
            age = sc.nextInt();

            if (age > 0) {
                break;
            } else {
                System.out.println("Age must be positive");
            }
        }

        sc.nextLine();

        String course;

        while (true) {

            System.out.println("Enter Student Course:");
            course = sc.nextLine();

            if (!course.isEmpty()) {
                break;
            } else {
                System.out.println("Course cannot be empty");
            }
        }

        String query = "INSERT INTO students VALUES(?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, age);
        ps.setString(4, course);

        int rows = ps.executeUpdate();

        if (rows > 0) {

            System.out.println("Student Added Successfully");
        }

    } catch (Exception e) {

        System.out.println(e);
    }
}

 // View Students
    public void viewStudents() {

        try {

            con = DBConnection.getConnection();

            String query = "SELECT * FROM students";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                System.out.println("---------------------");
                System.out.println("Id : " + rs.getInt("id"));
                System.out.println("Name : " + rs.getString("name"));
                System.out.println("Age : " + rs.getInt("age"));
                System.out.println("Course : " + rs.getString("course"));
            }

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    
    // Update Student
public void updateStudent() {

    try {

        con = DBConnection.getConnection();

        int id;

        while (true) {

            System.out.println("Enter Student Id to Update:");
            id = sc.nextInt();

            if (id > 0) {
                break;
            } else {
                System.out.println("Student Id must be positive");
            }
        }

        sc.nextLine();

        String name;

        while (true) {

            System.out.println("Enter New Name:");
            name = sc.nextLine();

            if (!name.isEmpty()) {
                break;
            } else {
                System.out.println("Name cannot be empty");
            }
        }

        int age;

        while (true) {

            System.out.println("Enter New Age:");
            age = sc.nextInt();

            if (age > 0) {
                break;
            } else {
                System.out.println("Age must be positive");
            }
        }

        sc.nextLine();

        String course;

        while (true) {

            System.out.println("Enter New Course:");
            course = sc.nextLine();

            if (!course.isEmpty()) {
                break;
            } else {
                System.out.println("Course cannot be empty");
            }
        }

        String query = "UPDATE students SET name=?, age=?, course=? WHERE id=?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, name);
        ps.setInt(2, age);
        ps.setString(3, course);
        ps.setInt(4, id);

        int rows = ps.executeUpdate();

        if (rows > 0) {

            System.out.println("Student Updated Successfully");

        } else {

            System.out.println("Student Id Not Found");
        }

    } catch (Exception e) {

        System.out.println("Failed to Update Student");
    }
}
       

    // Delete Student
public void deleteStudent() {

    try {

        con = DBConnection.getConnection();

        int id;

        while (true) {

            System.out.println("Enter Student Id to Delete:");
            id = sc.nextInt();

            if (id > 0) {
                break;
            } else {
                System.out.println("Student Id must be positive");
            }
        }

        String query = "DELETE FROM students WHERE id=?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);

        int rows = ps.executeUpdate();

        if (rows > 0) {

            System.out.println("Student Deleted Successfully");

        } else {

            System.out.println("Student Id Not Found");
        }

    } catch (Exception e) {

        System.out.println("Failed to Delete Student");
    }
}

            

       

    
   // Search Student
public void searchStudent() {

    try {

        con = DBConnection.getConnection();

        int id;

        while (true) {

            System.out.println("Enter Student Id to Search:");
            id = sc.nextInt();

            if (id > 0) {
                break;
            } else {
                System.out.println("Student Id must be positive");
            }
        }

        String query = "SELECT * FROM students WHERE id=?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            System.out.println("Student Found");
            System.out.println("-------------------");
            System.out.println("Id : " + rs.getInt("id"));
            System.out.println("Name : " + rs.getString("name"));
            System.out.println("Age : " + rs.getInt("age"));
            System.out.println("Course : " + rs.getString("course"));

        } else {

            System.out.println("Student Not Found");
        }

    } catch (Exception e) {

        System.out.println("Failed to Search Student");
    }
}
// Count Total Students
public void countStudents() {

    try {

        con = DBConnection.getConnection();

        String query = "SELECT COUNT(*) FROM students";

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        if (rs.next()) {

            System.out.println("Total Students : " + rs.getInt(1));
        }

    } catch (Exception e) {

        System.out.println("Failed to Count Students");
    }
}
           
        
}