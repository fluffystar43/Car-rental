package types;

import java.util.Date;

public class Order {

    /**
     * Идентификатор Клиент Автомобиль Дата начала Дата завершения Итоговая
     * сумма
     */
    private long id;
    private long client_id;
    private long car_id;
    private Date start_date;
    private Date end_date;
    private int total_cost;

    public Order() {
    }

    public Order(long client_id, long car_id, Date start_date, Date end_date, int total_cost) {
        this.client_id = client_id;
        this.car_id = car_id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.total_cost = total_cost;
    }

    public Order(long id, long client_id, long car_id, Date start_date, Date end_date, int total_cost) {
        this(client_id, car_id, start_date, end_date, total_cost);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getClient_id() {
        return client_id;
    }

    public void setClient_id(long client_id) {
        this.client_id = client_id;
    }

    public long getCar_id() {
        return car_id;
    }

    public void setCar_id(long car_id) {
        this.car_id = car_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(int total_cost) {
        this.total_cost = total_cost;
    }

}
