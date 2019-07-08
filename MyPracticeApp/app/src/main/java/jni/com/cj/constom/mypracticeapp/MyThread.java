package jni.com.cj.constom.mypracticeapp;

import android.support.annotation.NonNull;

public class MyThread extends Thread {
    volatile String test;


    public MyThread() {
        super();
    }

    public MyThread(Runnable target) {
        super(target);
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
    }

    public MyThread(@NonNull String name) {
        super(name);
    }

    public MyThread(ThreadGroup group, @NonNull String name) {
        super(group, name);
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
    }

    public MyThread(ThreadGroup group, Runnable target, @NonNull String name) {
        super(group, target, name);
    }

    public MyThread(ThreadGroup group, Runnable target, @NonNull String name, long stackSize) {
        super(group, target, name, stackSize);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void interrupt() {
        super.interrupt();
    }

    @Override
    public boolean isInterrupted() {
        return super.isInterrupted();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public int countStackFrames() {
        return super.countStackFrames();
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public ClassLoader getContextClassLoader() {
        return super.getContextClassLoader();
    }

    @Override


    public void setContextClassLoader(ClassLoader cl) {
        super.setContextClassLoader(cl);
    }

    @NonNull
    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @NonNull
    @Override
    public State getState() {
        return super.getState();
    }

    @Override
    public UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return super.getUncaughtExceptionHandler();
    }

    @Override
    public void setUncaughtExceptionHandler(UncaughtExceptionHandler eh) {
        super.setUncaughtExceptionHandler(eh);
    }
}
