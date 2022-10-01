package com.project1.PhysiqueFirstGym.service.user;

import com.project1.PhysiqueFirstGym.entity.UserData;
import com.project1.PhysiqueFirstGym.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserDataServiceImpl implements UserDataService {

    @Autowired
    private UserDataRepository userDataRepository;

    @Override
    public void saveUserData(UserData uData) {
        userDataRepository.save(uData);
    }

    @Override
    public List<UserData> getUserData() {
        return userDataRepository.findAll();
    }

    @Override
    public UserData getUserDataById(Long userId) {
        return userDataRepository.findById(userId).get();
    }

    @Override
    public void deleteUserDataById(Long userId) {
        userDataRepository.deleteById(userId);
    }

    @Override
    public UserData updateUserDataById(Long userId, UserData uData) {

        UserData Udata=userDataRepository.findById(userId).get();
        if(Objects.nonNull(uData.getName()) && !"".equalsIgnoreCase(uData.getName())){
            Udata.setName(uData.getName());
        }
        if(Objects.nonNull(uData.getAge()) && !"".equals(uData.getAge())){
            Udata.setAge(uData.getAge());
        }
        if(Objects.nonNull(uData.getGender()) && !"".equalsIgnoreCase(uData.getGender())){
            Udata.setGender(uData.getGender());
        }

        if(Objects.nonNull(uData.getContact()) && !"".equals(uData.getContact())){
            Udata.setContact(uData.getContact());
        }

        return userDataRepository.save(Udata);
    }

    @Override
    public UserData getUserDataByName(String name) {
        return userDataRepository.findByNameIgnoreCase(name);
    }

    @Override
    public UserData example() {
        return  userDataRepository.gymExample();
    }
}
