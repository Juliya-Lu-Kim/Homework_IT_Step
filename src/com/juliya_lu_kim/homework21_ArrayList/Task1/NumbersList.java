package com.juliya_lu_kim.homework21_ArrayList.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersList<S> {
    // Объявление статических переменных и методов для класса

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Integer> list = new ArrayList<Integer>();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static int index;
    static String element;

    // метод, заполняющий список значениями с клавиатуры
    public void fillArrayList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Заполните список числовыми значениями:");
        System.out.println("По завершении заполнения нажмите Enter");

        //заполнение списка значениями
        while (true) {
            element = reader.readLine();
            if (element.isEmpty()) break;  // при вводе пустой строки заполнение списка прерывается
            checkInputNum(); // метод, определяющий правилность ввода
        }
        // вывод списка на экран
        System.out.println("Ваш список: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
    }
// метод, выводящий меню на консоль и позволяющий
// работать с методами обработки списка

    public void menu() {

        boolean t = true;
// цикл, позволяющий перезапускать меню до тех пор, пока
// пользователь работает со списком
        while (t) {
            System.out.println("\n");
            System.out.println("Меню для работы со списком значений:");
            System.out.println("1. Добавить элемент в список.");
            System.out.println("2. Удалить элемент из списка.");
            System.out.println("3. Показать содержимое списка.");
            System.out.println("4. Проверить есть ли значение в списке.");
            System.out.println("5. Заменить значение в списке.");
            System.out.println("0. Завершить работу программы.");

            int input = scanner.nextInt();
            int index;

            switch (input) {
                case 1:
                    this.arrayListAdd();           // определение метода для добавления элемента в список
                    break;
                case 2:
                    this.deleteElement();        // определение метода для удаления элемента из список
                    break;
                case 3:
                    this.showList();           // определение метода показывающего весь список значений
                    break;
                case 4:
                    this.searchElement();    // определение метода для поиска элемента в списоке
                    break;
                case 5:
                    this.changeElement();  // определение метода для изменения элемента в списоке
                    break;
                // выход из меню и программы
                case 0:
                    System.out.println("Вы завершили работу со списком");
                    t = false; // значение, указывающее на прерывание цикла while()
                    break;
            }
        }    // окончание цикла while()
    }

    // метод для добавления элемента в список
    public static void arrayListAdd() {
        System.out.println("Введите, пожалуйста, элемент, который необходимо добавить в список:");
        list.add(scanner.nextInt());
        System.out.println("Значение успешно добавлено!");
        System.out.println("Ваш список: ");
        // цикл для вывода списка на консоль
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
    }

    // метод для удаления элемента в списка
    public static void deleteElement() {
        System.out.println("Введите, пожалуйста, индекс элемента, который необходимо удалить:");
        index = scanner.nextInt();
        // цикл, проверяющий ввод - индекс должен входить в диапазон индексов списка
        if (index > list.size()) {
            // цикл, перезапускающий ввод значения, до получения значения в заданном диапазоне
            while (true) {
                if (index > list.size()) {
                    System.err.println("ВНИМАНИЕ! Вы вышли за пределы списка!");
                    System.out.println("Пожалуйста, повторите ввод");
                    index = scanner.nextInt();
                } else {
                    list.remove(index); // метод, удаляющий элемент из списка
                    break;
                }
            }
        } else {
            list.remove(index);
        }
        System.out.println("Элемент успешно удален!");
        System.out.println("Ваш список:");
        // цикл для вывода списка на консоль
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
    }

    // метод для вывода списка в консоль
    public static void showList() {
        System.out.println("Ваш список содержит следующие элементы: ");
        // цикл, выводящий список элементов в консоль
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
    }

    // метод для поиска элемента в списке
    public static void searchElement() {
        System.out.println("Введите значение для определения нахождения его в списке");
        // цикл, ищущий элемент в списке
        if (list.contains(scanner.nextInt()) == false) {   // метод list.contains - метод ArrayList для поиска элемента
            System.out.println("В списке нет этого значения");
        } else {
            System.out.println("Данное значение есть в списке");
        }
    }

    // метод для изменения элемента в списке
    public static void changeElement() {
        // цикл, выводящий список до изменений
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println("\n");
        System.out.println("Введите индекс элемента списка, который необходимо заменить: ");
        index = scanner.nextInt();
        // условный оператор, определяющий вхождение введенного значения в диапазон значений списка
        if (index > list.size()) {
            //цикл, перезапускающий ввод значения
            while (true) {
                if (index > list.size()) {
                    System.err.println("ВНИМАНИЕ! Вы вышли за пределы списка!");
                    System.out.println("Пожалуйста, повторите ввод");
                    index = scanner.nextInt();
                } else {
                    System.out.println("Заменяется элемент списка с индексом " + index);
                    break;
                }
            }
        } else {
            System.out.println("Заменяется элемент списка с индексом " + index);
        }
        System.out.println("Введите новое значение элемента: ");
        Integer value = (Integer) scanner.nextInt();
        list.set(index, value); // метод, изменяющий предыдущие параметры на новые заданные значения в списке
        System.out.println("Ваш измененный список");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
        }
    }

    //метод для проверки ввода
    public void checkInputNum() throws IOException {

        if (element.matches("[0-9]+")) { // условие проверяет введены ли в строку только цифры

            //=========================================================================
            if (element.length() > 10) { // условие проверяет не превышает ли ввод 10 цифр
                // цикл, позволяющий повторно проверять условие при вводе неправильного значения
                while (true) {
                    if (element.length() > 10) {
                        System.out.println("TOO MUCH");
                        System.err.println("ВНИМАНИЕ! Слишком длинное число");
                        System.out.println("Повторите, пожалуйста, ввод");
                        element = reader.readLine();
                    } else {
                        list.add(Integer.parseInt(element)); // добавление элемента в список
                        break;
                    }
                }

            } else {
            }

            list.add(Integer.parseInt(element)); // добавление элемента в список

        } else if (element.matches("[0-9]+") == false) {
            // цикл, позволяющий повторно проверять условие при вводе неправильного значения
            while (true) {
                if (element.matches("[0-9]+") == false) {
                    System.out.println("CHARS");
                    System.err.println("ВНИМАНИЕ! Вы ввели не число!");
                    System.out.println("Введите, пожалуйста, число, содержащее не более 10 символов");
                    element = reader.readLine();
                } else {
                    list.add(Integer.parseInt(element)); // добавление элемента в список
                    break;
                }
            }

        } else {
            System.err.println("ВНИМАНИЕ! Вы ввели не число!");
            System.out.println("Введите, пожалуйста, число, содержащее не более 10 символов");
            element = reader.readLine();
        }
    }
}





