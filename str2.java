public class str2 {
    public static void main(String[] args) {

        //charAt() :  해당 인덱스의 값을 하나만 꺼내온다
        String str1 ="안녕하세요 홍기동입니다";
        // 0 1 2 3
        //index : 0부터
        char s1 = str1.charAt(0);
        System.out.println( s1 );

        s1 = str1.charAt(1);
        System.out.println( s1 );

        s1 = str1.charAt(3);
        System.out.println( s1 );

        String ssn = "24051141111111";
        // 조건 뒷자리 첫글자 1, 3 남자 , 2,4 여자 ,그외 형식잘못
        //switch  ~ case
        //String :"" , char ''
        char gender = ssn.charAt(6);
        switch (gender) {
            case '1':
            case '3':
                System.out.println("남자");
                break;
            case '2':
            case '4':
                System.out.println("여자");
                break;
            default:
                System.out.println("해당없음");
        }
    }
}
