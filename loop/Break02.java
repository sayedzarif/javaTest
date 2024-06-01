package loop;

public class Break02 {
    public static void main(String[] args) {
        for( int i = 0 ; i <= 5 ; i++ ) {
            System.out.println(i+"번:" + (int)(Math.random() *2 ));
        }
        System.out.println();
        for( int i = 0 ; i <= 10 ; i++ ) {
            System.out.println(i+"번:" + (int)(Math.random() *100 ));
        }

        //(int)(Math.random() * 범위) +  시작
        for( int i = 0 ; i <= 10 ; i++ ) {
            System.out.println(i + "번:" + (int) (Math.random() * 5) + 5);
        }

    }
}
