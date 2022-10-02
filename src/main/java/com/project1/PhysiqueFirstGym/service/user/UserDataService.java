package com.project1.PhysiqueFirstGym.service.user;

import com.project1.PhysiqueFirstGym.entity.UserData;

import java.util.List;

public interface UserDataService{


  public void saveUserData(UserData uData);

  public List<UserData> getUserData();

  public UserData getUserDataById(Long userId);

  public void deleteUserDataById(Long userId);

  public UserData updateUserDataById(Long userId, UserData uData);


  public UserData getUserDataByName(String name);


}
