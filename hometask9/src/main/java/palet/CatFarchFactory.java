package palet;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CatFarchFactory {

    private int minPaws = 2;

    public boolean catEater(Cat cat) {
        Class clazz = cat.getClass();
        Method[] methods = cat.getClass().getDeclaredMethods();
        Field[] fields = cat.getClass().getDeclaredFields();

        if (clazz.isAnnotationPresent(Fleable.class)) {
            System.out.println(cat.getName() + " is dead");
            return false;
        }

        for (int i = 0; i < methods.length; i++)
            if (methods[i].getAnnotation(Paw.class) != null && methods[i].getAnnotation(Paw.class).count() <= minPaws) {
                System.out.println(cat.getName() + " is dead");
                return false;
            }

        for (int i = 0; i < fields.length; i++)
            if (!fields[i].getAnnotation(Lucky.class).lucky() && fields[i].getAnnotation(Lucky.class) != null) {
                System.out.println(cat.getName() + " is dead");
                return false;
            }

        System.out.println(cat.getName() + " is leave");
        return true;
    }
}
