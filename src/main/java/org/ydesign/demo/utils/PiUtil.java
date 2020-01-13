package org.ydesign.demo.utils;

import com.pi4j.io.gpio.*;

/**
 * 树莓派GPIO工具类
 * @Project demo
 * @Package org.ydesign.demo.utils
 * @Date 2020/1/13 18:11
 * @Author reny
 */
public class PiUtil {

    //创建GPIO控制器
    private static final GpioController gpio = GpioFactory.getInstance();
    private static final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "LED", PinState.HIGH);

    public static GpioController getGioController () {
        return gpio;
    }

    public static GpioPinDigitalOutput getGpio1 () {
        return pin;
    }

}
