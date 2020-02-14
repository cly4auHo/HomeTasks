package paket;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectMain {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class clazz = paket.Refector.class;
        Field[] fields = clazz.getFields();
        Method[] methods = clazz.getMethods();
        Annotation[] annotations = clazz.getAnnotations();
        Annotation[] annotationsMethods;

        //System.out.println(fields[0].getType().getSimpleName());
        // System.out.println(Arrays.toString(clazz.getMethods()));
        //field.getAnnotations(AnnoTest.class).name());
        clazz.getConstructors()[0].getAnnotations();
        clazz.getConstructors();

        String[] arrayFiledTypes = new String[fields.length];
        String[] arrayFieldNames = new String[fields.length];
        String[] arrayMethods = new String[methods.length];
        String[] arrayAnnotationsClass = new String[annotations.length];
        String[] arrayAnnotationsMethods = new String[annotations.length];
        String[] arrayAnnotationsFields = new String[annotations.length];

        for (int i = 0; i < fields.length; i++) {
            arrayFieldNames[i] = fields[i].getName();
            arrayFiledTypes[i] = fields[i].getType().getSimpleName();
            System.out.println("Name " + arrayFieldNames[i] + " type " + arrayFiledTypes[i]);
        }

        for (int i = 0; i < methods.length; i++) {
            arrayMethods[i] = methods[i].getName();

            if (methods[i].getAnnotations().length > 0) {
                //System.out.println(methods[i].getAnnotations());
            }
            //System.out.println("methods " + arrayMethods[i]);
        }

        try {
            Method method = clazz.getMethod("methodPublic");
            method.invoke(new Refector());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < annotations.length; i++) {
            arrayAnnotationsClass[i] = annotations[i].annotationType().getName();
            System.out.println("annotations " + arrayAnnotationsClass[i]);
        }

        System.out.println("Annotation" + Arrays.toString(annotations));
    }
}
