package types;

import java.util.Date;

public class Client {

    /**
     * Идентификатор Логин Пароль Фамилия Имя Отчество Дата рождения Номер
     * телефона Паспортные данные Водительское удостоверение Электронная почта
     */
    private long id;
    private String login;
    private String hashPassword;
    private String secondName;
    private String firstName;
    private String middleName;
    private Date dateBirthday;
    private String phoneNumber;
    private String passportData;
    private String driversLicense;
    private String email;

    public Client() {
    }

    public Client(String login,
            String hashPassword,
            String secondName,
            String firstName,
            String middleName,
            Date dateBirthday,
            String phoneNumber,
            String passportData,
            String driversLicense,
            String email) {
        this.login = login;
        this.hashPassword = hashPassword;
        this.secondName = secondName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateBirthday = dateBirthday;
        this.phoneNumber = phoneNumber;
        this.passportData = passportData;
        this.driversLicense = driversLicense;
        this.email = email;
    }

    public Client(long id,
            String login,
            String hashPassword,
            String secondName,
            String firstName,
            String middleName,
            Date dateBirthday,
            String phoneNumber,
            String passportData,
            String driversLicense,
            String email) {
        this(login,
                hashPassword,
                secondName,
                firstName,
                middleName,
                dateBirthday,
                phoneNumber,
                passportData,
                driversLicense,
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

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(Date dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassportData() {
        return passportData;
    }

    public void setPassportData(String passportData) {
        this.passportData = passportData;
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(String driversLicense) {
        this.driversLicense = driversLicense;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
