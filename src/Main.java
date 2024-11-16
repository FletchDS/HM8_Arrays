public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] intArray = new int[]{1, 2, 3};
        double[] doubleArray = {1.57, 7.654, 9.986};
        byte[] byteArray = {11, 5, -7};

        //Задача 2
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("%d%s ", intArray[i], i == intArray.length - 1 ? "" : ",");
        }
        System.out.println();

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.printf("%.3f%s ", doubleArray[i], i == doubleArray.length - 1 ? "" : ",");
        }
        System.out.println();

        for (int i = 0; i < byteArray.length; i++) {
            System.out.printf("%d%s ", byteArray[i], i == byteArray.length - 1 ? "" : ",");
        }
        System.out.println("\n");

        //Задача 3
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.printf("%d%s ", intArray[i], i == 0 ? "" : ",");
        }
        System.out.println();

        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.printf("%.3f%s ", doubleArray[i], i == 0 ? "" : ",");
        }
        System.out.println();

        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.printf("%d%s ", byteArray[i], i == 0 ? "" : ",");
        }
        System.out.println("\n");

        //Задача 4
        for (int i = 0; i < intArray.length; i++) {
            if (Math.abs(intArray[i] % 2) == 1)
                intArray[i]++;
            System.out.printf("%d%s ", intArray[i], i == intArray.length - 1 ? "" : ",");
        }
    }
}