package com.project1.PhysiqueFirstGym.Controller;

import com.project1.PhysiqueFirstGym.entity.UserData;
import com.project1.PhysiqueFirstGym.service.user.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserDataController {

    @Autowired
    private UserDataService userService;
    @PostMapping("/client/save")
    public String saveUserData(@RequestBody UserData uData){
        userService.saveUserData(uData);
        return "User Data Saved Successfully";
    }

    @GetMapping("/client/get")
    public List<UserData> getUserData(){
        return userService.getUserData();
    }

    @GetMapping("/client/get/id/{id}")
    public UserData getUserDataById(@PathVariable("id") Long userId){
        return userService.getUserDataById(userId);
    }

    @DeleteMapping("/client/delete/{id}")
    public String deleteUserDataById(@PathVariable("id") Long userId){
        userService.deleteUserDataById(userId);
        return "User Deleted Successfully";
    }

    @PutMapping("/client/update/{id}")
    public UserData updateUserDataById(@PathVariable("id") Long userId, @RequestBody UserData uData){
        return userService.updateUserDataById(userId,uData);
    }

    @GetMapping("user/get/name/{name}")
    public UserData getUserDataByName(@PathVariable("name") String name){
        return userService.getUserDataByName(name);
    }


    @GetMapping("/example")
    public UserData example(){
        return userService.example();
    }
}
