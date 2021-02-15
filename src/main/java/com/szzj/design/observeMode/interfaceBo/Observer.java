package com.szzj.design.observeMode.interfaceBo;

import com.szzj.design.observeMode.bo.WeatherData;

public interface Observer {
    public void update(WeatherData weatherData);
}
