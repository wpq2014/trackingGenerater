package test.test;


import test.test1.tracking.Tracking;

public class Test {

    void test() {
        Tracking.appConcernIconClick.
                subscribe_id("1").
                community_id("id").
                concern_type("id").
                track();
    }
}
