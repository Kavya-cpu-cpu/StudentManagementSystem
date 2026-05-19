package main;

import java.util.Scanner;

import dao.StudentDAO;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student");
            System.out.println("6. Count Total Students");
            System.out.println("7. Exit");

            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    dao.addStudent();
                    break;

                case 2:
                    dao.viewStudents();
                    break;

                case 3:
                    dao.updateStudent();
                    break;

                case 4:
                    dao.deleteStudent();
                    break;

                case 5:
                    dao.searchStudent();
                    break;

                case 6:
                    dao.countStudents();
                    break;

                case 7:
                    System.out.println("Thank You...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}