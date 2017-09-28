package com.ltz.uif.universalinterfacetofraement.uninfrstruct;

/**
 * 有返参数没有返回值
 * Created by 1 on 2017/9/26.
 */
public abstract class FuntionWpNr<Param> extends  Funtion{
    public FuntionWpNr(String funtion_nama) {
        super(funtion_nama);
    }

    //没有实现的方法交给需要使用的类
    public  abstract void funtion(Param data);
}
