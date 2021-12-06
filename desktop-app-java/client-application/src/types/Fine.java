package types;

public class Fine {

    /**
     * Идентификатор Клиент Автомобиль Описание Оплачен/Не оплачен
     */
    private long id;
    private long client_id;
    private long car_id;
    private String description;
    private Boolean is_paid;

    public Fine() {
    }

    public Fine(long client_id, long car_id, String description, Boolean is_paid) {
        this.client_id = client_id;
        this.car_id = car_id;
        this.description = description;
        this.is_paid = is_paid;
    }

    public Fine(long id, long client_id, long car_id, String description, Boolean is_paid) {
        this(client_id, car_id, description, is_paid);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIs_paid() {
        return is_paid;
    }

    public void setIs_paid(Boolean is_paid) {
        this.is_paid = is_paid;
    }
    
    

}
