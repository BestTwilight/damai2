package com.damai.context;

import com.damai.core.ConsumerTask;
import lombok.Data;

/**
 * @program: 抢票
 * @description: 消息主题
 * @author: newmax
 **/
@Data
public class DelayQueuePart {
    
    private final DelayQueueBasePart delayQueueBasePart;
 
    private final ConsumerTask consumerTask;
    
    public DelayQueuePart(DelayQueueBasePart delayQueueBasePart, ConsumerTask consumerTask){
        this.delayQueueBasePart = delayQueueBasePart;
        this.consumerTask = consumerTask;
    }
}
