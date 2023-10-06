package ru.cinema;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Главный класс
 */
public class Main {
    /**
     * Точка входа в программу
     *
     * @param args Аргументы коммандной строки
     */
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CinemaWorker controller = (CinemaWorker) context.getBean("cinemaController");

        controller.show();
    }
}
