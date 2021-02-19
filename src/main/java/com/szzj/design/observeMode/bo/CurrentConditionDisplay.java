package com.szzj.design.observeMode.bo;

import com.szzj.design.observeMode.interfaceBo.Display;
import com.szzj.design.observeMode.interfaceBo.Observer;
import com.szzj.design.observeMode.interfaceBo.Subject;
import lombok.Data;

@Data
public class CurrentConditionDisplay implements Observer, Display {
    private WeatherDataBo weatherDataBo;
    private Subject subject;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }
    @Override
    public void display() {
        System.out.println("当前天气:"+weatherDataBo.toString());
    }

    @Override
    public void update(WeatherDataBo weatherDataBo) {
        this.weatherDataBo = weatherDataBo;
        display();
    }
}
