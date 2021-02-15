package com.szzj.design.strategyMode.runBehaviorImpl;

import com.szzj.design.strategyMode.strategyInterface.RunBehavior;

public class FastRun implements RunBehavior {
    @Override
    public void run() {
        System.out.println("快速飞奔");
    }
}
