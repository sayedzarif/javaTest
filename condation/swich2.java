package condation;

public class swich2 {
    public static void main(String[] args) {
        int coupon, grade = 3;
        switch (grade) {
            case 1:
                coupon = 3000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 1000;
                break;
            default:
                coupon = 500;
        }
        //if문
        if (grade >= 1 && grade <= 3) {
            System.out.println(grade + "등급 / 쿠폰발급" + coupon + "원");
        } else {
            System.out.println("해당 등급 쿠폰발급: " + coupon + "원");
        }
    }
}
