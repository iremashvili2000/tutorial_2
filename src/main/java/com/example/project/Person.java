package com.example.project;

public class Person {
    public int getInvestment() {
        return investment;
    }

    public void setInvestment(int investment) {
        this.investment = investment;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getReceivedShare() {
        return receivedShare;
    }

    public void setReceivedShare(int receivedShare) {
        this.receivedShare = receivedShare;
    }

    private int investment;
    private boolean active=false;
    private int receivedShare=0;
    public Person pay(int amount){
        this.receivedShare+= amount;
        return this;
    }

    public Person(int investment, boolean active, int receivedShare) {
        this.investment = investment;
        this.active = active;
        this.receivedShare = receivedShare;
    }
}
