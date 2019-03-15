package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        String fullNameIvanov;
        String fullNameSmith;
        String addressIvanov;
        String addressSmith;

        Person ivanov = new Person("Иван", "Иванов", "Иванович", "");
        Person smith = new Person("John", "Smith", "", "Edvard");
        smith.setAddress(190240, "USA", "Boston", "Mainroad", 23, 656);

        /*
         * (Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        fullNameIvanov = ivanov.getFullName();
        fullNameSmith = smith.getFullName();
        addressIvanov = ivanov.getAddress();
        addressSmith = smith.getAddress();

        /*
         * (Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        System.out.println("Гр-н. Иванов: \nПолное имя:\t" + fullNameIvanov + "\nАдрес:\t\t" + addressIvanov + "\n");
        System.out.println("Mr. Smith: \nПолное имя:\t" + fullNameSmith + "\nАдрес:\t\t" + addressSmith + "\n");

        /*
         * (Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */

        ivanov.setAddress(100134, "Russia", "Saint-Petersburg", "Nevsky", 34, 23);
        addressIvanov = ivanov.getAddress();
        System.out.println("Гр-н. Иванов: \nПолное имя:\t" + fullNameIvanov + "\nАдрес:\t\t" + addressIvanov + "\n");

        System.out.println("Паспорт гражданина Иванова: " + ivanov.getPassport());
        ivanov.setPassport(4102, 312412, "01/04/2004", "УФМС РФ по СПб",  "11/02/1990");
        System.out.println();
        System.out.println("Паспорт гражданина Иванова: " + ivanov.getPassport());
    }
}
