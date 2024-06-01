package string1;

public class str1 {
    public static void main(String[] args) {

        String ssn = "24051141111111";
// 클래스객체.메서드() : 내장메서드()
        int len = ssn.length();
        //13 : 정상 주민번호개수 맞음 , 주민번호개수 오류
        System.out.println( len );
        if( len == 13 ) {
            System.out.println("정상 주민번호개수 맞음");
        }else {
            System.out.println("주민번호개수 오류");
        }
    }
}
