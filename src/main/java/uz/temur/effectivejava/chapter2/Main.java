package uz.temur.effectivejava.chapter2;

import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println(valuesOf(false));
        Date d = Date.from(Instant.ofEpochMilli(1L));
        System.out.println(d);
    }

    /**
     * This method translates a boolean primitive value into a Boolean object reference:
     * @return Boolean (true/false)
     */
    public static Boolean valuesOf(boolean b) {
        return b? Boolean.TRUE : Boolean.FALSE;
    }
}
