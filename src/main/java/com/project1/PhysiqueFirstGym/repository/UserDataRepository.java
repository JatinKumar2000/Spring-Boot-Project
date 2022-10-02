package com.project1.PhysiqueFirstGym.repository;


import com.project1.PhysiqueFirstGym.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDataRepository extends JpaRepository<UserData,Long> {
    public UserData findByNameIgnoreCase(String name);


}
