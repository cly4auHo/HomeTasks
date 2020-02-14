package paket;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CallableThread implements Callable<String> {

    public String call() throws Exception {
        TimeUnit.SECONDS.sleep(3);
        return "Hi";
    }
}
