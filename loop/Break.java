package loop;

public class Break {
    public static void main(String[] args) {
        for( int i = 0 ; i <= 20 ; i++ ) {
            System.out.print(i + ", ");
            if (i == 10) {
                break;
            }
        }

        }
}


