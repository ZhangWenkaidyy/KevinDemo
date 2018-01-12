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

public class PerSon5 {

    private PerSon5(){
        Log.i("KEVIN-----","PerSon5()");
    }

    private static class Holder{
        private static PerSon5 INSTANCE=new PerSon5();

    }


    public static  PerSon5 getInstance(){


        return Holder.INSTANCE;


    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
