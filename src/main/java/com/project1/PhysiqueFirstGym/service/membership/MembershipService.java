package com.project1.PhysiqueFirstGym.service.membership;

import com.project1.PhysiqueFirstGym.entity.Membership;

import java.util.List;

public interface MembershipService {
    public List<Membership> getMembership();

    public Membership updateMembership(Long mid, Membership membership);

    public void deleteMembership(Long id);

    public Membership saveMembership(Membership membership);
}
