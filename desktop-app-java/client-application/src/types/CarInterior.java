package types;

public class CarInterior {

    /**
     * Идентификатор Автомобиль Цвет Наличие кондиционера/Климат контроля
     * Количество мест Наличие детского сидения Наличие сигнализации Регулировка
     * руля Регулировка сидений Наличие беспроводной зарядки Наличие
     * холодильника Наличие регистратора Объем багажника
     */
    private long id;
    private long carId;
    private short colorId;
    private Boolean conditioner;
    private short countSeats;
    private Boolean childSeat;
    private Boolean signalization;
    private Boolean steeringWheelAdjustment;
    private Boolean seatAdjustment;
    private Boolean wirelessCharging;
    private Boolean fridge;
    private Boolean registrar;
    private short trunkVolume;

    public CarInterior() {
    }

    public CarInterior(long carId,
            short colorId,
            Boolean conditioner,
            short countSeats,
            Boolean childSeat,
            Boolean signalization,
            Boolean steeringWheelAdjustment,
            Boolean seatAdjustment,
            Boolean wirelessCharging,
            Boolean fridge,
            Boolean registrar,
            short trunkVolume) {
        this.carId = carId;
        this.colorId = colorId;
        this.conditioner = conditioner;
        this.countSeats = countSeats;
        this.childSeat = childSeat;
        this.signalization = signalization;
        this.steeringWheelAdjustment = steeringWheelAdjustment;
        this.seatAdjustment = seatAdjustment;
        this.wirelessCharging = wirelessCharging;
        this.fridge = fridge;
        this.registrar = registrar;
        this.trunkVolume = trunkVolume;
    }

    public CarInterior(long id,
            long carId,
            short colorId,
            Boolean conditioner,
            short countSeats,
            Boolean childSeat,
            Boolean signalization,
            Boolean steeringWheelAdjustment,
            Boolean seatAdjustment,
            Boolean wirelessCharging,
            Boolean fridge,
            Boolean registrar,
            short trunkVolume) {
        this(carId,
                colorId,
                conditioner,
                countSeats,
                childSeat,
                signalization,
                steeringWheelAdjustment,
                seatAdjustment,
                wirelessCharging,
                fridge,
                registrar,
                trunkVolume);
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

    public Boolean getConditioner() {
        return conditioner;
    }

    public void setConditioner(Boolean conditioner) {
        this.conditioner = conditioner;
    }

    public short getCountSeats() {
        return countSeats;
    }

    public void setCountSeats(short countSeats) {
        this.countSeats = countSeats;
    }

    public Boolean getChildSeat() {
        return childSeat;
    }

    public void setChildSeat(Boolean childSeat) {
        this.childSeat = childSeat;
    }

    public Boolean getSignalization() {
        return signalization;
    }

    public void setSignalization(Boolean signalization) {
        this.signalization = signalization;
    }

    public Boolean getSteeringWheelAdjustment() {
        return steeringWheelAdjustment;
    }

    public void setSteeringWheelAdjustment(Boolean steeringWheelAdjustment) {
        this.steeringWheelAdjustment = steeringWheelAdjustment;
    }

    public Boolean getSeatAdjustment() {
        return seatAdjustment;
    }

    public void setSeatAdjustment(Boolean seatAdjustment) {
        this.seatAdjustment = seatAdjustment;
    }

    public Boolean getWirelessCharging() {
        return wirelessCharging;
    }

    public void setWirelessCharging(Boolean wirelessCharging) {
        this.wirelessCharging = wirelessCharging;
    }

    public Boolean getFridge() {
        return fridge;
    }

    public void setFridge(Boolean fridge) {
        this.fridge = fridge;
    }

    public Boolean getRegistrar() {
        return registrar;
    }

    public void setRegistrar(Boolean registrar) {
        this.registrar = registrar;
    }

    public short getTrunkVolume() {
        return trunkVolume;
    }

    public void setTrunkVolume(short trunkVolume) {
        this.trunkVolume = trunkVolume;
    }
}
