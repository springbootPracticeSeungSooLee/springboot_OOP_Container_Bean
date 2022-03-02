package com.spring.springoopcontainerbean.service;

import com.spring.springoopcontainerbean.domain.Member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
