package com.phpusr.busstop.entity

import com.phpusr.busstop.consts.BusStopConsts

import javax.imageio.ImageIO
import java.awt.image.BufferedImage

/**
 * Created with IntelliJ IDEA.
 * User: phpusr
 * Date: 12.01.13
 * Time: 19:21
 * To change this template use File | Settings | File Templates.
 */

/**
 * Автобус
 */
class Bus {
    /** Порядковый № */
    int number
    /** Название */
    String name
    /** Маршрут */
    String route
    /** Кол-во мест */
    int seatCount
    /** Изображение автобуса */
    BufferedImage image

    /** Кол-во Пассажиров (внутри) */
    int passengerCount
    /** Кол-во зашедших и вышедших Пассажиров (для Статистики) */
    int passengerCountIn, passengerCountOut

    Bus(int number, String name, String route, int seatCount, String pathToImage) {
        this.number = number
        this.name = name
        this.route = route
        this.seatCount = seatCount
        setImage(pathToImage)
    }

    Bus() {
        this(1, 'Test', '777', 10, "$BusStopConsts.BUS_IMG_PATH/Pacan.png")
    }

    void setImage(String path) {
        URL url = Bus.class.getResource(path)
        image = ImageIO.read(url)
    }

    /** Возвращает Длину изображения Автобуса */
    int getWidth() {
        image.width
    }

    /** Возвращает Высоту изображения Автобуса */
    int getHeight() {
        image.height
    }

    /** Добавить пассажира в автобус */
    boolean addPassenger() {
        if (passengerCount < seatCount) {
            passengerCount++
            passengerCountIn++

            if (BusStopConsts.busLog) println "\t$this"
            return true
        } else {
            if (BusStopConsts.busLog) println ">>В автобусе: $name-$route больше нет места!"
            return false
        }
    }

    /** Удалить пассажира из Автобуса */
    boolean delPassenger() {
        if (passengerCount > 0) {
            passengerCount--
            passengerCountOut++

            if (BusStopConsts.busLog) println "\t$this"
            return true
        } else {
            if (BusStopConsts.busLog) println ">>В автобусе: $name-$route больше нет пассажиров!"
            return false
        }
    }

    /** Возвращает кол-во Свободных мест в Автобусе */
    int getFreeSeat() {
        return seatCount - passengerCount
    }

    @Override
    String toString() {
        return "Автобус: $name-$route, Пассажиров: $passengerCount/$seatCount, Всего зашло: $passengerCountIn, Всего вышло: $passengerCountOut"
    }
}
