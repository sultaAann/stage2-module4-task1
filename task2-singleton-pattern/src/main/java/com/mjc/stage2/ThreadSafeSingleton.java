package com.mjc.stage2;

public class ThreadSafeSingleton {
    private final ThreadSafeSingleton THREADSAFESINGLETON = new ThreadSafeSingleton();

    private ThreadSafeSingleton() {
    }

    public ThreadSafeSingleton getInstance() {
        return THREADSAFESINGLETON;
    }
}
