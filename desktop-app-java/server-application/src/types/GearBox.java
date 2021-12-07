package types;

public class GearBox {

    /**
     * Идентификатор Название
     */
    private short id;
    private String name;

    public GearBox() {
    }

    public GearBox(String name) {
        this.name = name;
    }

    public GearBox(byte id, String name) {
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
