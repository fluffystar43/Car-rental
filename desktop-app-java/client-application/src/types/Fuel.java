package types;

public class Fuel {
    
    /**
     * Идентификатор Название
     */
    private short id;
    private String name;

    public Fuel() {
    }

    public Fuel(String name) {
        this.name = name;
    }

    public Fuel(short id, String name) {
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
