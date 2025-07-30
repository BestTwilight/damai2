package com.damai.initialize.base;

import org.springframework.beans.factory.InitializingBean;

import static com.damai.initialize.constant.InitializeHandlerType.APPLICATION_INITIALIZING_BEAN;

/**
 * @program: 抢票 
 * @description: 用于处理 {@link InitializingBean} 类型 初始化执行 抽象
 * @author: newmax
 **/
public abstract class AbstractApplicationInitializingBeanHandler implements InitializeHandler {
    
    @Override
    public String type() {
        return APPLICATION_INITIALIZING_BEAN;
    }
}
