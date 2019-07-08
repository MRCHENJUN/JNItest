//
// Created by 62368 on 2019/7/4.
//
#include <jni.h>
#include <string.h>
jstring Java_jni_com_cj_constom_jnitest_JNITest_getName(JNIEnv *env,jclass type){
 return (*env)->NewStringUTF(env, "Hello from JNI !");
}