package config;

import config.impl.JavaApplicationConfiguration;
import service.PeopleService;
import service.impl.EgorPeopleServiceImpl;
import service.impl.ValdemarPeopleServiceImpl;
import util.ResourceUtil;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {
    private static ObjectFactory instance;
    private ApplicationConfiguration config;

    private ObjectFactory() {
        config = new JavaApplicationConfiguration(
                "solidTEST",
                new HashMap<>(Map.of(PeopleService.class, EgorPeopleServiceImpl.class)));
    }

    public static ObjectFactory getInstance() {
        if (instance == null) {
            instance = new ObjectFactory();
        }
        return instance;
    }

    public <T> T createObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (type.isInterface()) {
            implClass = config.getCurrentImplementation(type);
        }
        T t = null;
        try {
            t = implClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException("невозможно создать класс: " + e.getClass().getName() + " " + ",msg: " + e.getMessage());
        }
        return t;
    }


}
