package pl.sda.kantor.flow;

import java.io.Serializable;

public class OrderProcess implements Serializable {

    private String currency;
    private Double value;

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public Double getValue() {
        return value;
    }
}
