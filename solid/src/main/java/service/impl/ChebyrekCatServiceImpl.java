package service.impl;

import service.CatService;

public class ChebyrekCatServiceImpl implements CatService {
    @Override
    public void eating() {
        System.out.println("кот Чебурек ест");
    }
}
