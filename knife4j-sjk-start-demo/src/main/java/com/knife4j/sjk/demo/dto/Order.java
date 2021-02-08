package com.knife4j.sjk.demo.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 实体类
 * 订单(用于测试)
 * </p>
 *
 * @author zuihou
 * @since 2020-06-19
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "Order", description = "订单(用于测试)")
@AllArgsConstructor
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;


    @Builder
    public Order(Long id, LocalDateTime createTime
            , Long createUser, LocalDateTime updateTime, Long updateUser,
                 String name, String code) {

        this.name = name;
    }

}
