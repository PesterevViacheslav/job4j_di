package ru.job4j.di;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
/**
 * Class Store - Хранилище.
 * Решение задач уровня Middle. Блок 3.5. Spring.
 * Тема : 3.4.1. DI. Внедрение зависимостей
 * @author Viacheslav Pesterev (pesterevvv@gmail.com)
 * @since 18.07.2023
 * @version 1
 */
@Component
public class Store {
    private List<String> data = new ArrayList<String>();

    public void add(String value) {
        data.add(value);
    }

    public List<String> getAll() {
        return data;
    }
}
