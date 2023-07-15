package singleton;

public enum SingletonEnum {

    INSTANCE;

    private int a = 0;

    public void doSomething() {
        System.out.println("a = " + a++);
    }

    public static void main(String[] args) {
        SingletonEnum.INSTANCE.doSomething();
        SingletonEnum.INSTANCE.doSomething();
        SingletonEnum.INSTANCE.doSomething();
        SingletonEnum.INSTANCE.doSomething();
    }
}
