package loop;

public class while01 {
    public static void main(String[] args) {
        int y = 0;
        while (y <= 20) {
            if (y % 2 == 0) { // if( y % 2 == 1),if( y % 2 != 0 )
                System.out.print(y + ", "); // 실행
            }
            y++;
        }
        System.out.println();
        System.out.println("=======================");

        int i = 0;
        int sum = 0;
        while ( i <= 10 ) {
            sum += i ;
            i++;
        }
        System.out.println("0 ~10까지 합 :" + sum );
    }
}
