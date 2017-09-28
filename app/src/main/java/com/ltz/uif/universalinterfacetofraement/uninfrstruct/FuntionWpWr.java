package com.ltz.uif.universalinterfacetofraement.uninfrstruct;

/**
 * 有参数也有返回值
 * Created by 1 on 2017/9/26.
 */
public abstract class FuntionWpWr<Param,Result> extends Funtion{
    public FuntionWpWr(String funtion_nama) {
        super(funtion_nama);
    }

    //没有实现的方法交给需要使用的类
    public abstract Result  funtion(Param data);
}
