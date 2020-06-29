package service.impl;

import service.PeopleService;

public class EgorPeopleServiceImpl implements PeopleService {
    @Override
    public void cruelty() {
        System.out.println("кот невидит под собой тарелку, Егор потыкать в миску мордой");
    }

    @Override
    public void call() {
        System.out.println("Егор Позвать кота есть пищу людского приготовления");
    }

    @Override
    public void clean() {
        System.out.println("Егор убрать за котом");
    }

    @Override
    public void pourSomeWater() {
        System.out.println("Егор налить воды");
    }

    @Override
    public void putSomeFood() {
        System.out.println("Егор насыпать жрать");
    }
}
