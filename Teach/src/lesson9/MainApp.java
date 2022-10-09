package lesson9;

import java.lang.*;
import java.lang.reflect.Method;

public class MainApp {
    public static void main(String[] args) throws Exception {
        Class testClass = TestClass.class;
        Method[] methods = testClass.getDeclaredMethods();
        for (Method o:
             methods) {
            if(o.isAnnotationPresent(myAnno.class)){
                o.invoke(null);
            }
        }
    }
}
