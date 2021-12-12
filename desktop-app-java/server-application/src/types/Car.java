package types;

public class Car {

    /**
     * Идентификатор Марка Модель Класс Коробка передач Мощность двигателя
     * Топливо Цена аренды Привод Кузов Год выпуска Удален
     */
    private long id;
    private short brandId;
    private int modelId;
    private short carClassId;
    private short powerStreeringId;
    private short enginePower;
    private short fuelId;
    private int rentalPrice;
    private short driveId;
    private short bodyId;
    private short yearManufacture;
    private Boolean isDeleted;
    private String VIN;

    public Car() {
        this.isDeleted = false;
    }

    public Car(short brandId,
            int modelId,
            short carClassId,
            short powerStreeringId,
            short enginePower,
            short fuelId,
            int rentalPrice,
            short driveId,
            short bodyId,
            short yearManufacture,
            String VIN) {
        this.brandId = brandId;
        this.modelId = modelId;
        this.carClassId = carClassId;
        this.powerStreeringId = powerStreeringId;
        this.enginePower = enginePower;
        this.fuelId = fuelId;
        this.rentalPrice = rentalPrice;
        this.driveId = driveId;
        this.bodyId = bodyId;
        this.yearManufacture = yearManufacture;
        this.VIN = VIN;
        this.isDeleted = false;
    }

    public Car(long id,
            short brandId,
            int modelId,
            short carClassId,
            short powerStreeringId,
            short enginePower,
            short fuelId,
            int rentalPrice,
            short driveId,
            short bodyId,
            short yearManufacture,
            String VIN) {
        this(brandId,
                modelId,
                carClassId,
                powerStreeringId,
                enginePower,
                fuelId,
                rentalPrice,
                driveId,
                bodyId,
                yearManufacture, VIN);
        this.id = id;
        this.isDeleted = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public short getBrandId() {
        return brandId;
    }

    public void setBrandId(short brandId) {
        this.brandId = brandId;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public short getCarClassId() {
        return carClassId;
    }

    public void setCarClassId(short carClassId) {
        this.carClassId = carClassId;
    }

    public short getPowerStreeringId() {
        return powerStreeringId;
    }

    public void setPowerStreeringId(short powerStreeringId) {
        this.powerStreeringId = powerStreeringId;
    }

    public short getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(short enginePower) {
        this.enginePower = enginePower;
    }

    public short getFuelId() {
        return fuelId;
    }

    public void setFuelId(short fuelId) {
        this.fuelId = fuelId;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public short getDriveId() {
        return driveId;
    }

    public void setDriveId(short driveId) {
        this.driveId = driveId;
    }

    public short getBodyId() {
        return bodyId;
    }

    public void setBodyId(short bodyId) {
        this.bodyId = bodyId;
    }

    public short getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(short yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }
}
