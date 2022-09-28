package com.project1.PhysiqueFirstGym.service.membership;

import com.project1.PhysiqueFirstGym.entity.Membership;
import com.project1.PhysiqueFirstGym.repository.MembershipRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MembershipServiceImpl implements MembershipService{


    private MembershipRepository membershipRepo;
    @Override
    public List<Membership> getMembership() {
        return membershipRepo.findAll();
    }

    @Override
    public Membership updateMembership(Long mid, Membership membership) {
        Membership newMembership=membershipRepo.findById(mid).get();
        if(Objects.nonNull(membership.getMtype()) && !"".equalsIgnoreCase(membership.getMtype())){
            newMembership.setMtype(membership.getMtype());
        }
        if(Objects.nonNull(membership.getDiscount()) && !"".equalsIgnoreCase(membership.getDiscount())){
            newMembership.setDiscount(membership.getDiscount());
        }
        if(Objects.nonNull(membership.getValidity()) && !"".equalsIgnoreCase(membership.getValidity())){
            newMembership.setValidity(membership.getValidity());
        }

        return membershipRepo.save(newMembership);
    }
}
