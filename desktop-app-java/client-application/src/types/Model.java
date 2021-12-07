package types;

public class Model {

    /**
     * Идентификатор Бренд Название
     */
    private short id;
    private short brandId;
    private String name;

    public Model() {
    }

    public Model(short brandId, String name) {
        this.brandId = brandId;
        this.name = name;
    }

    public Model(short id, short brandId, String name) {
        this(brandId, name);
        this.id = id;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public short getBrandId() {
        return brandId;
    }

    public void setBrandId(short brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
