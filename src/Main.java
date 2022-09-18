public class Main {
    public static void main(String[] args) {
//        task0();
        task1();
        task2();
        task3();
        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
    }

//    private static void task0() {
//        int[] weight = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
//        weight[0] = 90;
//        int januaryWeight = weight[0];
//        System.out.println(januaryWeight);
//        System.out.println(weight[0]);
//        System.out.println(weight[4]);
//        int january = 0;
//        System.out.println(weight[january]);
//        for (int i = 0; i < weight.length; i++) {
//            System.out.println(weight[i]);
//        }
//
//    }

    private static void task1() {
        System.out.println("Задание 1.1");
        int[] first = new int[]{1, 2, 3};
        System.out.println(first[0]);
        System.out.println(first[1]);
        System.out.println(first[2]);
        System.out.println("Задание 1.2");
        double[] second = {-1.57, 7.7654, 9.986};
        System.out.println(second[0]);
        System.out.println(second[1]);
        System.out.println(second[2]);
        System.out.println("Задание 1.3");
        long[] third = {1548464, 63134164, 65165165};
        System.out.println(third[0]);
        System.out.println(third[1]);
        System.out.println(third[2]);


    }

    private static void task2() {
        System.out.println("Задание 2");

        int[] first = new int[]{1, 2, 3};
        System.out.println(first[0] + ", " + first[1] + ", " + first[2] + " ");
        double[] second = {-1.57, 7.7654, 9.986};
        System.out.println(second[0] + ", " + second[1] + ", " + second[2] + " ");
        long[] third = {1548464, 63134164, 65165165};
        System.out.println(third[0] + ", " + third[1] + ", " + third[2] + " ");

    }

    private static void task3() {
        System.out.println("Задание 3");
        int[] first = new int[]{1, 2, 3};
        System.out.println(first[2] + ", " + first[1] + ", " + first[0] + " ");
        double[] second = {-1.57, 7.7654, 9.986};
        System.out.println(second[2] + ", " + second[1] + ", " + second[0] + " ");
        long[] third = {1548464, 63134164, 65165165};
        System.out.println(third[2] + ", " + third[1] + ", " + third[0] + " ");
    }

    private static void task4() {
        System.out.println("Задание 4");
        int[] first = new int[]{1, 2, 3};

        for (; first[0] % 2 != 0; first[0]++) {
        }
        for (; first[1] % 2 != 0; first[1]++) {
        }
        for (; first[2] % 2 != 0; first[2]++) {
        }
        System.out.println(first[0] + ", " + first[1] + ", " + first[2]);


    }

}
