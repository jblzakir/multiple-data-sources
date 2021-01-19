package guru.springframework.multipledatasources.repository.member;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.multipledatasources.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
