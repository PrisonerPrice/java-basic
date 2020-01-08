package io.ascending.training.lambda;

import com.google.common.base.Functions;

import java.awt.image.ImagingOpException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalClassExercise {

    public static void main(String[] args) {

        USB usbDevice_1 = new USB();
        USB usbDevice_2 = new USB();
        Channel channel = new Channel();
        usbDevice_2.setChannel_1(channel);

        usbDevice_1.getChannel_1().ifPresent(c -> System.out.println(channel.getSomething()));
        usbDevice_2.getChannel_1().ifPresent(c -> System.out.println(channel.getSomething()));

    }
}
