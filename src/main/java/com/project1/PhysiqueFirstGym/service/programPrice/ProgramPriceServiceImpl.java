package com.project1.PhysiqueFirstGym.service.programPrice;

import com.project1.PhysiqueFirstGym.entity.ProgramPrice;
import com.project1.PhysiqueFirstGym.repository.ProgramPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProgramPriceServiceImpl implements ProgramPriceService{

    @Autowired
    private ProgramPriceRepository programPriceRepository;


    @Override
    public List<ProgramPrice> getProgramPrice() {
        return programPriceRepository.findAll();
    }

    @Override
    public void saveProgramPrice(ProgramPrice programPrice) {
        programPriceRepository.save(programPrice);
    }

    @Override
    public ProgramPrice updateProgramPrice(Long ppid, ProgramPrice programPrice) {
        ProgramPrice programPrice1=programPriceRepository.findById(ppid).get();
        if(Objects.nonNull(programPrice.getMonthlyFees()) && !"".equals(programPrice.getMonthlyFees())){
            programPrice1.setMonthlyFees(programPrice.getMonthlyFees());
        }
        if(Objects.nonNull(programPrice.getQuaterlyFees()) && !"".equals(programPrice.getQuaterlyFees())){
            programPrice1.setQuaterlyFees(programPrice.getQuaterlyFees());
        }
        if(Objects.nonNull(programPrice.getYearlyFees()) && !"".equals(programPrice.getYearlyFees())){
            programPrice1.setYearlyFees(programPrice.getYearlyFees());
        }
        return programPriceRepository.save(programPrice1);


    }


}
