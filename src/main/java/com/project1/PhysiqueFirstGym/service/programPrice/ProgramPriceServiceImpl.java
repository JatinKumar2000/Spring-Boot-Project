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
        if(Objects.nonNull(programPrice.getBronzeMemship()) && !"".equals(programPrice.getBronzeMemship())){
            programPrice1.setBronzeMemship(programPrice.getBronzeMemship());
        }
        if(Objects.nonNull(programPrice.getSilverMemship()) && !"".equals(programPrice.getSilverMemship())){
            programPrice1.setSilverMemship(programPrice.getSilverMemship());
        }
        if(Objects.nonNull(programPrice.getPlatinumMemship()) && !"".equals(programPrice.getPlatinumMemship())){
            programPrice1.setPlatinumMemship(programPrice.getPlatinumMemship());
        }
        if(Objects.nonNull(programPrice.getGoldMemship()) && !"".equals(programPrice.getGoldMemship())) {
            programPrice1.setGoldMemship(programPrice.getGoldMemship());
        }

        if(Objects.nonNull(programPrice.getDiamondMemship()) && !"".equals(programPrice.getDiamondMemship())) {
            programPrice1.setDiamondMemship(programPrice.getDiamondMemship());
        }
        return programPriceRepository.save(programPrice1);


    }


}
