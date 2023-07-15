package singleton;

public class SingletonClass {

    private static SingletonClass instance;

    private SingletonClass() {}

    // double-checked locking
    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }
}
