package com.szzj.design.observeMode.bo;

import com.szzj.design.observeMode.interfaceBo.Display;
import com.szzj.design.observeMode.interfaceBo.Observer;
import com.szzj.design.observeMode.interfaceBo.Subject;
import lombok.Data;

@Data
public class ForestDisplay  implements Display, Observer {
    private WeatherDataBo weatherDataBo;
    private Subject subject;

    public ForestDisplay(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    @Override
    public void display() {
        System.out.println("天气预报:"+weatherDataBo.toString());
    }

    @Override
    public void update(WeatherDataBo weatherDataBo) {
        this.weatherDataBo = weatherDataBo;
        display();
    }
}
