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
 */

public class PerSon4 {


    private PerSon4() {

        Log.i("KEVIN------","PerSon4()");

    }

    private static volatile PerSon4 INSTANCE;


    public static PerSon4 getINSTANCE() {
        if (INSTANCE == null) {

            synchronized (PerSon4.class) {
                if (INSTANCE == null) {
                    INSTANCE = new PerSon4();
                }

            }


        }


        return INSTANCE;
    }


    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
