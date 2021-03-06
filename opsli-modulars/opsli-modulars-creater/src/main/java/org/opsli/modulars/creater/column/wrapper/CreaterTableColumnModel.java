/**
 * Copyright 2020 OPSLI 快速开发平台 https://www.opsli.com
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.opsli.modulars.creater.column.wrapper;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.opsli.api.base.warpper.ApiWrapper;
import org.opsli.common.annotation.validation.ValidationArgs;
import org.opsli.common.annotation.validation.ValidationArgsLenMax;
import org.opsli.common.enums.ValiArgsType;
import org.opsli.plugins.excel.annotation.ExcelInfo;

/**
 * @BelongsProject: opsli-boot
 * @BelongsPackage: org.opsli.modulars.test.entity
 * @Author: Parker
 * @CreateTime: 2020-09-16 17:33
 * @Description: 代码生成器 - 表
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CreaterTableColumnModel extends ApiWrapper {

    /** 归属表ID */
    @ApiModelProperty(value = "归属表ID")
    @ExcelProperty(value = "归属表ID", order = 1)
    @ExcelInfo
    private String tableId;

    /** 字段名称 */
    @ApiModelProperty(value = "字段名称")
    @ExcelProperty(value = "字段名称", order = 2)
    @ExcelInfo
    // 验证器
    @ValidationArgs({ValiArgsType.IS_NOT_NULL, ValiArgsType.IS_GENERAL})
    @ValidationArgsLenMax(100)
    private String fieldName;

    /** 字段类型 */
    @ApiModelProperty(value = "字段类型")
    @ExcelProperty(value = "字段类型", order = 3)
    @ExcelInfo
    // 验证器
    @ValidationArgs({ValiArgsType.IS_NOT_NULL, ValiArgsType.IS_GENERAL})
    @ValidationArgsLenMax(100)
    private String fieldType;

    /** 字段长度 */
    @ApiModelProperty(value = "字段长度")
    @ExcelProperty(value = "字段长度", order = 4)
    @ExcelInfo
    @ValidationArgsLenMax(6)
    private Integer fieldLength;

    /** 字段精度 */
    @ApiModelProperty(value = "字段精度")
    @ExcelProperty(value = "字段精度", order = 5)
    @ExcelInfo
    @ValidationArgsLenMax(6)
    private Integer fieldPrecision;

    /** 字段描述 */
    @ApiModelProperty(value = "字段描述")
    @ExcelProperty(value = "字段描述", order = 6)
    @ExcelInfo
    // 验证器
    @ValidationArgs({ValiArgsType.IS_NOT_NULL})
    @ValidationArgsLenMax(200)
    private String fieldComments;

    /** 是否主键 */
    @ApiModelProperty(value = "是否主键")
    @ExcelProperty(value = "是否主键", order = 7)
    @ExcelInfo(dictType = "no_yes")
    // 验证器
    @ValidationArgsLenMax(1)
    private String izPk;

    /** 是否可为空 */
    @ApiModelProperty(value = "是否可为空")
    @ExcelProperty(value = "是否可为空", order = 8)
    @ExcelInfo(dictType = "no_yes")
    // 验证器
    @ValidationArgsLenMax(1)
    private String izNotNull;

    /** 是否列表显示 */
    @ApiModelProperty(value = "是否列表显示")
    @ExcelProperty(value = "是否列表显示", order = 9)
    @ExcelInfo(dictType = "no_yes")
    // 验证器
    @ValidationArgsLenMax(1)
    private String izShowList;

    /** 是否表单显示 */
    @ApiModelProperty(value = "是否表单显示")
    @ExcelProperty(value = "是否表单显示", order = 10)
    @ExcelInfo(dictType = "no_yes")
    // 验证器
    @ValidationArgsLenMax(1)
    private String izShowForm;

    /** Java字段类型 */
    @ApiModelProperty(value = "Java字段类型")
    @ExcelProperty(value = "Java字段类型", order = 11)
    @ExcelInfo(dictType = "java_type")
    // 验证器
    @ValidationArgs({ValiArgsType.IS_NOT_NULL, ValiArgsType.IS_GENERAL})
    @ValidationArgsLenMax(50)
    private String javaType;

    /** 字段生成方案（文本框、文本域、字典选择） */
    @ApiModelProperty(value = "字段生成方案")
    @ExcelProperty(value = "字段生成方案", order = 12)
    @ExcelInfo(dictType = "show_type")
    // 验证器
    @ValidationArgsLenMax(1)
    private String showType;

    /** 字典类型编号 */
    @ApiModelProperty(value = "字典类型编号")
    @ExcelProperty(value = "字典类型编号", order = 13)
    @ExcelInfo
    // 验证器
    @ValidationArgs({ValiArgsType.IS_GENERAL})
    @ValidationArgsLenMax(100)
    private String dictTypeCode;

    /** 排序（升序） */
    @ApiModelProperty(value = "排序")
    @ExcelProperty(value = "排序", order = 14)
    @ExcelInfo
    // 验证器
    @ValidationArgs({ValiArgsType.IS_NOT_NULL})
    @ValidationArgsLenMax(6)
    private Integer sort;

    /** 验证类别 */
    @ApiModelProperty(value = "验证类别")
    @ExcelProperty(value = "验证类别", order = 15)
    @ExcelInfo
    // 验证器
    @ValidationArgs({ValiArgsType.IS_GENERAL})
    @ValidationArgsLenMax(500)
    private String validateType;

    /** 检索类别 */
    @ApiModelProperty(value = "检索类别")
    @ExcelProperty(value = "检索类别", order = 16)
    @ExcelInfo
    // 验证器
    @ValidationArgs({ValiArgsType.IS_GENERAL})
    @ValidationArgsLenMax(100)
    private String queryType;

}
