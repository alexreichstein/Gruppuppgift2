package Fourth;

public class TestClass {
    @AutoCall
    private void test() {
        System.out.println("Hej Robin");
    }

    @AutoCall
    private void test2() {
        System.out.println("Hejdå Robin");
    }

    private void test3() {
        System.out.println("Detta ska inte Robin se");
    }
}
