package com.project1.PhysiqueFirstGym.repository;


import com.project1.PhysiqueFirstGym.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository<UserData,Long> {
}
