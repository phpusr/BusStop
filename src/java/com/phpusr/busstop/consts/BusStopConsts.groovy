package com.phpusr.busstop.consts

/**
 * Created with IntelliJ IDEA.
 * User: phpusr
 * Date: 15.01.13
 * Time: 15:50
 * To change this template use File | Settings | File Templates.
 */

/**
 * Константы
 */
class BusStopConsts {
    /* Логирование */
    /** Вкл/Выкл логирование в Bus */
    static final boolean busLog = 0
    /** Вкл/Выкл логирование в BusStopPanel.paint() */
    static final boolean paintLog = 1
    /** Вкл/Выкл логирование Статистики Автобусов */
    static final boolean statBusLog = 0

    /* Локализация */
    public static final String BTN_SPEED_NAME = 'x'
    public static final String BTN_START_NAME = 'Старт'
    public static final String BTN_PAUSE_NAME = 'Пауза'

    /* Числовые константы */
    public static final int MIN_SPEED = 2
    public static final int MAX_SPEED = 32

    /* BusStopPanel */
    /** Ширина окна */
    static final int WIDTH = 600
    /** Высота окна */
    static final int HEIGHT = 600
    /** Y позиция для рисования движения */
    static final int Y_POS = WIDTH / 3
    /** Кол-во увеличения пикселей для показа движения */
    static final int PIXEL_INC = 10
    /** Пауза между кадрами (мс) */
    static final int PAUSE_MILIS = 20

}
