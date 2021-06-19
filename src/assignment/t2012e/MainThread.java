package assignment.t2012e;

import assignment.t2012e.controller.StudentController;
import assignment.t2012e.view.StudentMenu;

public class MainThread {
    public static void main(String[] args) {
        StudentMenu studentMenu = new StudentMenu();
        studentMenu.generateStudentMenu();
    }
}