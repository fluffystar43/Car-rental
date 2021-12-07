package types;

public class Fine {

    /**
     * Идентификатор Клиент Автомобиль Описание Оплачен/Не оплачен
     */
    private long id;
    private long clientId;
    private long carId;
    private String description;
    private Boolean isPaid;

    public Fine() {
    }

    public Fine(long clientId, long carId, String description, Boolean isPaid) {
        this.clientId = clientId;
        this.carId = carId;
        this.description = description;
        this.isPaid = isPaid;
    }

    public Fine(long id, long clientId, long carId, String description, Boolean isPaid) {
        this(clientId, carId, description, isPaid);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }
}
