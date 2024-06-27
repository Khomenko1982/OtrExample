//2. Есть программа, хранящая в памяти телефонную книгу (забита в коде программы).
//Телефонная книга для каждого ФИО хранит список номеров.
//Входные данные
//Иванов И.И. +8 800 2000 500 +8 800 200 600
//Петров П.П. +8 800 2000 700
//Сидоров С.С. +8 800 2000 800 +8 800 2000 900 +8 800 2000 000
//
//На вход программе подается ФИО, программа печатает телефоны, привязанные к этому ФИО.
//Если телефона нет, программа должна выдать сообщение о том, что такого ФИО в БД нет.
//
//        Пример:
//Пользователь вводит
//Иванов И.И.
//        Программа выдает
//1. +8 800 2000 500
//        2. +8 800 200 600
//
//Обязательно. Использовать для реализации HashMap (для хранения сопоставления ФИО -> телефоны),
// ArrayList для хранения списка телефонов
//
//Желательно (опционально):
//        - использовать для сборки maven3 https://maven.apache.org/
//        - написать тесты для кода, используя JUnit http://junit.org/junit4/
//По двум задачам желательно:
//а. заливать данные в github (проверим работу с гит)
//б. заливать промежуточные результаты, чтобы мы оценили прогресс задачи.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class PhoneBook
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("[\\s.;]+");
        HashMap<String, Long> phoneAndName = new HashMap<>();
//         String keyName;
//        HashMap<Integer, String> phoneAndName1 = new HashMap<>();

        phoneAndName.put("Хоменко А.С.", 79246666666L);
        phoneAndName.put("Иванов И.И.", 79245555555L);
        phoneAndName.put("Сидоров П.В.", 79247777777L);

        System.out.println("Введите ФИО:");
        String keyName = input.nextLine();
//        System.out.print (keyName);
        input.close();
//        phoneAndName1.put(1, "79246666666");
//        phoneAndName1.put(2, "79245555555");
//        phoneAndName1.put(3, "79247777777");
//        System.out.println(phoneAndName);

//        Set<String> keys = phoneAndName.keySet();
        phoneAndName.containsKey(keyName);
        if (phoneAndName.containsKey(keyName) ==false) {
            System.out.println("Нет такого ФИО");
            System.exit(0);
        }
//        for (phoneAndName.Entry<String, Long> entry : phoneAndName.entrySet()) {
//            if (entry.getKey().equals(keyName)) {
//                keyName = entry.getKey();
//                break;
//            }
//        }
        ArrayList<String> keys = new ArrayList<>(phoneAndName.keySet());
//        System.out.println("ФИО: " + keyName);
        System.out.println("ФИО: " + keys);
        ArrayList<Long> values = new ArrayList<>(phoneAndName.values());
//            for(Long s : values) {
//                if (phoneAndName.keySet() == keyName) {
//                System.out.println(s);
//                    System.exit(0);
//            }
        System.out.println("Тел: " + values);




    }
}
