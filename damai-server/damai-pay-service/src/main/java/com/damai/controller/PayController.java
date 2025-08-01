package com.damai.controller;

import com.damai.common.ApiResponse;
import com.damai.dto.NotifyDto;
import com.damai.dto.PayBillDto;
import com.damai.dto.PayDto;
import com.damai.dto.RefundDto;
import com.damai.dto.TradeCheckDto;
import com.damai.service.PayService;
import com.damai.vo.NotifyVo;
import com.damai.vo.PayBillVo;
import com.damai.vo.TradeCheckVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: 抢票 
 * @description: 支付 控制层
 * @author: newmax
 **/
@RestController
@RequestMapping("/pay")
@Tag(name = "pay", description = "支付")
public class PayController {
    
    @Autowired
    private PayService payService;
    
    @Operation(summary  = "支付")
    @PostMapping(value = "/common/pay")
    public ApiResponse<String> commonPay(@Valid @RequestBody PayDto payDto) {
        return ApiResponse.ok(payService.commonPay(payDto));
    }
    
    @Operation(summary  = "支付后回到通知")
    @PostMapping(value = "/notify")
    public ApiResponse<NotifyVo> notify(@Valid @RequestBody NotifyDto notifyDto) {
        return ApiResponse.ok(payService.notify(notifyDto));
    }
    
    @Operation(summary  = "支付状态查询")
    @PostMapping(value = "/trade/check")
    public ApiResponse<TradeCheckVo> tradeCheck(@Valid @RequestBody TradeCheckDto tradeCheckDto) {
        return ApiResponse.ok(payService.tradeCheck(tradeCheckDto));
    }
    
    @Operation(summary  = "退款")
    @PostMapping(value = "/refund")
    public ApiResponse<String> refund(@Valid @RequestBody RefundDto refundDto) {
        return ApiResponse.ok(payService.refund(refundDto));
    }
    
    @Operation(summary  = "账单详情查询")
    @PostMapping(value = "/detail")
    public ApiResponse<PayBillVo> detail(@Valid @RequestBody PayBillDto payBillDto) {
        return ApiResponse.ok(payService.detail(payBillDto));
    }
}
