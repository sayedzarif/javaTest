package loop;

public class for04 {
    public static void main(String[] args) {
        for( int i = 1, j = 5  ; i <= 4 ; i++ , j-- ) {// i : for {} 스코프
            System.out.println( i + " , " + j );
        }
        System.out.println();
        int x = 2; // main영역 스코프
        for( ; x < 10 ; x++ ) {
            System.out.print( x + ", ");
        }
        System.out.println();
        System.out.print("최종 : " + x );
    }// end main
}






