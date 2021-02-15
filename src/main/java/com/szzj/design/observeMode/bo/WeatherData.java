package com.szzj.design.observeMode.bo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class WeatherData {
    private double temperature;
    private double humidity;
    private double pressure;
}
