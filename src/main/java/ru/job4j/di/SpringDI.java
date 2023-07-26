package ru.job4j.di;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        System.out.println("store");
        Store store = context.getBean(Store.class);
        store.add("Petr Arsentev");
        store.getAll().forEach(System.out::println);
        System.out.println("another");
        Store another = context.getBean(Store.class);
        another.getAll().forEach(System.out::println);
    }
}