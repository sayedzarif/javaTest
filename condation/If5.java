package condation;

public class If5 {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        if (a > b) {
            System.out.println("최대값:" + a);
        } else {
            System.out.println("최대값:" + b);

        }
        int score = 85;
        if (score >= 80) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");

        }
    }
}