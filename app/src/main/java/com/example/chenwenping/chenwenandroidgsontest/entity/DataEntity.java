package com.example.chenwenping.chenwenandroidgsontest.entity;

import java.util.List;

/**
 * Created by chenwenping on 17/2/15.
 */

public class DataEntity {
    private List<PartnerTeamList> partnerteamlist;
    private List<LiketeamList> liketeamlist;
    private List<Feedbacks> feedbacks;

    public void setPartnerteamlist(List<PartnerTeamList> partnerteamlist) {
        this.partnerteamlist = partnerteamlist;
    }

    public void setLiketeamlist(List<LiketeamList> liketeamlist) {
        this.liketeamlist = liketeamlist;
    }

    public void setFeedbacks(List<Feedbacks> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public List<PartnerTeamList> getPartnerteamlist() {
        return this.partnerteamlist;
    }

    public List<LiketeamList> getLiketeamlist() {
        return this.liketeamlist;
    }

    public List<Feedbacks> getFeedbacks() {
        return this.feedbacks;
    }


    public class Feedbacks {
        private List<Feedback> feedbackList;
        private int totalcount;
        private int totalscore;

        public List<Feedback> getFeedbackList() {
            return this.feedbackList;
        }

        public int getTotalcount() {
            return this.totalcount;
        }

        public int getTotalscore() {
            return this.totalscore;
        }

        public void setFeedbackList(List<Feedback> feedbackList) {
            this.feedbackList = feedbackList;
        }

        public void setTotalcount(int totalcount) {
            this.totalcount = totalcount;
        }

        public void setTotalscore(int totalscore) {
            this.totalscore = totalscore;
        }

    }

    public class Feedback {
        private String comment;
        private String createtime;
        private int score;
        private String username;

        public void setComment(String comment) {
            this.comment = comment;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getComment() {
            return this.comment;
        }

        public String getCreatetime() {
            return this.createtime;
        }

        public int getScore() {
            return this.score;
        }

        public String getUsername() {
            return this.username;
        }
    }

    public class LiketeamList {
        private int lteamId;
        private String ltitle;
        private String limage;
        private int lteamprice;
        private int lmarketprice;

        public void setLteamId(int lteamId) {
            this.lteamId = lteamId;
        }

        public void setLtitle(String ltitle) {
            this.ltitle = ltitle;
        }

        public void setLimage(String limage) {
            this.limage = limage;
        }

        public void setLteamprice(int lteamprice) {
            this.lteamprice = lteamprice;
        }

        public void setLmarketprice(int lmarketprice) {
            this.lmarketprice = lmarketprice;
        }

        public int getLteamId() {
            return this.lteamId;
        }

        public String getLtitle() {
            return this.ltitle;
        }

        public String getLimage() {
            return this.limage;
        }

        public int getLteamprice() {
            return this.lteamprice;
        }

        public int getLmarketprice() {
            return this.lmarketprice;
        }

    }

    public class PartnerTeamList {
        private int pteamId;
        private String ptitle;
        private int pteamprice;

        public int getPteamId() {
            return this.pteamId;
        }

        public String getPtitle() {
            return this.ptitle;
        }

        public int getPteamprice() {
            return this.pteamprice;
        }

        public void setPteamId(int pteamId) {
            this.pteamId = pteamId;
        }

        public void setPtitle(String ptitle) {
            this.ptitle = ptitle;
        }

        public void setPteamprice(int pteamprice) {
            this.pteamprice = pteamprice;
        }
    }

}
