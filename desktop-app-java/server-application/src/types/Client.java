package types;

import java.util.Date;
import javax.xml.datatype.XMLGregorianCalendar;

public class Client {

    /**
     * Идентификатор Логин Пароль Фамилия Имя Отчество Дата рождения Номер
     * телефона Паспортные данные Водительское удостоверение Электронная почта
     * Заблокирован
     */
    private long id;
    private String login;
    private String hashPassword;
    private String secondName;
    private String firstName;
    private String middleName;
    private Date dateBirthday;
    private XMLGregorianCalendar dateBirthday2;
    private String phoneNumber;
    private String passportData;
    private String driversLicense;
    private String email;
    private Boolean isBlocked;

    public Client() {
        this.isBlocked = false;
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
            String email,
            Boolean isBlocked) {
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
        this.isBlocked = isBlocked;
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
            String email,
            Boolean isBlocked) {
        this(login,
                hashPassword,
                secondName,
                firstName,
                middleName,
                dateBirthday,
                phoneNumber,
                passportData,
                driversLicense,
                email,
                isBlocked);
        this.id = id;
    }
    
    public Client (
            String secondName,
            String firstName,
            String middleName,
            XMLGregorianCalendar dateBirthday2,
            String phoneNumber,
            String passportData,
            String driversLicense,
            String email) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateBirthday2 = dateBirthday2;
        this.phoneNumber = phoneNumber;
        this.passportData = passportData;
        this.driversLicense = driversLicense;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public XMLGregorianCalendar getDateBirthday2() {
        return dateBirthday2;
    }

    public void setDateBirthday2(XMLGregorianCalendar dateBirthday2) {
        this.dateBirthday2 = dateBirthday2;
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

    public Boolean getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(Boolean isBlocked) {
        this.isBlocked = isBlocked;
    }
}
