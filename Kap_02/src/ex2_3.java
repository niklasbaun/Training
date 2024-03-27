public class ex2_3 {
    private void method1() {
        System.out.println("Enter method1");
        method2_1();
        method2_2();
        System.out.println("Exit method1");
    }
    private void method2_1() {
        System.out.println("Enter method2_1");
        method2_2();
        System.out.println("Exit method2_1");
    }
    private void method2_2() {
        System.out.println("Enter method2_2");
        method3();
        System.out.println("Exit method2_2");
    }
    private void method3() {
        System.out.println("Enter method3");
        System.out.println("Exit method3");
    }
}

