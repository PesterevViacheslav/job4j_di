package ru.job4j.di;
import org.springframework.stereotype.Component;
import java.util.Scanner;
/**
 * Class ConsoleInput - Ввод из консоли.
 * Решение задач уровня Middle. Блок 3.5. Spring.
 * Тема : 3.4.1. DI. Внедрение зависимостей
 * @author Viacheslav Pesterev (pesterevvv@gmail.com)
 * @since 18.07.2023
 * @version 1
 */
@Component
public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);

    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}