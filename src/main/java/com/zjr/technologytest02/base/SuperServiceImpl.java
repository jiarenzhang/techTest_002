package com.zjr.technologytest02.base;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

public class SuperServiceImpl<T> extends ServiceImpl<BaseMapper<T>, T> implements SuperService<T> {

}

