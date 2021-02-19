package com.szzj.design.observeMode.interfaceBo;

import com.szzj.design.observeMode.bo.WeatherDataBo;

public interface Observer {
    public void update(WeatherDataBo weatherDataBo);
}
