package com.szzj.design.observeMode.bo;

import com.szzj.design.observeMode.interfaceBo.Display;
import com.szzj.design.observeMode.interfaceBo.Observer;
import com.szzj.design.observeMode.interfaceBo.Subject;
import lombok.Data;

@Data
public class StatisticsDisplay implements Display, Observer {
    private WeatherDataBo weatherDataBo;
    private Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }
    @Override
    public void display() {
        System.out.println("温度统计:"+weatherDataBo.getTemperature());
    }

    @Override
    public void update(WeatherDataBo weatherDataBo) {
        this.weatherDataBo = weatherDataBo;
        display();
    }
}
