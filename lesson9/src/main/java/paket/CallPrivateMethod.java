package paket;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CallPrivateMethod {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Refector refector = new Refector();
        Class clazz = Refector.class;

        Method method = clazz.getDeclaredMethod("methodPrivate", java.lang.String.class, int.class);
        method.setAccessible(true);
        method.invoke(refector, "Lol", 15);
    }
}
