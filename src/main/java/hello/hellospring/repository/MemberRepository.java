package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.Collection;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    Collection<Member> findAll();
}
