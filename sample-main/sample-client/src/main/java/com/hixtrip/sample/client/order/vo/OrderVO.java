package com.hixtrip.sample.client.order.vo;

/**
 * @Author Type92
 * @Date 2025/4/3
 */

import lombok.Builder;
import lombok.Data;

/**
 * 返回值示例
 */
@Data
@Builder
public class OrderVO {
    private Integer code;
    private String message;
    private Object data;
}
