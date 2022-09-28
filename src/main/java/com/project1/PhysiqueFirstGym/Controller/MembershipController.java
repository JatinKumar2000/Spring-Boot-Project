package com.project1.PhysiqueFirstGym.Controller;

import com.project1.PhysiqueFirstGym.entity.Membership;
import com.project1.PhysiqueFirstGym.service.membership.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MembershipController {

    @Autowired
    private MembershipService membershipService;

    @GetMapping("/membership/get")
    public List<Membership> getMembership(){
        return membershipService.getMembership();
    }

    @PutMapping("/membership/update/{id}")
    public Membership updateMembership(@PathVariable("id") Long mid,@RequestBody Membership membership){
        return membershipService.updateMembership(mid,membership);
    }
}
