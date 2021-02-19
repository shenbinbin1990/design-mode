package com.szzj.design;

import com.szzj.design.observeMode.bo.*;

public class ObserveModeTest {
    public static void main(String[] args){
        //创建发布者
        WeatherSubject weatherSubject = new WeatherSubject();
        //创建一系列待订阅者
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherSubject);
        ForestDisplay forestDisplay = new ForestDisplay(weatherSubject);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherSubject);
        //先尝试发布
        weatherSubject.setWeatherDataBo(WeatherDataBo.builder().humidity(18).pressure(1000).temperature(31).build());
        weatherSubject.notifyObservers();
        //当前气候取消订阅
        currentConditionDisplay.getSubject().logout(currentConditionDisplay);
        System.out.println("当前气候取消订阅");
        //再次发布
        weatherSubject.setWeatherDataBo(WeatherDataBo.builder().humidity(15).pressure(888).temperature(-5).build());
        weatherSubject.notifyObservers();
    //测试 1
        //远端测试1
    }
}
