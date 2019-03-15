package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

import java.text.Format;
import java.util.Calendar;
import java.util.Date;

/**
 * ������������� � ��������.
 * <p>
 * � ����� ������ ������� ������� �������������� ��� ��������,
 * ���������:
 * <ol>
 * <li>������;
 * <li>����������� �������;
 * <li>��������� �� ����� ����������.
 * </ol>
 */
public class Person {
    private String fullName;
    private String name;
    private String surname;
    private String patronymic;
    private String secondName;
    private Address address;
    private Passport passport;

    public Person() {
        name = "";
        address = new Address();
        passport = new Passport();
    }

    public Person(String name, String surname, String patronymic, String secondName) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.secondName = secondName;
        address = new Address();
        passport = new Passport(name, surname, patronymic, secondName);
    }

    /**
     * ���������� ������ ��� ��������.
     * <p>
     * ���� � �������� ���� ���, ������� � ��������, ��
     * ��������� ���, ������� � ��������, ���������� ��������.
     * <p>
     * ���� � �������� ��� ��������, �� ���� ������ ���, ��
     * ���������� ���, ������ ����� ������� �����, � �������,
     * ���������� ��������. ����� �������� ������� �����
     * ������ ������ �����. ��������, "������ �. ������".
     * <p>
     * ���� � �������� ��� �� �������� �� ������� �����, �
     * ���� ������ ��� � �������, �� ���������� ��, ����������
     * ��������.
     *
     * @return ��� �������� � ���� ������.
     */
    public String getFullName() {
        fullName = "";
        if (name.length() > 0 && surname.length() > 0 && patronymic.length() > 0) {
            fullName = name + " " + surname + " " + patronymic;
        } else if (name.length() > 0 && secondName.length() > 0 && surname.length() > 0) {
            fullName = name + " " + secondName.substring(0, 1) + ". " + surname;
        } else fullName = name + " " + surname;
        return fullName;
    }

    public void setFullName(String name, String surname, String  patronymic, String secondName) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.secondName = secondName;
    }

    /**
     * ���������� �����, �� �������� ��������� �������.
     * <p>
     * ������������ ����� ������������� ����� ����������
     * ����������� ��������, �������� ���������� ������.
     *
     * @return ����� ����������� � ���� ������.
     */

    public String getAddress() {
        String addr = address.getIndex() + ", " + address.getCountry() + ", " + address.getCity() + ", "
                + address.getStreet() + " " + address.getHouseNumber() + ", " + address.getFlatNumber();
        if (addr.replaceAll(" ", "").replaceAll("0", "").replaceAll(",", "").length() == 0) return "����� �� ������";
        return addr;
    }

    public void setAddress(int index, String country, String city, String street, int houseNumber, int flatNumber) {
        address.setIndex(index);
        address.setCountry(country);
        address.setCity(city);
        address.setStreet(street);
        address.setHouseNumber(houseNumber);
        address.setFlatNumber(flatNumber);
    }

    public String getPassport() {

        String psprt = "\n���� �������� " + passport.getBirthDate() + " c���� " + passport.getSer() + " ����� " + passport.getNumber() + " ����� " + passport.getPassportDate() +
                " " + passport.getAuthorityPassport();
        if (passport.getSer() == 0 || passport.getNumber() == 0) return "������� �� ������";
        return psprt;
    }

    public void setPassport(int ser, int number, String passportDate, String authorityPassport,  String birthDate) {
        passport.setSer(ser);
        passport.setNumber(number);
        passport.setBirthDate(birthDate);
        passport.setAuthorityPassport(authorityPassport);
        passport.setPassportDate(passportDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }


}