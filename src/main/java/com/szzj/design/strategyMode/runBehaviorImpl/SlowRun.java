package com.szzj.design.strategyMode.runBehaviorImpl;

import com.szzj.design.strategyMode.strategyInterface.RunBehavior;

public class SlowRun implements RunBehavior {
    @Override
    public void run() {
        System.out.println("慢慢地爬");
    }
}
