package main.java.pattern.singleton;

public class SingletonEeager {

    private int count;
    {
        count++;
    }
    private static final SingletonEeager INSTANCE =
            new SingletonEeager();

    public SingletonEeager(){}

    public static SingletonEeager getInstance(){
        return INSTANCE;
    }
    public int getCount(){
        return count;
    }
}
