package com.zhixianglingdi.kevindemo;

import android.util.Log;

/*** ----------BigGod be here!----------/
 * ***┏┓******┏┓*********
 * *┏━┛┻━━━━━━┛┻━━┓*******
 * *┃             ┃*******
 * *┃     ━━━     ┃*******
 * *┃             ┃*******
 * *┃  ━┳┛   ┗┳━  ┃*******
 * *┃             ┃*******
 * *┃     ━┻━     ┃*******
 * *┃             ┃*******
 * *┗━━━┓     ┏━━━┛*******
 * *****┃     ┃神兽保佑*****
 * *****┃     ┃代码无BUG！***
 * *****┃     ┗━━━━━━━━┓*****
 * *****┃              ┣┓****
 * *****┃              ┏┛****
 * *****┗━┓┓┏━━━━┳┓┏━━━┛*****
 * *******┃┫┫****┃┫┫********
 * *******┗┻┛****┗┻┛*********
 * ━━━━━━神兽出没━━━━━━
 *
 *
 * 项目名称：KevinDemo
 * 类描述：com.zhixianglingdi.kevindemo
 * 创建人：kevin
 * 创建时间：2018/1/8
 * 修改人：kevin
 * 修改时间：
 * 修改备注：
 *
 *
 * 饿汉式
 *
 */

public class PerSon1 {

    public PerSon1() {

        Log.i("KEVIN-----", "PerSon1()");
    }

    private static PerSon1 INSTANCE = new PerSon1();

    public static PerSon1 getINSTANCE() {

        return INSTANCE;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    static {
        Log.i("KEVIN-----", "static");


    }


}
