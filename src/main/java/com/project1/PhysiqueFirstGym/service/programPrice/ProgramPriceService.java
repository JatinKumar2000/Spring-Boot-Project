package com.project1.PhysiqueFirstGym.service.programPrice;

import com.project1.PhysiqueFirstGym.entity.ProgramPrice;

import java.util.List;

public interface ProgramPriceService {

   public List<ProgramPrice> getProgramPrice();

  public void saveProgramPrice(ProgramPrice programPrice);



   public ProgramPrice updateProgramPrice(Long ppid, ProgramPrice programPrice);
}
