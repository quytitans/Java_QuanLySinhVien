package assignment.t2012e.view;

import assignment.t2012e.controller.TeacherController;

import java.util.Scanner;

public class TeacherMenu {
    Scanner scanner = new Scanner(System.in);
    TeacherController teacherController = new TeacherController();

    public void generateStudentMenu() {
        while (true) {
            System.out.println("Teacher Management");
            System.out.println("------------------------------");
            System.out.println("1. Create new");
            System.out.println("2. Show list");
            System.out.println("3. Update teacher by roll number");
            System.out.println("4. Delete teacher by roll number");
            System.out.println("5. Find teacher by roll number");
            System.out.println("0. Exit");
            System.out.println("------------------------------");
            int choise = scanner.nextInt();
            scanner.nextLine();
            switch (choise) {
                case 1:
                    System.out.println("Create new teacher");
                    teacherController.create();
                    break;
                case 2:
                    System.out.println("Show list teacher");
                    teacherController.showList();
                    break;
                case 3:
                    System.out.println("Update student");
                    System.out.println("Please enter roll number of teacher: ");
                    String rollNumber2 = scanner.nextLine();
                    teacherController.update(rollNumber2);
                    System.out.println("List of current teacher is: ");
                    teacherController.showList();
                    break;
                case 4:
                    System.out.println("Delete teacher");
                    System.out.println("Please enter roll number of teacher: ");
                    String rollNumber1 = scanner.nextLine();
                    teacherController.deleteById(rollNumber1);
                    System.out.println("List of current teacher is: ");
                    teacherController.showList();
                    break;
                case 5:
                    System.out.println("Find teacher by roll number");
                    System.out.println("Please enter roll number of teacher: ");
                    String rollNumber = scanner.nextLine();
                    teacherController.findById(rollNumber);
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
