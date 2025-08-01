package com.damai.mybatisplus;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.damai.util.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;
/**
 * @program: 抢票
 * @description: mybatisPlus更新填充
 * @author: newmax
 **/
@Slf4j
public class MybatisPlusMetaObjectHandler implements MetaObjectHandler {
    
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        this.strictInsertFill(metaObject, "createTime", DateUtils::now, Date.class);
        this.strictInsertFill(metaObject, "editTime", DateUtils::now, Date.class);
    }
    
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        this.strictUpdateFill(metaObject, "editTime", DateUtils::now, Date.class);
    }
}