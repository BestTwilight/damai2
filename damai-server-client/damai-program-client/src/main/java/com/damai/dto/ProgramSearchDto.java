package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @program: 抢票
 * @description: 节目搜索 dto
 * @author: newmax
 **/
@Data
@Schema(title="ProgramSearchDto", description ="节目搜索")
public class ProgramSearchDto extends ProgramPageListDto{
    
    @Schema(name ="content", type ="String", description ="搜索内容")
    private String content;
}
