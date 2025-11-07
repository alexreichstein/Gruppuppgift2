package Fourth;

import java.lang.reflect.Method;

public class AutoCaller {
    public static void callMethods(Object object) {
        Method[] methods = object.getClass().getDeclaredMethods();


            for (Method m : methods) {
                if (m.isAnnotationPresent(AutoCall.class)) {
                    try {
                        m.setAccessible(true);
                        m.invoke(object);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
        }
    }
}
