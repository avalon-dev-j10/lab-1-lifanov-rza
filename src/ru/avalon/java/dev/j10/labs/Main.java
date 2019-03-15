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

        Person ivanov = new Person("����", "������", "��������", "");
        Person smith = new Person("John", "Smith", "", "Edvard");
        smith.setAddress(190240, "USA", "Boston", "Mainroad", 23, 656);

        /*
         * (�������): �������� ���������� ������ 'Person'
         *
         * 1. ������������������� ���������� 'ivanov', ���,
         *    ����� ��� ���������� ������ ���� 'Person'
         *    ����������� �������� �� ����� '������ ���� ��������'.
         *
         * 2. ������������������� ���������� 'smith', ���,
         *    ����� ��� ���������� ������ ���� 'Person'
         *    ����������� �������� �� ����� 'John Edvard Smith'.
         */

        fullNameIvanov = ivanov.getFullName();
        fullNameSmith = smith.getFullName();
        addressIvanov = ivanov.getAddress();
        addressSmith = smith.getAddress();

        /*
         * (�������): �������� ��������� ��������� ����������:
         *
         * 1. ��������� ����������, ���������� ������ ���
         *    ��������, ���������� ��������, ������������
         *    ���������� 'ivanov'.
         *
         * 2. ��������� ����������, ���������� ������ ���
         *    ��������, ���������� ��������, ������������
         *    ���������� 'smith'.
         *
         * 3. ��������� ����������, ���������� ����� ����������
         *    ��������, ���������� ��������, ������������
         *    ���������� 'ivanov'.
         *
         * 4. ��������� ����������, ���������� ����� ����������
         *    ��������, ���������� ��������, ������������
         *    ���������� 'smith'.
         */

        System.out.println("��-�. ������: \n������ ���:\t" + fullNameIvanov + "\n�����:\t\t" + addressIvanov + "\n");
        System.out.println("Mr. Smith: \n������ ���:\t" + fullNameSmith + "\n�����:\t\t" + addressSmith + "\n");

        /*
         * (�������): �������� � ������� �������� ��������� ��������� ����������:
         *
         * �������� ������ ���������� ������ ���� �������� ��
         * ��������� ������.
         */

        ivanov.setAddress(100134, "Russia", "Saint-Petersburg", "Nevsky", 34, 23);
        addressIvanov = ivanov.getAddress();
        System.out.println("��-�. ������: \n������ ���:\t" + fullNameIvanov + "\n�����:\t\t" + addressIvanov + "\n");

        System.out.println("������� ���������� �������: " + ivanov.getPassport());
        ivanov.setPassport(4102, 312412, "01/04/2004", "���� �� �� ���",  "11/02/1990");
        System.out.println();
        System.out.println("������� ���������� �������: " + ivanov.getPassport());
    }
}
