package jni.com.cj.constom.jnitest;

public class JNITest {
    static {
        System.loadLibrary("mgjnitest");
    }

    public static native String getName();
}