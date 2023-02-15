public class HomeworkLes1 {

    public static void main(String[] args) {
        // 200345 -> 10

        int a = 200345;
        System.out.println(a);

        System.out.println(1*200000 + 3*100 + 4*10 + 5*1);
        System.out.println(1*Math.pow(10,3) + 2*Math.pow(10,2) + 3*Math.pow(10,1)
                + 4*Math.pow(10,0));


        // 637 (10 -> 16),(16 -> 10)

        // 637 (10 -> 16) Result = 30e99

        System.out.println(637 / 16);     //39
        System.out.println(637 * 16);             //13
        System.out.println();

        System.out.println(39 / 16);      //2
        System.out.println(39 * 16);              //7
        System.out.println();

        System.out.println("Result (10 -> 16) by Java = " + Integer.toHexString(a));

        // 637 (16 -> 10)

        System.out.println("Result (16 -> 10) = " + (7*Math.pow(16,1)
                + 13*Math.pow(16,0)));

        // 637 (10 -> 2)

        System.out.println(637 / 2);   //318
        System.out.println(637 % 2);           //1
        System.out.println();

        System.out.println(318 / 2);     //159
        System.out.println(318 % 2);           //0
        System.out.println();

        System.out.println(159 / 2);     //79
        System.out.println(159 % 2);           //1
        System.out.println();

        System.out.println(79 / 2);     //39
        System.out.println(79 % 2);           //1
        System.out.println();

        System.out.println(39 / 2);     //19
        System.out.println(39 % 2);           //1
        System.out.println();

        System.out.println(19 / 2);     //9
        System.out.println(19 % 2);           //1
        System.out.println();

        System.out.println(9 / 2);     //4
        System.out.println(9 % 2);           //1
        System.out.println();

        System.out.println(4 / 2);     //2
        System.out.println(4 % 2);           //0
        System.out.println();

        System.out.println(2 / 2);     //1
        System.out.println(2 % 2);           //0
        System.out.println();

        int a2 = 001001111101;
        System.out.println("Result 637 (10 -> 2) = " + a2);   // 637 (10 -> 2) = 134517313

        // 11100111 ( -> 10) Result = 127

        System.out.println("Result 11100111 (2 -> 10) = " +
                (1*Math.pow(2, 6) + 1*Math.pow(2, 5) +
                        1*Math.pow(2, 4) + 1*Math.pow(2, 3) +
                        1*Math.pow(2, 2) + 1*Math.pow(2, 1) +
                        1*Math.pow(2, 0)));

        // 637 (10 -> 3) Result = 1175

        int a10 = 637;

        System.out.println(637 / 3);   //212
        System.out.println(637 % 3);           //1
        System.out.println();

        System.out.println(212 / 3);   //70
        System.out.println(212 % 3);           //2
        System.out.println();

        System.out.println(70 / 3);   //23
        System.out.println(70 % 3);           //1
        System.out.println();

        System.out.println(23 / 3);   //7
        System.out.println(23 % 3);           //2
        System.out.println();

        System.out.println(7 / 3);   //2
        System.out.println(7 % 3);           //1
        System.out.println();

        System.out.println(2 / 3);   //0
        System.out.println(2 % 3);           //2
        System.out.println();

        System.out.println("Result (10 -> 3) by Java = " +Integer.toOctalString(a10));












    }


    }
