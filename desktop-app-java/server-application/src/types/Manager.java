package types;

public class Manager {

    /**
     * Идентификатор Логин Пароль Фамилия Имя Отчество Должность
     *
     */
    private long id;
    private String login;
    private String hashPassword;
    private String secondName;
    private String firstName;
    private String middleName;
    private String position;

    public Manager() {
    }

    public Manager(String login,
            String hashPassword,
            String secondName,
            String firstName,
            String middleName,
            String position) {
        this.login = login;
        this.hashPassword = hashPassword;
        this.secondName = secondName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.position = position;
    }

    public Manager(long id,
            String login,
            String hashPassword,
            String secondName,
            String firstName,
            String middleName,
            String position) {
        this(login, hashPassword, secondName, firstName, middleName, position);
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
