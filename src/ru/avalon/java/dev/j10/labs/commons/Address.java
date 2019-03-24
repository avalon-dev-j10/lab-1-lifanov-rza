package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    private String fullAddress;
    private int index;
    private String country;
    private String city;
    private String street;
    private int houseNumber;
    private int flatNumber;

    public Address() {
        fullAddress = "";
        index = 0;
        country = "";
        city = "";
        street = "";
        houseNumber = 0;
        flatNumber = 0;
    }

    public Address(int index, String country, String city, String street, int houseNumber, int flatNumber) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    public int getIndex() {
        return index;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setIndex(int index) {
        if (index >= 100_000 && index <= 999_999) {
            this.index = index;
        } else {
            this.index = 0;
            System.out.println("Индекс не найден\n");
        }
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        if (houseNumber >= 0) this.houseNumber = houseNumber;
        else System.out.println("Такого дома не существует");
    }

    public void setFlatNumber(int flatNumber) {
        if (flatNumber >= 0) this.flatNumber = flatNumber;
        else System.out.println("Такой квартиры не существует");

    }
}


/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */