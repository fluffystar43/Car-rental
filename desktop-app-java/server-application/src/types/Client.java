package types;

import java.util.Date;

public class Client {

    /**
     * Идентификатор Логин Пароль Фамилия Имя Отчество Дата рождения Номер
     * телефона Паспортные данные Водительское удостоверение Электронная почта
     */
    private long id;
    private String login;
    private String hash_password;
    private String second_name;
    private String first_name;
    private String middle_name;
    private Date date_birthday;
    private String phone_number;
    private String passport_data;
    private String drivers_license;
    private String email;

    public Client() {
    }

    public Client(String login, String hash_password, String second_name, String first_name, String middle_name, Date date_birthday, String phone_number, String passport_data, String drivers_license, String email) {
        this.login = login;
        this.hash_password = hash_password;
        this.second_name = second_name;        
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.date_birthday = date_birthday;
        this.phone_number = phone_number;
        this.passport_data = passport_data;
        this.drivers_license = drivers_license;
        this.email = email;
    }

    public Client(long id,
            String login,
            String hash_password,
            String second_name,
            String first_name,
            String middle_name,
            Date date_birthday,
            String phone_number,
            String passport_data,
            String drivers_license,
            String email) {
        this(login,
                hash_password,
                second_name,
                first_name,
                middle_name,
                date_birthday,
                phone_number,
                passport_data,
                drivers_license,
                email);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHash_password() {
        return hash_password;
    }

    public void setHash_password(String hash_password) {
        this.hash_password = hash_password;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public Date getDate_birthday() {
        return date_birthday;
    }

    public void setDate_birthday(Date date_birthday) {
        this.date_birthday = date_birthday;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPassport_data() {
        return passport_data;
    }

    public void setPassport_data(String passport_data) {
        this.passport_data = passport_data;
    }

    public String getDrivers_license() {
        return drivers_license;
    }

    public void setDrivers_license(String drivers_license) {
        this.drivers_license = drivers_license;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
