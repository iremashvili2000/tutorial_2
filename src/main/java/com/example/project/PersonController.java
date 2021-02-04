package com.example.project;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    private InvestmentWorker worker=new InvestmentWorker();

    private List<Person> investments=new ArrayList<>();

    public PersonController(){
        investments.add(new Person(100,false,0));
        investments.add(new Person(200,false,0));
        investments.add(new Person(12,false,0));
        investments.add(new Person(4,false,0));
        investments.add(new Person(1,false,0));
        investments.add(new Person(4560,false,0));
    }

    @PostMapping("/profit")

   public ResponseEntity<List<Person>> login(){

        int t=0;

        for(int i=0;i<investments.size() -1;i++){
            if(investments.get(i).getInvestment()>0){
                investments.get(i).setActive(true);
                t=(int)(investments.get(i).getInvestment());
                worker.pay(investments.get(i),t);

            }
        }

    investments=worker.getReceivedProfit();


        return ResponseEntity.ok(investments);


    }



}
