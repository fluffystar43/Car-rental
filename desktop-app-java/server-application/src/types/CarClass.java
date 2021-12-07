package types;

public class CarClass {

    /**
     * Идентификатор Название
     */
    private short id;
    private String name;

    public CarClass() {
    }

    public CarClass(String name) {
        this.name = name;
    }

    public CarClass(short id, String name) {
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
