package com.project1.PhysiqueFirstGym.service.program;

import com.project1.PhysiqueFirstGym.entity.ProgramPrice;
import com.project1.PhysiqueFirstGym.entity.program;

import java.util.List;

public interface ProgramService {
    public List<program> getPrograms();

    public program saveProgram(program pdata);

    public void deleteProgram(Long pid);

}
