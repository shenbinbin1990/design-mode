package com.szzj.design.strategyMode;

import com.szzj.design.strategyMode.bo.Animal;
import com.szzj.design.strategyMode.bo.Snail;
import com.szzj.design.strategyMode.bo.Tiger;

import java.util.ArrayList;
import java.util.List;

public class StrategyModeTest {
    public static void main(String[] args){
        List<Animal> animalList = new ArrayList<>();
        Animal tiger = new Tiger();
        Animal snail = new Snail();
        animalList.add(tiger);
        animalList.add(snail);
        animalList.stream().forEach(animal -> {
            System.out.print(animal.getName());
            animal.run();
        });
    
    }
}
