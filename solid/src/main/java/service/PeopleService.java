package service;

public interface PeopleService extends CallService, CleanService, BruteForceService {
    @Override
    void cruelty();

    @Override
    void call();

    @Override
    void clean();

    void pourSomeWater();
    void putSomeFood();
}
