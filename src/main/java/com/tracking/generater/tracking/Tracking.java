package com.tracking.generater.tracking;

import java.util.HashMap;

public class Tracking {

    private String name;

    protected HashMap<String, Object> mParams;

    public void track() {
        //做神策tracking;
        mParams.clear();
    }

    public static AppConcernRoomlistClickTracking appConcernRoomlistClickTracking = new AppConcernRoomlistClickTracking();


    /**
     * App关注列表新房点击
     * 我的关注页，取消关注按钮点击或点编辑后删除
     */
    public static class AppConcernRoomlistClickTracking extends Tracking {
        //关注类型
        public AppConcernRoomlistClickTracking concernType(Object concernType) {
            mParams.put("concernType", concernType);
            return this;
        }
        //小区ID
        public AppConcernRoomlistClickTracking communityId(Object communityId) {
            mParams.put("communityId", communityId);
            return this;
        }
        //订阅ID
        public AppConcernRoomlistClickTracking subscribeId(Object subscribeId) {
            mParams.put("subscribeId", subscribeId);
            return this;
        }
    }

    public static void main(String args[]) {
        Tracking.appConcernRoomlistClickTracking
                .communityId("communityId")
                .concernType("concernType")
                .subscribeId("subscribeId")
                .track();
    }

}
