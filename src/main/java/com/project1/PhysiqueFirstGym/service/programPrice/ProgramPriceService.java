package com.project1.PhysiqueFirstGym.service.programPrice;

import com.project1.PhysiqueFirstGym.entity.ProgramPrice;
import com.project1.PhysiqueFirstGym.entity.program;

import java.util.List;

public interface ProgramPriceService {

   public List<ProgramPrice> getProgramPrice();

   public ProgramPrice saveProgramPrice(ProgramPrice programPrice);

   public ProgramPrice updateProgramPrice(Long ppid, ProgramPrice programPrice);

   public void deleteProgramPrice(Long ppid);
}
