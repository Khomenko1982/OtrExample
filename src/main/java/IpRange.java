import java.util.Scanner;
import java.util.Arrays;

public class IpRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("[\\s.;]+");;

        int sizeIn = 4;
        int sizeOut = 4;
        int array[] = new int[sizeIn];
        int array1[] = new int[sizeOut];
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
        for (int j = 0; j < sizeOut; j++) {
            array1[j] = input.nextInt();
        }
        System.out.print ("Конечный ip диапазона:");
        for (int j = 0; j < sizeOut; j++) {
            System.out.print ("." + array1[j]);

        }
        System.out.println();
        boolean result = Arrays.equals(array, array1);
        if (result == true){
        System.out.print ("IP одинаковы,диапазон пуст");
        System.exit(0);}
        else  {
        System.out.print ("IP разные,расчет диапазона между IP ");}
        System.out.print(Arrays.toString(array ).replace("[","").replace("]","").replace(",", ".")+ " и ");
        System.out.print(Arrays.toString(array1).replace("[","").replace("]","").replace(",", "."));
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

        Scanner: input.close();

    }
}
