package types;

public class Manager {

    /**
     * Идентификатор Логин Пароль Фамилия Имя Отчество Должность
     *
     */
    private long id;
    private String login;
    private String hash_password;
    private String second_name;
    private String first_name;
    private String middle_name;
    private String position;

    public Manager() {
    }

    public Manager(String login,
            String hash_password,
            String second_name,
            String first_name,
            String middle_name,
            String position) {
        this.login = login;
        this.hash_password = hash_password;
        this.second_name = second_name;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.position = position;
    }

    public Manager(long id,
            String login,
            String hash_password,
            String second_name,
            String first_name,
            String middle_name,
            String position) {
        this(login, hash_password, second_name, first_name, middle_name, position);
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
