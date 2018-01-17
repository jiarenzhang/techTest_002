package com.zjr.technologytest02.base;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

public class SuperEntity<T extends Model> extends Model<T> {

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
