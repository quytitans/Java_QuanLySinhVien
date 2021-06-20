package assignment.t2012e.view;

import assignment.t2012e.controller.StudentController;

import java.util.Scanner;

public class StudentMenu {
    Scanner scanner = new Scanner(System.in);
    StudentController studentController = new StudentController();

    public void generateStudentMenu() {
        while (true) {
            System.out.println("Student Management");
            System.out.println("------------------------------");
            System.out.println("1. Create new");
            System.out.println("2. Show list");
            System.out.println("3. Update student by roll number");
            System.out.println("4. Delete student by roll number");
            System.out.println("5. Find student by roll number");
            System.out.println("0. Exit");
            System.out.println("------------------------------");
            int choise = scanner.nextInt();
            scanner.nextLine();
            switch (choise) {
                case 1:
                    System.out.println("Create new student");
                    studentController.create();
                    break;
                case 2:
                    System.out.println("Show list student");
                    studentController.showList();
                    break;
                case 3:
                    System.out.println("Update student");
                    System.out.println("Please enter roll number of student: ");
                    String rollNumber2 = scanner.nextLine();
                    studentController.update(rollNumber2);
                    System.out.println("List of current student is: ");
                    studentController.showList();
                    break;
                case 4:
                    System.out.println("Delete student");
                    System.out.println("Please enter roll number of student: ");
                    String rollNumber1 = scanner.nextLine();
                    studentController.deleteStudent(rollNumber1);
                    System.out.println("List of current student is: ");
                    studentController.showList();
                    break;
                case 5:
                    System.out.println("Find Student by roll number");
                    System.out.println("Please enter roll number of student: ");
                    String rollNumber = scanner.nextLine();
                    studentController.findStudent(rollNumber);
                    break;
                default:
                    break;
            }
            if (choise == 0) {
                break;
            }
            scanner.nextLine();
        }

    }
}
