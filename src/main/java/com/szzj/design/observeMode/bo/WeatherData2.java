package com.szzj.design.observeMode.bo;

public class WeatherData2 {
    private double temperature;
    private double humidity;
    private double pressure;
    public void measurementChange(){
        ForestDisplay forestDisplay = new ForestDisplay();
        forestDisplay.update(temperature,humidity,pressure);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        statisticsDisplay.update(temperature,humidity,pressure);
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
//        currentConditionDisplay.update(temperature,humidity,pressure);
    }
}
