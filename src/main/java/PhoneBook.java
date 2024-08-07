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


import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("[\\s.;]+");


        Map<String, List<Long>> phoneAndName1 = new HashMap<String, List<Long>>();
        List<Long> values = new ArrayList<Long>();
        values.add(79246666666L);
        values.add(79249999999L);
        phoneAndName1.put("Петров П.П.", values);

        List<Long> values1 = new ArrayList<Long>();
        values1.add(7924000000L);
        values1.add(7924111111L);
        phoneAndName1.put("Сидоров С.С.", values1);

        List<Long> values2 = new ArrayList<Long>();
        values2.add(7924666666L);
        values2.add(7924777777L);
        phoneAndName1.put("Иванов И.И.", values2);

        System.out.println("Введите ФИО:");
        String keyName = input.nextLine();
        input.close();

        phoneAndName1.containsKey(keyName);
        if ( phoneAndName1.containsKey(keyName) ) {
            List<Long> l = phoneAndName1.get(keyName);
            System.out.print(" Тел: ");
            l.forEach( System.out::println);
        } else {
            System.out.println("Нет такого ФИО");
            System.exit(0);
        }
    }

}
