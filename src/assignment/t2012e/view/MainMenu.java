package assignment.t2012e.view;

import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);

    public void generateMainMenu() {
        while (true) {
            System.out.println("HR MANAGERMENT");
            System.out.println("------------------------------");
            System.out.println("1. work with STUDENT data");
            System.out.println("2. work with TEACHER data");
            System.out.println("0. Exit");
            System.out.println("------------------------------");
            System.out.println("Please select your choose, from 1 to 2 as above: ");
            int choise = scanner.nextInt();
            scanner.nextLine();
            switch (choise) {
                case 1:
                    StudentMenu studentMenu = new StudentMenu();
                    studentMenu.generateStudentMenu();
                    break;
                case 2:
                    TeacherMenu teacherMenu = new TeacherMenu();
                    teacherMenu.generateStudentMenu();
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
