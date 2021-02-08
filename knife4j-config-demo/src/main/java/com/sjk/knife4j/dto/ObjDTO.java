package com.sjk.knife4j.dto;

import io.swagger.annotations.ApiModel;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@ApiModel(value = "ObjDTO", description = "测试戏")
public class ObjDTO implements Serializable {
    private List<String> xx;
    private List<Object> yy;

}