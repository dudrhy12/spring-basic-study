package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given 이런 것들이 주어졌을 때
        Member member = new Member(1L, "MemberA", Grade.VIP); //얘 가입시키자

        //when 이런 상황일 때
        memberService.join(member);
        Member findMember = memberService.findMember(1L); //얘를 찾자

        //then 이렇게 된다
        Assertions.assertThat(member).isEqualTo(findMember); //똑같냐
    }
}
