package com.ltz.uif.universalinterfacetofraement.uninfrstruct;

/**
 * 管理左右的接口
 * Created by 1 on 2017/9/26.
 */
public class FuntionsManager {

    public static FuntionsManager instense;

    //单例模式获取唯一对象
    public  static  FuntionsManager getInstense(){
        if(instense == null){
            instense = new FuntionsManager();
        }
        return instense;
    }

    public FuntionsManager(){

    }
}
