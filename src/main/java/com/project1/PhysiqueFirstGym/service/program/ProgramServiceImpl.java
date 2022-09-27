package com.project1.PhysiqueFirstGym.service.program;


import com.project1.PhysiqueFirstGym.entity.ProgramPrice;
import com.project1.PhysiqueFirstGym.entity.program;
import com.project1.PhysiqueFirstGym.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramServiceImpl implements ProgramService{

    @Autowired
    private ProgramRepository programRepo;
    @Override
    public List<program> getPrograms() {
        return programRepo.findAll();
    }

    @Override
    public void deleteProgram(Long pid) {
        programRepo.deleteById(pid);
    }



}
