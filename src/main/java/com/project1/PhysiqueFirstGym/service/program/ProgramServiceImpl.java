package com.project1.PhysiqueFirstGym.service.program;

import com.project1.PhysiqueFirstGym.entity.program;
import com.project1.PhysiqueFirstGym.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProgramServiceImpl implements ProgramService{

    @Autowired
    private ProgramRepository programRepository;
    @Override
    public List<program> getPrograms() {
        return programRepository.findAll();
    }

    @Override
    public program saveProgram(program program) {
        return programRepository.save(program);
    }

    @Override
    public void deleteProgram(Long pid) {
        programRepository.deleteById(pid);
    }

    @Override
    public program updatePrograms(Long pid, program program) {
        program newProgram=programRepository.findById(pid).get();
        if(Objects.nonNull(program.getPname()) && !"".equalsIgnoreCase(program.getPname())){
            newProgram.setPname(program.getPname());
        }
        if(Objects.nonNull(program.getDescription()) && !"".equalsIgnoreCase((program.getDescription()))){
            newProgram.setDescription(program.getDescription());
        }
        return programRepository.save(newProgram);
    }
}
