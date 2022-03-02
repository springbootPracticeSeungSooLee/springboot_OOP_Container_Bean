package com.spring.springoopcontainerbean.repository;

import com.spring.springoopcontainerbean.domain.Member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
