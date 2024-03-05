public class NumberPyramids {
    public static void main(String[] args) {
        //pyramid1();
        //pyramid2();
        //pyramid3();
        //pyramid4();
        //pyramid5();
        pyramid6();
    }
    public static void pyramid1(){
        /*
            1
           2 2
          3 3 3
         4 4 4 4
        5 5 5 5 5
        */
        int noOfRows = 5;

        for (int i = 1; i <= noOfRows ; i++) {
            for (int j = i; j < noOfRows; j++) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void pyramid2(){
        /*
            1
           1 2
          1 2 3
         1 2 3 4
        1 2 3 4 5
        */
        int noOfRows = 5;

        for (int i = 1; i <= noOfRows ; i++) {
            for (int j = i; j < noOfRows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    public static void pyramid3(){
        /*
            *
           * *
          * * *
         * * * *
        * * * * *
        */
        int noOfRows = 5;

        for (int i = 1; i <= noOfRows ; i++) {
            for (int j = i; j < noOfRows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pyramid4(){
        /*
                1 -8 space
              1 2 1 -6 space
            1 2 3 2 1 -4 space
          1 2 3 4 3 2 1 -2 space
        1 2 3 4 5 4 3 2 1 -0 space
        */
        int noOfRows = 5;

        for (int i = 1; i <= noOfRows ; i++) {
            for (int j = (noOfRows-i)*2; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k+" ");
            }
            for (int l = i-1; l >0 ; l--) {
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
    public static void pyramid5(){
        /*
        1 2 3 4 5 4 3 2 1 -0 space
          1 2 3 4 3 2 1 -2 space
            1 2 3 2 1 -4 space
              1 2 1 -6 space
                1 -8 space
        */
        int noOfRows = 5;

        for (int i = 0; i < noOfRows; i++) {
            for (int j = i*2; j > 0; j--) {
                System.out.print(" ");
            }
            int j = 0;
            for (; j < (noOfRows-i); j++) {
                System.out.print((j+1)+" ");
            }
            for (int k = j-1; k > 0; k--) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    public static void pyramid6() {
        /*
                5 -8 space
              4 5 4 -6 space
            3 4 5 4 3 -4 space
          2 3 4 5 4 3 2 -2 space
        1 2 3 4 5 4 3 2 1 -0 space
        */
        int noOfRows = 5;

        for (int i = 0; i < noOfRows; i++) {
            for (int j = 1; j < (noOfRows-i); j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 0; k--) {
                System.out.print((noOfRows-k)+" ");
            }
            for (int l = (noOfRows-1),m=i; (l > 0 && m>0); l--, m--) {
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
