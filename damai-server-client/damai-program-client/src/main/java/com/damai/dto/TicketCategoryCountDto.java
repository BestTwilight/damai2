package com.damai.dto;

import lombok.Data;

/**
 * @program: 抢票
 * @description: 票据数据操作 dto
 * @author: newmax
 **/
@Data
public class TicketCategoryCountDto {
    
    /**
     * 票档id
     * */
    private Long ticketCategoryId;
    
    /**
     * 数量
     * */
    private Long count;
}
