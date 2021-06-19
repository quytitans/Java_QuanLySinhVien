package assignment.t2012e.controller;

import assignment.t2012e.entity.Student;
import assignment.t2012e.model.StudentModel;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    Scanner scanner = new Scanner(System.in);
    StudentModel studentModel = new StudentModel();
    ArrayList<Student> list = studentModel.findAll();

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
        if (list == null) {
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
        if (list == null) {
            System.out.println("Data empty, enter student info fist");
        } else {
            Student st2 = studentModel.findById(rollNumber);
            if (st2 == null) {
                System.out.println("Cant find this student, please check again");
            } else {
                System.out.printf("|%10s%15s%10s|%10s%20s%10s|%10s%25s%10s|%10s%15s%10s|\n",
                        "", "Roll Number", "",
                        "", "Full Name", "",
                        "", "Email", "",
                        "", "Phone", "");
                System.out.println(st2.toString());
            }
        }
    }

    //ham xoa sinh vien theo rollnumber update
    public void deleteStudent(String rollNumber) {
        if (list == null) {
            System.out.println("Data empty, enter student info fist");
        } else {
            Student st2 = studentModel.findById(rollNumber);
            if (st2 == null) {
                System.out.println("Cant find this student, please check again");
            } else {
                System.out.println("we found infomation, do you want to delete this ? Y/N: ");
            }
            String choise = scanner.nextLine();
            if (choise.equalsIgnoreCase("Y")){
                studentModel.delete(rollNumber);
                System.out.println("delete complele !!!");
            }else {
                System.out.println("bye bye !!!");
            }
        }
    }

    //Ham update thong tin sinh vien
    public void update(String rollNumber) {
        if (list == null) {
            System.out.println("Data empty, enter student info fist");
        } else {
            Student st2 = studentModel.findById(rollNumber);
            if (st2 == null) {
                System.out.println("Cant find this student, please check again");
            } else {
                Student student = new Student();
                System.out.println("Enter fullname: ");
                student.setFullName(scanner.nextLine());
                System.out.println("Enter email: ");
                student.setEmail(scanner.nextLine());
                System.out.println("Enter phone number: ");
                student.setPhone(scanner.nextLine());
                studentModel.update(rollNumber, student);
                System.out.println("updated !!!");
            }
        }
    }
}
