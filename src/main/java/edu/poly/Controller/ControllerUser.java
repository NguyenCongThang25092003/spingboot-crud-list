package edu.poly.Controller;

import edu.poly.Dao.DAOMajor;
import edu.poly.Dao.DAOUser;
import edu.poly.Model.Major;
import edu.poly.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class ControllerUser {
    DAOMajor daoMajor = new DAOMajor();
    DAOUser dao = new DAOUser();

    @GetMapping("/")
    public String showForm(ModelMap model){
        User x = new User();
        model.addAttribute("USER",x);
        model.addAttribute("ACTION","/save");
        return "Register";
    }

    @RequestMapping("/save")
    public String save(ModelMap model, @ModelAttribute("USER") User x){
        Major major = daoMajor.findById(x.getMajor().getId());
        x.setMajor(major);
        dao.save(x);
//        System.out.println(x.toString());
        return "Register";
    }

//    @RequestMapping("/getlist")
//    public ResponseEntity<?> listUser(){
//        return ResponseEntity.ok(dao.getAllUser());
//    }
//
//    @RequestMapping("/{username}")
//    public ResponseEntity<?> getUserByUsername(@PathVariable(name="username") String username){
//        User x = dao.findByUsername(username);
//        return ResponseEntity.ok(x);
//    }
//
//    @RequestMapping("/getlistMajor")
//    public ResponseEntity<?> listMajor(){
//        return ResponseEntity.ok(daoMajor.getAllMajor());
//    }

    @RequestMapping("/listuser")
    public String list(ModelMap model){
        model.addAttribute("USERS",dao.getAllUser());
        return "Views";
    }

    @RequestMapping("/edit/{username}")
    public String edit(ModelMap model, @PathVariable(name="username") String username){
        User x = dao.findByUsername(username);
        model.addAttribute("USER",x);
        model.addAttribute("ACTION","/save");
        return "Register";
    }

    @RequestMapping("/delete/{username}")
    public String delete(ModelMap model, @PathVariable(name="username") String username){
        dao.delete(username);
        model.addAttribute("USERS",dao.getAllUser());
        return "Views";
    }

    @ModelAttribute("list_major")
    public ArrayList<Major> getMajor(){
        return daoMajor.getAllMajor();
    }
}
