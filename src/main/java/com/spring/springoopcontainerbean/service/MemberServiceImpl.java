package com.spring.springoopcontainerbean.service;

import com.spring.springoopcontainerbean.domain.Member;
import com.spring.springoopcontainerbean.repository.MemberRepository;
import com.spring.springoopcontainerbean.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
