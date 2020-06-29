import service.CatService;
import service.PeopleService;
import service.impl.KekcAdolfovichCatServiceImpl;
import service.impl.ValdemarPeopleServiceImpl;

public class Main {
    public static void main(String[] args) {
        PeopleService peopleService = new ValdemarPeopleServiceImpl();
        peopleService.call();
        peopleService.pourSomeWater();
        peopleService.putSomeFood();
        peopleService.cruelty();

        CatService cat = new KekcAdolfovichCatServiceImpl();
        cat.eating();

        peopleService.clean();
    }
}
