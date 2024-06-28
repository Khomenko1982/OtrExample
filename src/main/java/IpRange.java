import java.sql.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class IpRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("[\\s.;]+");
        ;

        int sizeIn = 4;
        int sizeOut = 4;
        int array[] = new int[sizeIn];
        int array1[] = new int[sizeOut];
        System.out.println("Введите начальный ip диапазона:");
        for (int i = 0; i < sizeIn; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Начальный ip диапазона:");
        for (int i = 0; i < sizeIn; i++) {
            System.out.print("." + array[i]);
        }
        System.out.println();

        System.out.println("Введите конечный ip диапазона:");
        for (int i = 0; i < sizeOut; i++) {
            array1[i] = input.nextInt();
        }
        System.out.print("Конечный ip диапазона:");
        for (int i = 0; i < sizeOut; i++) {
            System.out.print("." + array1[i]);

        }
        System.out.println();
        boolean result = Arrays.equals(array, array1);
//        System.out.println(array.getClass().getName());
//        System.out.println(array1.getClass().getName());
        if (result == true) {
            System.out.print("IP одинаковы,диапазон пуст");
            System.exit(0);
        }
        int firstD = array[sizeIn - 1];
        int lastD = array1[sizeOut - 1];
        int nonLastD = firstD + 1;
        System.out.println(firstD);
        System.out.println(lastD);
        for (int i = 0; i < lastD - 2; i++) {
            System.out.println(array[0] + "." + array[1] + "." + array[2] + "." + nonLastD++);

        }

//        int result1 = Arrays.mismatch(array, array1);
//        System.out.println(result1); // => 1
//        boolean result1 = true;
//        for (int i = 0; i < array1.length; i++) {
//               if (array[i] != array1[i]) {
//                result = false;
//                break;
//            }
//        }
//
//        System.out.println(result1); // => true
//        int result1 = Arrays.mismatch(array, array1);
//        System.out.println(result1); // => 1
//        int result1 = Arrays.compare(array, array1);
//        System.out.println(result1); // => -1

//        else  {
//        System.out.print ("IP разные,расчет диапазона между IP ");}
//        System.out.print(Arrays.toString(array ).replace("[","").replace("]","").replace(",", ".")+ " и ");
//        System.out.print(Arrays.toString(array1).replace("[","").replace("]","").replace(",", "."));


        //        Arrays.toString(array_name).replace("[",""").replace("]",""").replace(", "",""");
//                System.out.println(result); // => true
//        int Element = sizeIn[i];
//        int Element1 = sizeOut[j];

//        for (int i = 0; i < sizeIn; i++) {
////            int Element = sizeIn[i];
//            for (int j = 0; j < sizeOut; j++) {
////
//                if (array[i] == array1[j])
//               System.out.println (array[i]);
//                System.out.println (array1[j]);
////                   System.out.println("Элемент yначального ip " + i + " Совпадает с элементом конечного ip " + j );
////                i++;
////                j++;
//
//            }
//        }
//        if (sizeIn == sizeOut) System.out.println("Начальный и конечный ip совпадают, вывод диапазона невозможен");
//        int result = Arrays.mismatch(sizeIn, sizeOut);
//        System.out.println(result); // => 1

        Scanner:
        input.close();

    }
}
