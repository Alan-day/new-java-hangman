public class test {


    //    public static int takeSum(int x, int y, int z) {
//
//        if (x != y && z != y && z != x) {
//            return x + y + z;
//        } else if (x != y && z != y && z == x) {
//            return y;
//        } else if (x == y && z != x && z != y) {
//            return z;
//
//        } else if (x != z && x != y && y == z) {
//            return x;
//
//        } else if (x == z && z == y && y == x) {
//            return 0;
//        } else {
//            return(0);
//        }
//
//    }
    public static void main(String[] args) {


//        Create a method that takes 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
//
//        loneSum(1, 2, 3) → 6
//        loneSum(3, 2, 3) → 2
//        loneSum(3, 3, 3) → 0

//        System.out.println(   takeSum(1,2,2));
//        System.out.println( takeSum(2,2,3));
//        System.out.println( takeSum(1,2,1));
//        System.out.println(takeSum(3,2,1));
//


        int[] numbers = {1, 2, 3, 4, 5};
        int firstNumber = numbers[0];
        System.out.println(firstNumber);

        //modyfiing arrays
        numbers[2] = 6;
        System.out.println(numbers[2]);

        int length = numbers.length;
        System.out.println(length);


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] emptyNumbers = new int[3];
        emptyNumbers[0] = 1;
        emptyNumbers[1] = 10;
        emptyNumbers[2] = 100;




    }
}
