package lesson9;

public class TestClass {
    @myAnno
    public static void method1(){
        System.out.println("method 1");
    }

    public static void method2(){
        System.out.println("method 2");
    }
    @myAnno
    public static void method3(){
        System.out.println("method 3");
    }
}
