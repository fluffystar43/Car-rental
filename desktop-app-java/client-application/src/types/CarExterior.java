package types;

public class CarExterior {
    /**
     * Индентификатор
     * Автомобиль
     * Цвет
     * Количество дверей
     * Радиус колес
     */
    private long id;
    private long car_id;
    private short color_id;
    private byte count_doors;
    private byte radius_weel;

    public CarExterior() {
    }

    public CarExterior(long car_id, short color_id, byte count_doors, 
            byte radius_weel) {
        this.car_id = car_id;
        this.color_id = color_id;
        this.count_doors = count_doors;
        this.radius_weel = radius_weel;
    }
    
    public CarExterior(long id, long car_id, short color_id, byte count_doors, 
            byte radius_weel) {
        this(car_id, color_id, count_doors, radius_weel);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCar_id() {
        return car_id;
    }

    public void setCar_id(long car_id) {
        this.car_id = car_id;
    }

    public short getColor_id() {
        return color_id;
    }

    public void setColor_id(short color_id) {
        this.color_id = color_id;
    }
    
    public byte getCount_doors() {
        return count_doors;
    }

    public void setCount_doors(byte count_doors) {
        this.count_doors = count_doors;
    }

    public byte getRadius_weel() {
        return radius_weel;
    }

    public void setRadius_weel(byte radius_weel) {
        this.radius_weel = radius_weel;
    }
    
}
