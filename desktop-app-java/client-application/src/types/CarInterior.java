package types;

public class CarInterior {

    /**
     * Идентификатор Автомобиль Цвет Наличие кондиционера/Климат контроля
     * Количество мест Наличие детского сидения Наличие сигнализации Регулировка
     * руля Регулировка сидений Наличие беспроводной зарядки Наличие
     * холодильника Наличие регистратора Объем багажника
     */
    private long id;
    private long car_id;
    private short color_id;
    private Boolean conditioner;
    private byte count_seats;
    private Boolean child_seat;
    private Boolean signalization;
    private Boolean steering_wheel_adjustment;
    private Boolean seat_adjustment;
    private Boolean wireless_charging;
    private Boolean fridge;
    private Boolean registrar;
    private short trunk_volume;

    public CarInterior() {
    }

    public CarInterior(long car_id,
            short color_id,
            Boolean conditioner,
            byte count_seats,
            Boolean child_seat,
            Boolean signalization,
            Boolean steering_wheel_adjustment,
            Boolean seat_adjustment,
            Boolean wireless_charging,
            Boolean fridge,
            Boolean registrar,
            short trunk_volume) {
        this.car_id = car_id;
        this.color_id = color_id;
        this.conditioner = conditioner;
        this.count_seats = count_seats;
        this.child_seat = child_seat;
        this.signalization = signalization;
        this.steering_wheel_adjustment = steering_wheel_adjustment;
        this.seat_adjustment = seat_adjustment;
        this.wireless_charging = wireless_charging;
        this.fridge = fridge;
        this.registrar = registrar;
        this.trunk_volume = trunk_volume;
    }

    public CarInterior(long id,
            long car_id,
            short color_id,
            Boolean conditioner,
            byte count_seats,
            Boolean child_seat,
            Boolean signalization,
            Boolean steering_wheel_adjustment,
            Boolean seat_adjustment,
            Boolean wireless_charging,
            Boolean fridge,
            Boolean registrar,
            short trunk_volume) {
        this(car_id,
                color_id,
                conditioner,
                count_seats,
                child_seat,
                signalization,
                steering_wheel_adjustment,
                seat_adjustment,
                wireless_charging,
                fridge,
                registrar,
                trunk_volume);
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

    public Boolean getConditioner() {
        return conditioner;
    }

    public void setConditioner(Boolean conditioner) {
        this.conditioner = conditioner;
    }

    public byte getCount_seats() {
        return count_seats;
    }

    public void setCount_seats(byte count_seats) {
        this.count_seats = count_seats;
    }

    public Boolean getChild_seat() {
        return child_seat;
    }

    public void setChild_seat(Boolean child_seat) {
        this.child_seat = child_seat;
    }

    public Boolean getSignalization() {
        return signalization;
    }

    public void setSignalization(Boolean signalization) {
        this.signalization = signalization;
    }

    public Boolean getSteering_wheel_adjustment() {
        return steering_wheel_adjustment;
    }

    public void setSteering_wheel_adjustment(Boolean steering_wheel_adjustment) {
        this.steering_wheel_adjustment = steering_wheel_adjustment;
    }

    public Boolean getSeat_adjustment() {
        return seat_adjustment;
    }

    public void setSeat_adjustment(Boolean seat_adjustment) {
        this.seat_adjustment = seat_adjustment;
    }

    public Boolean getWireless_charging() {
        return wireless_charging;
    }

    public void setWireless_charging(Boolean wireless_charging) {
        this.wireless_charging = wireless_charging;
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

    public short getTrunk_volume() {
        return trunk_volume;
    }

    public void setTrunk_volume(short trunk_volume) {
        this.trunk_volume = trunk_volume;
    }
}
