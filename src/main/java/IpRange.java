import java.util.Scanner;

public class IpRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("[\\s.;]+");;
        int sizeIn = 4;
        int sizeOut = 4;
        int array[] = new int[sizeIn];
        System.out.println("Введите начальный ip диапазона:");
            for (int i = 0; i < sizeIn; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Начальный ip диапазона:");
        for (int i = 0; i < sizeIn; i++) {
            System.out.print ("." + array[i]);
        }
        System.out.println();

        System.out.println("Введите конечный ip диапазона:");
        for (int i = 0; i < sizeOut; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Конечный ip диапазона:");
        for (int i = 0; i < sizeOut; i++) {
            System.out.print ("." + array[i]);
        }
        System.out.println();


        Scanner: input.close();

    }
}
