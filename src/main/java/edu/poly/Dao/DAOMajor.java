package edu.poly.Dao;

import edu.poly.Model.Major;

import java.util.ArrayList;

public class DAOMajor {
    ArrayList<Major> listMajor = new ArrayList<>();

    public ArrayList<Major> getAllMajor(){
        listMajor.clear();
        listMajor.add(new Major(1,"Công nghệ thông tin"));
        listMajor.add(new Major(2,"Marketing"));
        listMajor.add(new Major(3,"Tự động hóa"));
        return listMajor;
    }

    public Major findById(int id){
        for (Major xx : listMajor){
            if(xx.getId() == id){
                return xx;
            }
        }
        return null;
    }
}
