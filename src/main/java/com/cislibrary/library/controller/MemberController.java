package com.cislibrary.library.controller;

import com.cislibrary.library.model.Member;
import com.cislibrary.library.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping
    public ArrayList<Member> getMember(){
        return memberService.getMembers();
    }

    // create a member
    @PostMapping
    public Member createMember(@RequestBody  Member member){
        return memberService.createMember(member);
    }

    @PutMapping
    public Member updateMember(@RequestBody Member member){
        return memberService.updateMember(member);
    }

    @DeleteMapping
    public Member deleteMember(Long memberId){
        return memberService.deleteMember(memberId);
    }
}