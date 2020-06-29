import config.ObjectFactory;
import service.CatService;
import service.PeopleService;
import service.impl.EgorPeopleServiceImpl;
import service.impl.KekcAdolfovichCatServiceImpl;
import service.impl.ValdemarPeopleServiceImpl;

public class Main {
    public static void main(String[] args) {
        PeopleService peopleService = ObjectFactory.getInstance().createObject(EgorPeopleServiceImpl.class);
        peopleService.call();
        peopleService.pourSomeWater();
        peopleService.putSomeFood();
        peopleService.cruelty();

        CatService cat =  ObjectFactory.getInstance().createObject(KekcAdolfovichCatServiceImpl.class);
        cat.eating();

        peopleService.clean();
    }
}
