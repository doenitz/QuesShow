package com.example.demo.controller.singleton;

/**
 * @author 尹诚
 * @parm单例模式：非线程安全懒加载
 * @date 2020/9/15 21:05
 */
public class Singleton {
    private static Singleton singleton;
    private Singleton(){}
    public Singleton getInstance(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
}
/**
 * @author 尹诚
 * @parm单例设计模式：线程安全懒加载方式
 * @date 2020/9/15 21:30
 */
class SafeSinleton{
    private static SafeSinleton safeSinleton;
    private SafeSinleton(){}
    public static synchronized SafeSinleton getInstance(){
        if(safeSinleton==null){
            safeSinleton=new SafeSinleton();
        }
        return safeSinleton;
    }
}
/**
 * @author 尹诚
 * @parm单例设计模式：饿加载方式
 * @date 2020/9/15 21:30
 */
class HungrySingleton{
    private static HungrySingleton hungrySingleton=new HungrySingleton();
    private HungrySingleton(){}
    public HungrySingleton getHungrySingleton(){
        return hungrySingleton;
    }
}
/**
 * @author 尹诚
 * @parm单例设计模式：双重校验锁方式
 * @date 2020/9/15 21:33
 */
class SyncSingleton{
    private volatile static SyncSingleton syncSingleton;
    private SyncSingleton(){}
    public static SyncSingleton getSyncSingleton(){
        if(syncSingleton==null){
            synchronized (SyncSingleton.class){
                if(syncSingleton==null){
                    syncSingleton=new SyncSingleton();
                }
            }
        }
        return syncSingleton;
    }
}
