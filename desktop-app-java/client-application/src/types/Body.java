package types;

public class Body {

    /**
     * Идентификатор Название
     */
    private short id;
    private String name;

    public Body() {
    }

    public Body(String name) {
        this.name = name;
    }

    public Body(short id, String name) {
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
