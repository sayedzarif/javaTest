public class Ex9 {

    public static int[] getNum(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int num:nums) {
            max = max > num ? max : num;
            min = min < num ? min : num ;
        }
        return new int[] { max, min};
    }

    public static void main(String[] args) {
        int[] numbers = {20,30,5,2,15,50};
        //최대값, 최소값
        int maxNum = getNum( numbers )[0];
        int minNum = getNum( numbers )[1];
        System.out.println("최대값 :" + maxNum );
        System.out.println("최소값 :" + minNum );
    }
}

    /*public static int getNum(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int num:nums) {
            max = max > num ? max : num;
            min = min < num ? min : num ;
        }
//      return new int[] { max, min};
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {20,30,5,2,15,50};
        //최대값, 최소값

        int maxNum = getNum( numbers );
        System.out.println( maxNum );
    }
}
*/