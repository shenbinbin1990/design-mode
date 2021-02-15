package com.szzj.design.strategyMode.bo;

import com.szzj.design.strategyMode.strategyInterface.RunBehavior;
import lombok.Data;

@Data
public abstract class Animal {
    private String name;
    private RunBehavior runBehavior;

    public Animal() {
    }

    public Animal(String name, RunBehavior runBehavior) {
        this.name = name;
        this.runBehavior = runBehavior;
    }

    public void run(){
        runBehavior.run();
    }
}
