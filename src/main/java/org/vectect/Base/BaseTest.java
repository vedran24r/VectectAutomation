package org.vectect.Base;

import java.util.concurrent.Flow;
import java.util.function.Predicate;

public class BaseTest {


    protected static void pause(long millis, String message) throws InterruptedException {
        System.out.println(message);
        Thread.sleep(millis);

    }

}
