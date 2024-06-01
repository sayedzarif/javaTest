package array;

public class Ex5 {
    public static void main(String[] args) {

        String[][] arr  = new String[][] {
                {"A1","A2","A3","A4"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4"}
        };

        //접근 : arr[행][열] 순서 인덱스 0부터
        System.out.println( arr[0][0]);
        System.out.println( arr[0][1]);
        System.out.println( arr[2][2]);

        System.out.println();

        for (int i = 0; i < 3 ; i++) {
            //행
            for (int j = 0; j < 4; j++) {
                //열
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        
    
    }
    
}

