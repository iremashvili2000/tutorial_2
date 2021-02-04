package com.example.project;

import java.util.ArrayList;
import java.util.List;

public class InvestmentWorker {
    List<Person> receivedProfit = new ArrayList<Person>();

    public void pay(Person p,int amount){
        Person pn = p.pay((amount*5)/100);
        receivedProfit.add(pn);
    }


    public List<Person> getReceivedProfit() {
        return this.receivedProfit;
    }

    public void setReceivedProfit(List<Person> receivedProfit) {
        this.receivedProfit = receivedProfit;
    }
}
