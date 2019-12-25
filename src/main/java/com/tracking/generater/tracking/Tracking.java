// this is auto generated file, never change it by hand
package com.tracking.generater.tracking;

import java.util.Map;
import java.util.HashMap;

public class Tracking {

    protected String name;

    protected Map<String, Object> mParams = new HashMap<>();

    public String getName() {
        return name;
    }

    public Map<String, Object> getParams() {
        return mParams;
    }

    public void track() {
        //作神策tracking
//        TrackingUtil.track(name, mParams);
        mParams.clear();
    }

    public static Login login = new Login();

    /**
     * 埋点事件名: 登录
     * 埋点时机: 点击登录触发
     */
    public static class Login extends Tracking {

        Login() {
            super.name = "Login";
        }

        //属性名: 手机号
        public Login mobile(Object mobile) {
            mParams.put("mobile", mobile);
            return this;
        }

        //属性名: 登录成功或失败
        public Login result(Object result) {
            mParams.put("result", result);
            return this;
        }

    }

    public static void main(String[] args) {
        Tracking.login.mobile("13366668888").result("success").track();
    }
}
