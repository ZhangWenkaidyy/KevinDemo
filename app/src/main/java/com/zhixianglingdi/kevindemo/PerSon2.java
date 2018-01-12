package com.zhixianglingdi.kevindemo;

import android.app.Activity;
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
 * 修改备注：懒汉式
 */

public class PerSon2 {


    private PerSon2() {
        Log.i("KEVIN-----","PerSon2()");

    }

    private static PerSon2 INSTANCE;

    public static  PerSon2 getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new PerSon2();

        }
        return INSTANCE;
    }

   static String name;
    String activity;

    public String getString() {
        return activity;
    }

    public void setString(String activity) {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
