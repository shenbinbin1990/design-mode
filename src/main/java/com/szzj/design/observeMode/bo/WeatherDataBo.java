package com.szzj.design.observeMode.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDataBo {
    private double temperature;
    private double humidity;
    private double pressure;
}
