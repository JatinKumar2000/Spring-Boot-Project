package com.project1.PhysiqueFirstGym.Controller;

import com.project1.PhysiqueFirstGym.entity.ProgramPrice;
import com.project1.PhysiqueFirstGym.service.programPrice.ProgramPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProgramPriceController {

    @Autowired
    private ProgramPriceService programPriceService;

    @GetMapping("/programs/price/get")
    public List<ProgramPrice> getProgramPrice(){
        return programPriceService.getProgramPrice();
    }

    @PutMapping("/programs/price/update/{ppid}")
    public ProgramPrice updateProgramPrice(@PathVariable("ppid") Long ppid,@RequestBody ProgramPrice programPrice){
        return programPriceService.updateProgramPrice(ppid,programPrice);
    }



}
