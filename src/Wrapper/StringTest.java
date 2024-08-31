package Wrapper;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        // 1) Литерал
        String literalString = "Пример строки";

        // 2) new
        String newStr = new String("Пример строки");

        // 3) Массив символов
        char[] charArray = {'П', 'р', 'и', 'м', 'е', 'р', ' ', 'с', 'т', 'р', 'о', 'к', 'и'};
        String charArrayString = new String(charArray);

        // 4) Из байтов
        byte[] byteArray = {80, 114, 105, 109, 101, 114, 32, 115, 116, 114, 111, 107, 105};
        String byteArrayString = new String(byteArray);

        // 5) С помощью StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Пример строки");
        String stringBuilderString = stringBuilder.toString();

        // Вывод всех строк
        System.out.println("Литерал: " + literalString);
        String newString = null;
        System.out.println("new: " + newString);
        System.out.println("Массив символов: " + charArrayString);
        System.out.println("Из байтов: " + byteArrayString);
        System.out.println("StringBuilder: " + stringBuilderString);

        String fruits = "Апельсин,Яблоко,Гранат,Груша";

        String[] fruitArray = fruits.split(",");

        String longestFruit = "";
        for (String fruit : fruitArray) {
            if (fruit.length() > longestFruit.length()) {
                longestFruit = fruit;
            }
        }
        System.out.println("Самое длинное название фрукта: " + longestFruit.toLowerCase());

        for (String fruit : fruitArray) {
            String shortName = fruit.substring(0, 3);
            System.out.println("Сокращенное название: " + shortName);
        }

        newString = "   Я_новая_строка      ";

        newString = newString.trim();

        newString = newString.replace('_', ' ');

        System.out.println("Окончательный вариант строки: " + newString);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String inputText = scanner.nextLine();
        System.out.println("Вы ввели: " + inputText);

        if (inputText.startsWith("Запуск")) {
            System.out.println("Запускаем процесс");
        }

        if (inputText.endsWith("завершен")) {
            System.out.println("Процесс завершен");
        }

        if (inputText.toLowerCase().contains("ошибка")) {
            System.out.println("Произошла ошибка");
        }

        // Создаем строки
        String str1 = "Первая строка";
        String str2 = "Вторая строка";
        String str3 = "Третья строка";
        String str4 = "Четвертая строка";
        String str5 = "Пятая строка";
        String str6 = "Шестая строка";

        // Создаем StringBuilder
        StringBuilder sb = new StringBuilder();

        // Добавляем строки в StringBuilder
        sb.append(str1).append("\n");
        sb.append(str2).append("\n");
        sb.append(str3).append("\n");
        sb.append(str4).append("\n");
        sb.append(str5).append("\n");
        sb.append(str6).append("\n");

        // Разбиваем строки на массив
        String[] lines = sb.toString().split("\n");

        // Создаем новый StringBuilder для результата
        StringBuilder result = new StringBuilder();

        // Добавляем строки с переносом после каждой третьей строки
        for (int i = 0; i < lines.length; i++) {
            result.append(lines[i]);
            if ((i + 1) % 3 == 0) {
                result.append("\n");
            }
        }

        // Разворачиваем содержимое задом наперед
        result.reverse();

        // Преобразуем StringBuilder в строку и выводим на экран
        System.out.println(result.toString());


    }
}
