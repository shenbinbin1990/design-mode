package com.szzj.design.strategyMode.bo;

import com.szzj.design.strategyMode.runBehaviorImpl.SlowRun;
import com.szzj.design.strategyMode.strategyInterface.RunBehavior;

public class Snail extends Animal{
    public Snail() {
        this("小蜗牛",new SlowRun());
    }

    public Snail(String name, RunBehavior runBehavior) {
        super(name, runBehavior);
    }
}
