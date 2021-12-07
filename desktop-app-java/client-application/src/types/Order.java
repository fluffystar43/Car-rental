package types;

import java.util.Date;

public class Order {

    /**
     * Идентификатор Клиент Автомобиль Дата начала Дата завершения Итоговая
     * сумма
     */
    private long id;
    private long clientId;
    private long carId;
    private Date startDate;
    private Date endDate;
    private int totalCost;

    public Order() {
    }

    public Order(long clientId, long carId, Date startDate, Date endDate, int totalCost) {
        this.clientId = clientId;
        this.carId = carId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalCost = totalCost;
    }

    public Order(long id, long clientId, long carId, Date startDate, Date endDate, int totalCost) {
        this(clientId, carId, startDate, endDate, totalCost);
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
