package com.ltz.uif.universalinterfacetofraement.uninfrstruct;

import android.text.TextUtils;

import java.util.HashMap;

/**
 * 管理左右的接口
 * Created by 1 on 2017/9/26.
 */
public class FuntionsManager {

    public static FuntionsManager instense;

    public FuntionsManager(){
        mFuntionNpNr = new HashMap<>();
        mFuntionNpWr = new HashMap<>();
        mFuntionWpNr = new HashMap<>();
        mFuntionWpWr = new HashMap<>();
    }

    //单例模式获取唯一对象
    public  static  FuntionsManager getInstense(){
        if(instense == null){
            instense = new FuntionsManager();
        }
        return instense;
    }

    private HashMap<String,FuntionNpNr> mFuntionNpNr ;
    private HashMap<String,FuntionNpWr> mFuntionNpWr ;
    private HashMap<String,FuntionWpNr> mFuntionWpNr ;
    private HashMap<String,FuntionWpWr> mFuntionWpWr ;


    public FuntionsManager addFuntion(FuntionNpNr funtion){
        mFuntionNpNr.put(funtion.mFuntionName,funtion);
        return this;
    }

    public FuntionsManager addFuntion(FuntionNpWr funtion){
        mFuntionNpWr.put(funtion.mFuntionName,funtion);
        return this;
    }

    public FuntionsManager addFuntion(FuntionWpNr funtion){
        mFuntionWpNr.put(funtion.mFuntionName,funtion);
        return this;
    }

    public FuntionsManager addFuntion(FuntionWpWr funtion){
        mFuntionWpWr.put(funtion.mFuntionName,funtion);
        return this;
    }

    public void invokeFuntion(String funtionName){
         if(TextUtils.isEmpty(funtionName)){
             return;
         }

    }


}
