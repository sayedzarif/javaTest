package condation;

public class If4 {
    public static void main(String[] args) {
        int score = 50;
        if (score >= 0 && score < 60) {
            System.out.println("재시험");
        }
        if (score >= 60 && score < 70) {
            System.out.println("경고");
        }
        if (score >= 70 && score < 80) {
            System.out.println("통과");
        }
        if (score >= 80 && score <= 100) {
            System.out.println("1학기프리패스");

        }
    }
}