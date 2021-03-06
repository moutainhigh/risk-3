package com.iflytek.risk.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import com.iflytek.risk.common.BaseEntityBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 诉讼类案件表
 * </p>
 *
 * @author 黄智强
 * @since 2019-12-02
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_fwfx_litigation_cases")
@ApiModel(value="LitigationCases对象", description="诉讼类案件表 ")
public class LitigationCases extends BaseEntityBean {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "流程编号")
    private String flowNo;

    @ApiModelProperty(value = "申请日期")
    private Date applyDate;

    @ApiModelProperty(value = "公司归属")
    private String ascriptionCompany;

    @ApiModelProperty(value = "部门名称")
    private String unitName;

    @ApiModelProperty(value = "申请人")
    private String applicant;

    @ApiModelProperty(value = "对方名称")
    private String targetName;

    @ApiModelProperty(value = "金额")
    private BigDecimal money;

    @ApiModelProperty(value = "案件类型")
    private String caseType;

    @ApiModelProperty(value = "纠纷类型")
    private String disputeType;

    @ApiModelProperty(value = "服务类型")
    private String serviceType;

    @ApiModelProperty(value = "服务人员")
    private String servicePersonal;

    @ApiModelProperty(value = "协作人员")
    private String cooperationPerson;

    @ApiModelProperty(value = "诉求")
    private String appeal;

    @ApiModelProperty(value = "其他诉求补充说明")
    private String otherAppeal;

    @ApiModelProperty(value = "案件简介")
    private String caseBrief;

    @ApiModelProperty(value = "外聘律师")
    private String outsideLawyerFlag;

    @ApiModelProperty(value = "律所名称")
    private String lawFirmName;

    @ApiModelProperty(value = "律师姓名")
    private String lawerName;

    @ApiModelProperty(value = "是否产生费用")
    private String costFlag;

    @ApiModelProperty(value = "费用总额")
    private BigDecimal costAmount;

    @ApiModelProperty(value = "保全费")
    private BigDecimal preservationAmount;

    @ApiModelProperty(value = "代理费")
    private BigDecimal agentAmount;

    @ApiModelProperty(value = "诉讼费")
    private BigDecimal litigationAmount;

    @ApiModelProperty(value = "其他费用")
    private BigDecimal otherAmount;

    @ApiModelProperty(value = "回款/减损金额")
    private BigDecimal derogationAmount;

    @ApiModelProperty(value = "风险等级")
    private String riskGrade;

    @ApiModelProperty(value = "案件状态")
    private String caseStatus;

    @ApiModelProperty(value = "结案方式")
    private String closingMethod;

    @ApiModelProperty(value = "案件小结")
    private String summary;

    @ApiModelProperty(value = "案件复盘")
    private String replay;


}
