package com.example.chenwenping.chenwenandroidgsontest.entity;

import java.util.List;

/**
 * Created by chenwenping on 17/2/15.
 */

public class DetailList {
    public List<Object> mounthDetail;

    public class MounthDetail {
        public String mounth;//本月、7月===
        public List<MounthDetailList> mounthDetailList;
    }

    public class MounthDetailList {
        public String date;
        public String time;
        public String iconUrl;
        public String money;
        public String desc;
        public boolean newFlag;
    }
}
