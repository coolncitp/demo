package org.ydesign.demo.example;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import org.springframework.stereotype.Component;
import org.ydesign.demo.utils.PiUtil;

/**
 * @Project demo
 * @Package org.ydesign.demo.example
 * @Date 2020/1/13 18:16
 * @Author reny
 */
@Component
public class ControlGpioExample {

    final GpioController gpio = PiUtil.getGioController();
    final GpioPinDigitalOutput pin = PiUtil.getGpio1();

    public String changeGpioState(Integer state) {
        System.out.println("<--Pi4J--> GPIO Control Example ... started.");

        //设置项目关闭时引脚的状态
        pin.setShutdownOptions(true, PinState.LOW);
        if(state == 0){
            pin.low();
            System.out.println("--> GPIO 状态变为：OFF");
        }else{
            pin.high();
            System.out.println("--> GPIO 状态变为：ON");
        }
        if(pin.isHigh()){
            return "开启";
        }
        return "关闭";
    }
}
