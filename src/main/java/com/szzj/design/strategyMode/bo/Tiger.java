package com.szzj.design.strategyMode.bo;

import com.szzj.design.strategyMode.runBehaviorImpl.FastRun;
import com.szzj.design.strategyMode.strategyInterface.RunBehavior;

public class Tiger extends Animal{
    public Tiger() {
        this("大老虎",new FastRun());
    }

    public Tiger(String name, RunBehavior runBehavior) {
        super(name, runBehavior);
    }
}
