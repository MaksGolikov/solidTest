package config;

public interface ApplicationConfiguration {

    <T> Class<? extends T> getCurrentImplementation(Class<T> type);
}
