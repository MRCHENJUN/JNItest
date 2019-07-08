LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE    := mgjnitest
LOCAL_SRC_FILES := jni_com_cj_constom_jnitest_JNITest.c
include $(BUILD_SHARED_LIBRARY)