package day06.ex07;

public class MemberTest {
    public static void main(String[] args) {
        Member member1 = new Member("홍길동", 20, "010-0000-1111"); // 객체생성 - 메모리할당 - 생성자호출
        Member member2 = new Member("홍길동", 20, "010-0000-1111"); // 객체생성 - 메모리할당 - 생성자호출
        Member member3 = new Member("홍길동", 20, "010-0000-1111"); // 객체생성 - 메모리할당 - 생성자호출
        System.out.println("인스턴스(객체) 실행");
    }
}
