# job4j_accidents
Приложение "DI. dependency injection".

## Описание проекта
Идея DI.
Есть хранилище объектов. В нем регистрируются классы, объекты которых хотим иметь в проекте.
Хранилище в рамках DI называется Context, то есть объекты относящиеся к предметной области нашего проекта.
После регистрации классов, Context начинает инициализацию объектов. Он строит дерево зависимостей.
Сначала он создает объекты без зависимостей, а потом создает объекты с зависимостями.
После инициализации программист может получить нужный объект из Context.

## Стек технологий
- Java 17
- Hibernate 5.5.3
- PostgreSQL 14
- Maven 3.8
- Spring boot 2.7
- Bootstrap 4.4

## Требования к окружению
- JDK 17
- Maven
- PostgreSQL

## Запуск проекта
- ```git clone git@github.com/PesterevViacheslav/job4j_di.git```
- Postgres. ```create database di;```
- Прописать креды в ```src/main/resources/db.properties```
- ```mvn install```
- перейти по [http://localhost:8080/di]

## Взаимодействие с приложением