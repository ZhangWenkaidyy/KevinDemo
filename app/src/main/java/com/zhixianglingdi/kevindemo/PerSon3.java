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
 * 修改备注：同步琐式
 */

public class PerSon3 {

    private PerSon3() {
        Log.i("KEVIN-----PERSON2-----", "PerSon2()");

    }

    private static PerSon3 INSTANCE;

   /* public static synchronized PerSon3 getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new PerSon3();

        }
        return INSTANCE;
    }*/

   static int i = 0;
    public static synchronized int getINSTANCE1() {

        return i++;
    }
    static int j = 0;
    public static int getINSTANCE2() {

        return j++;
    }


    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
