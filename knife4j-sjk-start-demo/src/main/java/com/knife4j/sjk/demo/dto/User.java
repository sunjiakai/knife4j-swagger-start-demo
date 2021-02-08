package com.knife4j.sjk.demo.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 实体类
 * 用户
 * </p>
 *
 * @author zuihou
 * @since 2020-02-14
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "User", description = "用户")
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 账号
     */
    @ApiModelProperty(value = "账号")
    private String account;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String name;

    /**
     * 是否内置
     */
    @ApiModelProperty(value = "是否内置")
    private Boolean readonly;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 手机
     */
    @ApiModelProperty(value = "手机")
    private String mobile;

    /**
     * 状态
     * 1启用 0禁用
     */
    @ApiModelProperty(value = "状态")
    private Boolean status;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    private String avatar;

    /**
     * 工作描述
     * 比如：  市长、管理员、局长等等   用于登陆展示
     */
    @ApiModelProperty(value = "工作描述")
    private String workDescribe;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    @JsonIgnore
    private String password;

    /**
     * 最后登录时间
     */
    @ApiModelProperty(value = "最后登录时间")
    private LocalDateTime lastLoginTime;


    @Builder
    public User(Long id, Long createUser, LocalDateTime createTime
            , Long updateUser, LocalDateTime updateTime
            , String account, String name, Boolean readonly
            , String email
            , String mobile, Boolean status, String avatar
            , String workDescribe, LocalDateTime passwordErrorLastTime
            , Integer passwordErrorNum, LocalDateTime passwordExpireTime
            , String password, LocalDateTime lastLoginTime) {
        this.account = account;
        this.name = name;
        this.readonly = readonly;
        this.email = email;
        this.status = status;
        this.avatar = avatar;
        this.workDescribe = workDescribe;
        this.password = password;
        this.lastLoginTime = lastLoginTime;
    }
}
