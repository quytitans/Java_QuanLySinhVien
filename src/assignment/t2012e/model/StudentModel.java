package assignment.t2012e.model;

import assignment.t2012e.entity.Student;

import java.util.ArrayList;

public class StudentModel {
    private ArrayList<Student> list = new ArrayList<>();
    {
        list = new ArrayList<>();
        list.add(new Student("A111", "Nguyen Van Quy", "quy@gmail.com","0933493158"));
        list.add(new Student("A112", "Dang Thi Xoa", "xoa@gmail.com","0911492258"));
        list.add(new Student("A113", "Dang Minh Tu", "tu@gmail.com","0911333158"));
        list.add(new Student("A114", "Bui Thi Kieu Linh", "link@gmail.com","0955493158"));
        list.add(new Student("A115", "Nguyen Van Binh", "binh@gmail.com","0911663158"));
        list.add(new Student("A116", "Nguyen Xuan Kien", "kiem@gmail.com","0999493158"));
    }

    //add new data to list
    public boolean save(Student obj) {
        list.add(obj);
        return true;
    }

    //get all data list
    public ArrayList<Student> findAll() {
        return list;
    }

    //find data by id
    public Student findById(String id) {
        Student student = null;
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getRollNumber())) {
                student = list.get(i);
                break;
            }
        }
        return student;
    }

    //update data
    public boolean update(String id, Student updatedObj) {
        Student existing = findById(id);
        if (existing == null) {
            return false;
        } else {
            existing.setFullName(updatedObj.getFullName());
            existing.setPhone(updatedObj.getPhone());
            existing.setEmail(updatedObj.getEmail());
            return true;
        }
    }
    //delete data
    public  boolean  delete(String id){
        Student existing = findById(id);
        if (existing==null){
            return false;
        } else {
            list.remove(existing);
            return true;
        }
    }
}
