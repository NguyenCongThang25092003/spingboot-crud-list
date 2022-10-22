package edu.poly.Dao;

import edu.poly.Model.Major;
import edu.poly.Model.User;

import java.util.ArrayList;

public class DAOUser {
    public static ArrayList<User> listUser = new ArrayList<>();

    public User findByUsername(String username){
        for (User xx : listUser){
            if(username.equals(xx.getUsername())){
                return xx;
            }
        }
        return null;
    }

    public int update(User x){
        for (int i = 0; i < listUser.size(); i++) {
            if(listUser.get(i).getUsername().equals(x.getUsername())){
                listUser.set(i,x);
                return i;
            }
        }
        return -1;
    }

    public int save(User x){
        if(findByUsername(x.getUsername()) != null){
            update(x);
            return 1;
        }else{
            listUser.add(x);
            return -1;
        }
    }

    public int delete(String username){
        if(findByUsername(username) != null){
            listUser.remove(findByUsername(username));
            return 1;
        }else{
            return -1;
        }
    }

    public ArrayList<User> getAllUser(){
//        listUser.add(new User("thangnc","123456","Nguyễn Công Thắng",18,true,new Major(1,"Công nghệ thông tin")));
//        listUser.add(new User("huymd","123456","Mai Đình Huy",18,true,new Major(1,"Công nghệ thông tin")));
//        listUser.add(new User("trilq","123456","Lê Quang Trị",18,false,new Major(1,"Công nghệ thông tin")));
        return listUser;
    }
}
