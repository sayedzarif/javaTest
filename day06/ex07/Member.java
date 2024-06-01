package day06.ex07;

public class Member {
    //1. 필드명
    String name;
    int age;
    String tel;
    //생성자 - 기본생성자 Member() - 인스턴스 객체 선언
    // 가장먼저 실행되는 부분
    //2. 사용자 정의 생성자 - 클래스명과 동일
    Member( String name, int age, String tel){
        System.out.println("1. 생성자 호출");
        this.name = name;
        this.age = age;
        this.tel = tel;
    }
    //3. 메소드
}
