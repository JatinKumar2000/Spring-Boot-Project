package com.project1.PhysiqueFirstGym.Controller;

import com.project1.PhysiqueFirstGym.entity.UserData;
import com.project1.PhysiqueFirstGym.service.user.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserDataController {

    @Autowired
    private UserDataService userService;

    @PostMapping("/saveUser")
    public String saveUserData(@Valid @RequestBody UserData uData){
        userService.saveUserData(uData);
        return "Saved User Data Successfully";
    }

    @GetMapping("/getUserData")
    public List<UserData> getUserData(){
        return userService.getUserData();
    }

    @GetMapping("/getUserData/id/{id}")
    public UserData getUserDataById(@PathVariable("id") Long userId){
        return userService.getUserDataById(userId);
    }

    @DeleteMapping("/deleteUserData/{id}")
    public String deleteUserDataById(@PathVariable("id") Long userId){
        userService.deleteUserDataById(userId);
        return "User Deleted Successfully";
    }

    @PutMapping("/updateUserData/{id}")
    public UserData updateUserDataById(@PathVariable("id") Long userId, @RequestBody UserData uData){
        return userService.updateUserDataById(userId,uData);
    }

    @GetMapping("getUserData/name/{name}")
    public UserData getUserDataByName(@PathVariable("name") String name){
        return userService.getUserDataByName(name);
    }
}
