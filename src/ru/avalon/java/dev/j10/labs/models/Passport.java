package ru.avalon.java.dev.j10.labs.models;

import java.util.Calendar;
import java.util.Date;


import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Person;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
class Passport {
    private int ser;
    private int number;
    private String name;
    private String surname;
    private String patronymic;
    private String secondName;
    private String birthDate;
    private String passportDate;
    private String authorityPassport;

    Passport() {

    }

    Passport(int ser, int number, String birthDate, String passportDate, String authorityPassport) {
        this.ser = ser;
        this.number = number;
        this.birthDate = birthDate;
        this.passportDate = passportDate;
        this.authorityPassport = authorityPassport;
    }

    Passport(String name, String surname, String patronymic, String secondName) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.secondName = secondName;
    }

    public int getSer() {
        return ser;
    }

    public void setSer(int ser) {
        this.ser = ser;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassportDate() {
        return passportDate;
    }

    public void setPassportDate(String passportDate) {
        this.passportDate = passportDate;
    }

    public String getAuthorityPassport() {
        return authorityPassport;
    }

    public void setAuthorityPassport(String authorityPassport) {
        this.authorityPassport = authorityPassport;
    }

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
}
