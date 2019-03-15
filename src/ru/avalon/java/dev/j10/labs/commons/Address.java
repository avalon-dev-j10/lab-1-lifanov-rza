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
            System.out.println("������ �� ������\n");
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
        else System.out.println("������ ���� �� ����������");
    }

    public void setFlatNumber(int flatNumber) {
        if (flatNumber >= 0) this.flatNumber = flatNumber;
        else System.out.println("����� �������� �� ����������");

    }
}


/*
 * TODO(�������): �������� ����� Address.
 *
 * 1. ������� ���� � ����� ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. �������� �����, ������� �� ������. ��������� � ���
 *    ����� ��� ������ ����� �����, ���� �� ��������� � ����
 *    �����.
 *
 * 3. ��������� ��� ���, ����� ���������� ������� ����
 *    ���������� � ������.
 *
 * 4. ��������� ��� ���, ����� ������ ������ ���� ���������
 *    � ������.
 */