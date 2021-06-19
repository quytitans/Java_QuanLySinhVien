package assignment.t2012e.controller;

import assignment.t2012e.entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> list = new ArrayList<>();
    //ham tao moi sinh vien
    public Student create() {
        Student student = new Student();
        System.out.println("Please enter rollnumber:");
        String rollnumber = scanner.nextLine();
        student.setRollNumber(rollnumber);

        System.out.println("Please enter student fullname:");
        String studentFullname = scanner.nextLine();
        student.setFullName(studentFullname);

        System.out.println("Please enter student email:");
        String studentEmail = scanner.nextLine();
        student.setEmail(studentEmail);

        System.out.println("Please enter student phone:");
        String studentPhone = scanner.nextLine();
        student.setPhone(studentPhone);
        list.add(student);
        return student;
    }

    //ham show danh sach sinh vien
    public void showList() {
        if (list.size() == 0) {
            System.out.println("Data empty, enter student info fist");
        } else {
            System.out.printf("|%10s%15s%10s|%10s%20s%10s|%10s%25s%10s|%10s%15s%10s|\n",
                    "", "Roll Number", "",
                    "", "Full Name", "",
                    "", "Email", "",
                    "", "Phone", "");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    //ham tim kiem sinh vien
    public void findStudent(String rollNumber) {
        boolean flag = false;
        if (list.size() == 0) {
            System.out.println("Data empty, enter student info fist");
        } else {
            for (int i = 0; i < list.size(); i++) {
                Student st1 = list.get(i);
                if (st1.getRollNumber().equals(rollNumber)) {
                    System.out.println("Student infomation is: \n");
                    System.out.printf("|%10s%15s%10s|%10s%20s%10s|%10s%25s%10s|%10s%15s%10s|\n",
                            "", "Roll Number", "",
                            "", "Full Name", "",
                            "", "Email", "",
                            "", "Phone", "");
                    System.out.println(st1.toString());
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println("cant not find student info, please try again!!!");
            }
        }
    }

    //ham xoa sinh vien theo rollnumber
    public void deleteStudent(String rollNumber) {
        boolean flag = false;
        if (list.size() == 0) {
            System.out.println("Data empty, enter student info fist");
        } else {
            for (int i = 0; i < list.size(); i++) {
                Student st1 = list.get(i);
                if (st1.getRollNumber().equals(rollNumber)) {
                    list.remove(i);
                    System.out.println("Deleled student info.");
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println("cant not find student info, please try again!!!");
            }
        }

    }

    //Ham update thong tin sinh vien
    public void update(String rollNumber) {
        boolean flag = false;
        if (list.size() == 0) {
            System.out.println("Data empty, enter student info fist");
        } else {
            for (int i = 0; i < list.size(); i++) {
                Student st1 = list.get(i);
                if (st1.getRollNumber().equals(rollNumber)) {
                    while (true) {
                        System.out.println("What information do you want to edit?");
                        System.out.println("1. Student Name");
                        System.out.println("2. Student Email");
                        System.out.println("3. Student's Phone");
                        System.out.println("0. Exit - Back to main menu");
                        System.out.println("please enter your choice from 0 to 3 option: ");
                        int choice = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice) {
                            case 1:
                                System.out.println("Enter new name: ");
                                String studentName = scanner.nextLine();
                                st1.setFullName(studentName);
                                System.out.println("saved");
                                break;
                            case 2:
                                System.out.println("Enter new email: ");
                                String studentEmail = scanner.nextLine();
                                st1.setEmail(studentEmail);
                                System.out.println("saved");
                                break;
                            case 3:
                                System.out.println("Enter new phone number: ");
                                String studentPhone = scanner.nextLine();
                                st1.setPhone(studentPhone);
                                System.out.println("saved");
                                break;
                            default:
                                break;
                        }
                        if (choice == 0) {
                            break;
                        }
                        scanner.nextLine();
                    }
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println("cant not find student info, please try again!!!");
            }
        }

    }
}
