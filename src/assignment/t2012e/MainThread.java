package assignment.t2012e;

import assignment.t2012e.controller.StudentController;
import assignment.t2012e.entity.Student;
import assignment.t2012e.view.StudentMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        StudentMenu studentMenu = new StudentMenu();
        studentMenu.generateStudentMenu();
        StudentController studentController = new StudentController();

    }
}