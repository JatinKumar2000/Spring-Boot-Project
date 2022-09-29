package com.project1.PhysiqueFirstGym.Controller;

import com.project1.PhysiqueFirstGym.entity.program;
import com.project1.PhysiqueFirstGym.service.program.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProgramsController {

    @Autowired
    private ProgramService programService;

    @GetMapping("/programs/get")
    public List<program> getPrograms(){
        return programService.getPrograms();
    }

    @PostMapping("/programs/save")
    private program saveProgram(@RequestBody program Program){
        return programService.saveProgram(Program);
    }

    @DeleteMapping("/programs/delete/{pid}")
    private String deleteProgram(@PathVariable("pid") Long pid){
        programService.deleteProgram(pid);
        return "Program Deleted Successfully!!";
    }


    @PutMapping("/programs/update/{pid}")
    private program updatePrograms(@PathVariable("pid") Long pid,@RequestBody program Program){
        return programService.updatePrograms(pid,Program);
    }

}
