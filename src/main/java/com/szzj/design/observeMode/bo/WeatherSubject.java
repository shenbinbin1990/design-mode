package com.szzj.design.observeMode.bo;

import com.szzj.design.observeMode.interfaceBo.Observer;
import com.szzj.design.observeMode.interfaceBo.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {
    @Autowired
    private WeatherData weatherData;
    List<Observer> observerList = new ArrayList<>();
    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void logout(Observer observer) {
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observerList.stream().forEach(observer -> {
            observer.update(weatherData);
        });
    }
}
