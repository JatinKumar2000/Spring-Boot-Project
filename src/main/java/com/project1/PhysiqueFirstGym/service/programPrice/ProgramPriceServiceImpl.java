package com.project1.PhysiqueFirstGym.service.programPrice;

import com.project1.PhysiqueFirstGym.entity.ProgramPrice;
import com.project1.PhysiqueFirstGym.repository.ProgramPriceRepository;
import org.springframework.stereotype.Service;

@Service
public class ProgramPriceServiceImpl implements ProgramPriceService{

    private ProgramPriceRepository programPriceRepository;
    @Override
    public ProgramPrice saveProgramPrice(ProgramPrice programPrice) {
        return programPriceRepository.save(programPrice);
    }
}
