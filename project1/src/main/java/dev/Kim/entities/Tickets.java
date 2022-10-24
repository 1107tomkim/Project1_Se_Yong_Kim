package dev.Kim.entities;

import java.util.Objects;

public class Tickets {
    private int id;
    private long amount;
    private String descriptions;
    Status status;



    public Tickets(){

    }

    public Tickets(int id, long amount, String descriptions, Status status) {
        this.id = id;
        this.amount = amount;
        this.descriptions = descriptions;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tickets{" +
                "id=" + id +
                ", amount=" + amount +
                ", descriptions='" + descriptions + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tickets)) return false;
        Tickets tickets = (Tickets) o;
        return id == tickets.id && amount == tickets.amount && Objects.equals(descriptions, tickets.descriptions) && status == tickets.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, descriptions, status);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
