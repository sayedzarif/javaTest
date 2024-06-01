package function;

public class Ex10 {
    public static void main(String[] args) {
        int[] scores;
        scores =new int[]{85,90,100,70};
        int sum = 0;

        for(int i = 0 ; i < scores.length ; i++) {
            sum += scores[i];
        }

        System.out.println("총점 : " +  sum );

        //점수를 메서드 전달하고 메서드에서 점수 출력한다
        printItem(new int[]{85,90,100,70});

    } //end main

    // 점수 출력하는 기능의 메서드
    public static void printItem(int[] scores) {
        for( int i = 0; i < scores.length ; i++ ) {
            System.out.println("scores["+i+"] : "+ scores[i] );
        }
    } //end printItem
}