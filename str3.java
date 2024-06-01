public class str3 {
    public static void main(String[] args) {
        // 중간값 꺼내올때
        //substring(시작위치 , 끝) => 끝 -1
        //substring(시작위치 ) => 시작위치부터 모두
        String str1 ="안녕하세요 홍기동입니다";
        String s1 = str1.substring(0, 2);
        System.out.println( s1 );

        s1  = str1.substring(1, 5);
        System.out.println( s1 );

        s1 = str1.substring(2);
        System.out.println( s1 );

        String ssn = "24051141111111";
        //012345
        // 년 y, 월 m, 일 d
        String y = ssn.substring(0,2);
        String m = ssn.substring(2,4);
        String d = ssn.substring(4,6);
        System.out.println( y +"년");
        System.out.println( m + "월");
        System.out.println( d + "일");
    }
}
