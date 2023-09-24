package hello.core;

import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository()); //멤버서비스 구현체인 객체가 생성, 생성자 주입
    }
    public OrderService orderService() {
        return new OrderServiceImpl( //사용하는 필드가 두개라
                new MemoryMemberRepository(),
                new FixDiscountPolicy());
    }

}
