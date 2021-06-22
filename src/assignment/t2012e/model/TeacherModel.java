package assignment.t2012e.model;


import assignment.t2012e.entity.Teacher;

import java.util.ArrayList;

public class TeacherModel {
    private ArrayList<Teacher> list = new ArrayList<>();
    {
        list = new ArrayList<>();
        list.add(new Teacher("T111", "Nguyen Hai", "qy@gmail.com","093349318"));
        list.add(new Teacher("T112", "Dang Kao", "xa@gmail.com","091149258"));
        list.add(new Teacher("T113", "Dang Minh", "t@gmail.com","091133158"));
        list.add(new Teacher("T114", "Bui Thi Kieu", "lnk@gmail.com","095493158"));
        list.add(new Teacher("T115", "Nguyen Quy", "bih@gmail.com","091663158"));
        list.add(new Teacher("T116", "Nguyen Phong", "kim@gmail.com","099993158"));
    }

    //add new data to list
    public boolean save(Teacher obj) {
        list.add(obj);
        return true;
    }

    //get all data list
    public ArrayList<Teacher> findAll() {
        return list;
    }

    //find data by id
    public Teacher findById(String id) {
        Teacher student = null;
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getRollNumber())) {
                student = list.get(i);
                break;
            }
        }
        return student;
    }

    //update data
    public boolean update(String id, Teacher updatedObj) {
        Teacher existing = findById(id);
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
        Teacher existing = findById(id);
        if (existing==null){
            return false;
        } else {
            list.remove(existing);
            return true;
        }
    }


}
