package com.instance.controller;

import com.instance.entity.Grade;
import com.instance.entity.JsonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.instance.entity.User;
import com.instance.service.UserService;
import org.springframework.web.servlet.ModelAndView;



import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


//    @RequestMapping(value = {"/showUser"},method = RequestMethod.GET)
//
//    public User findByID(@RequestParam(value = "id") int userId){
//        return  userService.getUserById(userId);
//    }
//    public ResponseEntity<JsonResult> toIndex(HttpServletRequest request, Model model){
//        JsonResult r = new JsonResult();
//        int userId = Integer.parseInt(request.getParameter("id"));
//        User user = this.userService.getUserById(userId);
//        r.setResult(user);
//        return ResponseEntity.ok(r);
//    }
    @RequestMapping(value = {"/addUser"},method = RequestMethod.PUT)
    @ResponseBody
    public String addUser(@RequestBody User record){
        int row = userService.addUser(record);
        if (row>0){
            return "success";
        }
        else
            return "fail";
    }
    @RequestMapping(value = {"/updateGrade"},method = RequestMethod.POST)
    @ResponseBody
    public String updateGrade(@RequestBody Grade grade) {
        int g= userService.updateGradeById(grade);
        if(g>0) {
            return "success";
        }
        else
            return "fail";
    }
//    ResponseEntity<JsonResult> addUser(@RequestBody User record){
//        JsonResult r = new JsonResult();
//        int orderId = userService.addUser(record);
//        if(orderId>0){
//            r.setResult("success");
//        }
//        return ResponseEntity.ok(r);
//    }
    @RequestMapping(value = {"/users"},method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllGrades(){
        List<User> users = userService.getUserList();
      return users;

    }
    @RequestMapping(value = {"/insertGrade"},method = RequestMethod.POST)
    @ResponseBody
    public String insert (@RequestBody  Grade record){
        int row = userService.insert(record);
        if(row>0){
            return "Success";
        }
        else {
            return "Fail";
        }
    }

//
//    }
    @RequestMapping(value = {"/deleteUser"},method = RequestMethod.DELETE)

    public ResponseEntity<JsonResult> deleteUser(@RequestParam(value = "id") int id){
        JsonResult r = new JsonResult();
        int userId = userService.deleteUser(id);
        r.setResult("success");
        return ResponseEntity.ok(r);
    }
    @RequestMapping(value = {"/grade"},method = RequestMethod.GET)
    public Grade getGrade(@RequestParam(value = "id") int id){
        return userService.getGradeById(id);

    }
//    @RequestMapping("/")
//    @ResponseBody
//    public ModelAndView getIndex(){
//        ModelAndView mav = new ModelAndView("index");
//        User user = userService.getUserById(1);
//        mav.addObject("user", user);
//        return mav;
//    }

}
