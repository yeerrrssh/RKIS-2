package ru.cinema;

/**
 * Класс работника кинотеатра
 */
public class CinemaWorker {
    /**
     * Объект для управления показом фильма
     */
    private final ScreenController controller;

    /**
     * Создаёт работника кинотеатра
     */
    public CinemaWorker(ScreenController controller){
        this.controller = controller;
    }

    /**
     * Настраивает процеес показа фильма
     */
    public void show() {
        controller.turnOn();
        controller.setVolume(0);
        controller.setVolume(5);
        controller.setVolume(10);
        controller.turnOff();
    }

}
