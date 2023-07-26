package ru.job4j.di;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * Class StartUI - Запуск приложения.
 * Решение задач уровня Middle. Блок 3.5. Spring.
 * Тема : 3.4.1. DI. Внедрение зависимостей
 * @author Viacheslav Pesterev (pesterevvv@gmail.com)
 * @since 18.07.2023
 * @version 1
 */
@Component
@Scope("prototype")
public class StartUI {
    @Autowired
    private Store store;
    @Autowired
    private ConsoleInput consoleInput;

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}