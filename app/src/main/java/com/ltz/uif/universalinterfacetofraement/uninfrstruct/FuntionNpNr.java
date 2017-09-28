package com.ltz.uif.universalinterfacetofraement.uninfrstruct;

/**
 * 无参数也无返回值
 * Created by 1 on 2017/9/26.
 */
public abstract class FuntionNpNr extends  Funtion{

    public FuntionNpNr(String funtion_nama) {
        super(funtion_nama);
    }

    //没有实现的方法交给需要使用的类
    public abstract  void funtion();
}
