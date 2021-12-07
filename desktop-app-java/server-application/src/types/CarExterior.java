package types;

public class CarExterior {

    /**
     * Индентификатор Автомобиль Цвет Количество дверей Радиус колес
     */
    private long id;
    private long carId;
    private short colorId;
    private short countDoors;
    private short radiusWeel;

    public CarExterior() {
    }

    public CarExterior(long carId, short colorId, short countDoors,
            short radiusWeel) {
        this.carId = carId;
        this.colorId = colorId;
        this.countDoors = countDoors;
        this.radiusWeel = radiusWeel;
    }

    public CarExterior(long id, long carId, short colorId, short countDoors,
            short radiusWeel) {
        this(carId, colorId, countDoors, radiusWeel);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public short getColorId() {
        return colorId;
    }

    public void setColorId(short colorId) {
        this.colorId = colorId;
    }

    public short getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(short countDoors) {
        this.countDoors = countDoors;
    }

    public short getRadiusWeel() {
        return radiusWeel;
    }

    public void setRadiusWeel(short radiusWeel) {
        this.radiusWeel = radiusWeel;
    }
}
