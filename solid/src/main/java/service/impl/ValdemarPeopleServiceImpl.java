package service.impl;

import service.PeopleService;

public class ValdemarPeopleServiceImpl implements PeopleService {
    @Override
    public void cruelty() {
        System.out.println("кот невидит под собой тарелку, Вальдемар потыкать в миску мордой");
    }

    @Override
    public void call() {
        System.out.println("Вальдемар Позвать кота есть пищу людского приготовления");
    }

    @Override
    public void clean() {
        System.out.println("Вальдемар убрать за котом");
    }

    @Override
    public void pourSomeWater() {
        System.out.println("Вальдемар налить воды");
    }

    @Override
    public void putSomeFood() {
        System.out.println("Вальдемар насыпать жрать");
    }
}
