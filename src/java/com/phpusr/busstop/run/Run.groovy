package com.phpusr.busstop.run

import com.phpusr.busstop.frame.BusStopFrame
import com.phpusr.busstop.frame.ControlFrame

import javax.swing.*

/**
 * Created with IntelliJ IDEA.
 * User: phpusr
 * Date: 13.01.13
 * Time: 15:04
 * To change this template use File | Settings | File Templates.
 */

/**
 * Запускающий программу класс
 */
class Run {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel('com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel');
            //UIManager.setLookAndFeel(UIManager.systemLookAndFeelClassName);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        ControlFrame controlFrame = new ControlFrame('Bus Stop Simulation Control')
        BusStopFrame busStopFrame = new BusStopFrame('Bus Stop Simulation', controlFrame)
        busStopFrame.go()
    }
}


