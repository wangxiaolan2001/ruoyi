package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 菜单权限对象 ahnu_dd_record
 * 
 * @author ruoyi
 * @date 2022-05-19
 */
public class AhnuDdRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 菜单ID */
    private Long ddRecordId;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String ddStudentName;

    /** 时长 */
    @Excel(name = "时长")
    private Long recordDoration;

    /** 状态（0正常 1暂停） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=暂停")
    private String status;

    public void setDdRecordId(Long ddRecordId) 
    {
        this.ddRecordId = ddRecordId;
    }

    public Long getDdRecordId() 
    {
        return ddRecordId;
    }
    public void setDdStudentName(String ddStudentName) 
    {
        this.ddStudentName = ddStudentName;
    }

    public String getDdStudentName() 
    {
        return ddStudentName;
    }
    public void setRecordDoration(Long recordDoration) 
    {
        this.recordDoration = recordDoration;
    }

    public Long getRecordDoration() 
    {
        return recordDoration;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ddRecordId", getDdRecordId())
            .append("ddStudentName", getDdStudentName())
            .append("recordDoration", getRecordDoration())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
