import java.util.Scanner;

public class IpRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 4;
        int array[] = new int[size];
        System.out.println("Введите начальный ip:");
            for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Начальный ip:");
        for (int i = 0; i < size; i++) {
            System.out.print ("." + array[i]);
        }
        System.out.println();
//        int[] ip1 = {192, 168, 0, 1};
//        int[] ip2 = {192, 168, 0, 10};
    }
}
