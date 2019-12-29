package array;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arr = new int[10];
        int total = 0;
        for(int i = 0, num = 1; i < arr.length; i++, num++) {
            arr[i] = num;
        }

        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println(total);


        double mtotal = 1;
        double[] dArr = new double[5];

        dArr[0] = 1.1;
        dArr[1] = 2.2;
        dArr[2] = 3.3;

        for(int i=0; i<dArr.length; i++) {
            mtotal *= dArr[i]; // 나머지는 0.0으로 채워진다
        }

        System.out.println(mtotal);

        for(int i=0; i<dArr.length; i++) {
            System.out.println(dArr[i]);
        }

    }

}
