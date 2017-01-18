//
// Created by Anonymous on 2016/12/8.
//

#include<jni.h>
JNIEXPORT jstring JNICALL Java_yzu_money_ndk_MainActivity_go(JNIEnv* env, jobject obj)
{
  return (*env)→NewStringUTF(env,"demo test jni");
}
