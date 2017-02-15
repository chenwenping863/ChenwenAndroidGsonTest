package com.example.chenwenping.chenwenandroidgsontest.entity;

import java.util.List;

/**
 * Created by chenwenping on 17/2/15.
 */

public class DetailEntity {
    private DataEntity data;
    private List<ErrEntity> err;
    private int state;

    public int getState() {
        return this.state;
    }

    public List<ErrEntity> getErr() {
        return this.err;
    }

    public DataEntity getData() {
        return this.data;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setErr(List<ErrEntity> err) {
        this.err = err;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

}
