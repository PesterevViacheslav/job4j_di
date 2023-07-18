package ru.job4j.di;
/**
 * Class StartUI - Запуск приложения.
 * Решение задач уровня Middle. Блок 3.5. Spring.
 * Тема : 3.4.1. DI. Внедрение зависимостей
 * @author Viacheslav Pesterev (pesterevvv@gmail.com)
 * @since 18.07.2023
 * @version 1
 */
public class StartUI {

    private Store store;
    private ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}