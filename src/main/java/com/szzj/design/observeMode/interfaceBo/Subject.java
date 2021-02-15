package com.szzj.design.observeMode.interfaceBo;

public interface Subject {
    //注册
    public void register(Observer observer);
    //注销
    public void logout(Observer observer);
    //通知
    public void notifyObservers();
}
