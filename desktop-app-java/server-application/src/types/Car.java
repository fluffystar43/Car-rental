package types;

public class Car {

    /**
     * Идентификатор Марка Модель Класс Коробка передач Мощность двигателя
     * Топливо Цена аренды Привод Кузов Год выпуска Удален
     */
    private long id;
    private short brand_id;
    private int model_id;
    private byte car_class_id;
    private byte power_streering_id;
    private short engine_power;
    private byte fuel_id;
    private int rental_price;
    private byte drive_id;
    private byte body_id;
    private short year_manufacture;
    private Boolean is_deleted;

    public Car() {
        this.is_deleted = false;
    }

    public Car(short brand_id,
            int model_id,
            byte car_class_id,
            byte power_streering_id,
            short engine_power,
            byte fuel_id,
            int rental_price,
            byte drive_id,
            byte body_id,
            short year_manufacture) {
        this.brand_id = brand_id;
        this.model_id = model_id;
        this.car_class_id = car_class_id;
        this.power_streering_id = power_streering_id;
        this.engine_power = engine_power;
        this.fuel_id = fuel_id;
        this.rental_price = rental_price;
        this.drive_id = drive_id;
        this.body_id = body_id;
        this.year_manufacture = year_manufacture;
        this.is_deleted = false;
    }

    public Car(long id,
            short brand_id,
            int model_id,
            byte car_class_id,
            byte power_streering_id,
            short engine_power,
            byte fuel_id,
            int rental_price,
            byte drive_id,
            byte body_id,
            short year_manufacture) {
        this(brand_id,
                model_id,
                car_class_id,
                power_streering_id,
                engine_power,
                fuel_id,
                rental_price,
                drive_id,
                body_id,
                year_manufacture);
        this.id = id;
        this.is_deleted = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public short getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(short brand_id) {
        this.brand_id = brand_id;
    }

    public int getModel_id() {
        return model_id;
    }

    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }

    public byte getCar_class_id() {
        return car_class_id;
    }

    public void setCar_class_id(byte car_class_id) {
        this.car_class_id = car_class_id;
    }

    public byte getPower_streering_id() {
        return power_streering_id;
    }

    public void setPower_streering_id(byte power_streering_id) {
        this.power_streering_id = power_streering_id;
    }

    public short getEngine_power() {
        return engine_power;
    }

    public void setEngine_power(short engine_power) {
        this.engine_power = engine_power;
    }

    public byte getFuel_id() {
        return fuel_id;
    }

    public void setFuel_id(byte fuel_id) {
        this.fuel_id = fuel_id;
    }

    public int getRental_price() {
        return rental_price;
    }

    public void setRental_price(int rental_price) {
        this.rental_price = rental_price;
    }

    public byte getDrive_id() {
        return drive_id;
    }

    public void setDrive_id(byte drive_id) {
        this.drive_id = drive_id;
    }

    public byte getBody_id() {
        return body_id;
    }

    public void setBody_id(byte body_id) {
        this.body_id = body_id;
    }

    public short getYear_manufacture() {
        return year_manufacture;
    }

    public void setYear_manufacture(short year_manufacture) {
        this.year_manufacture = year_manufacture;
    }

    public Boolean getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

}
