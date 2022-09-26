package com.project1.PhysiqueFirstGym.Controller;

import com.project1.PhysiqueFirstGym.entity.ProgramPrice;
import com.project1.PhysiqueFirstGym.entity.program;
import com.project1.PhysiqueFirstGym.repository.ProgramRepository;
import com.project1.PhysiqueFirstGym.service.program.ProgramService;
import com.project1.PhysiqueFirstGym.service.programPrice.ProgramPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProgramsController {

    @Autowired
    private ProgramService programService;

    @Autowired
    private ProgramPriceService programPriceService;
    @GetMapping("/programs/get")
    public List<program> getPrograms(){
        return programService.getPrograms();
    }

    @PostMapping("programs/save")
    public program saveProgram(@RequestBody program pdata){
        return programService.saveProgram(pdata);
    }

    @DeleteMapping("programs/delete/{id}")
    public String deleteProgram(@PathVariable("id") Long pid){
        programService.deleteProgram(pid);
        return "Delete Program Successfully";
    }

    @PostMapping("/programs/price/save")
    public ProgramPrice saveProgramPrice(@RequestBody ProgramPrice programPrice){
        return programPriceService.saveProgramPrice(programPrice);
    }
}
