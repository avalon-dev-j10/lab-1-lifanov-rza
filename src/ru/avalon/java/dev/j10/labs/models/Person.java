package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 * <li>именем;
 * <li>паспортными данными;
 * <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    private String fullName;
    private Address address;
    private Passport passport = new Passport();

    public Person() {
        passport.setName("");
        address = new Address();
    }

    public Person(String name, String surname, String patronymic, String secondName) {
        passport.setName(name);
        passport.setSurname(surname);
        passport.setPatronymic(patronymic);
        passport.setSecondName(secondName);
        address = new Address();
    }

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        fullName = "";
        if (passport.getName().length() > 0 && passport.getSurname().length() > 0 && passport.getPatronymic().length() > 0) {
            fullName = passport.getName() + " " + passport.getSurname() + " " + passport.getPatronymic();
        } else if (passport.getName().length() > 0 && passport.getSecondName().length() > 0 && passport.getSurname().length() > 0) {
            fullName = passport.getName() + " " + passport.getSecondName().substring(0, 1) + ". " + passport.getSurname();
        } else fullName = passport.getName() + " " + passport.getSurname();
        return fullName;
    }

    public void setFullName(String name, String surname, String  patronymic, String secondName) {
        passport.setName(name);
        passport.setSurname(surname);
        passport.setPatronymic(patronymic);
        passport.setSecondName(secondName);
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */

    public String getAddress() {
        String addr = address.getIndex() + ", " + address.getCountry() + ", " + address.getCity() + ", "
                + address.getStreet() + " " + address.getHouseNumber() + ", " + address.getFlatNumber();
        if (addr.replaceAll(" ", "").replaceAll("0", "").replaceAll(",", "").length() == 0) return "Адрес не указан";
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

        String psprt = "\nДата рождения " + passport.getBirthDate() + " cерия " + passport.getSer() + " номер " + passport.getNumber() + " выдан " + passport.getPassportDate() +
                " " + passport.getAuthorityPassport();
        if (passport.getSer() == 0 || passport.getNumber() == 0) return "Паспорт не найден";
        return psprt;
    }

    public void setPassport(int ser, int number, String passportDate, String authorityPassport,  String birthDate) {
        passport.setSer(ser);
        passport.setNumber(number);
        passport.setBirthDate(birthDate);
        passport.setAuthorityPassport(authorityPassport);
        passport.setPassportDate(passportDate);
    }
    
}