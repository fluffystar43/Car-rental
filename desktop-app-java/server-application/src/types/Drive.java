package types;

public class Drive {

    /**
     * Идентификатор Название
     */
    private short id;
    private String name;

    public Drive() {
    }

    public Drive(String name) {
        this.name = name;
    }

    public Drive(short id, String name) {
        this(name);
        this.id = id;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
