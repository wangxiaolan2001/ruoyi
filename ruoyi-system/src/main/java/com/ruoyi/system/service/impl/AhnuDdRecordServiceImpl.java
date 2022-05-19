package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AhnuDdRecordMapper;
import com.ruoyi.system.domain.AhnuDdRecord;
import com.ruoyi.system.service.IAhnuDdRecordService;

/**
 * 菜单权限Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-05-19
 */
@Service
public class AhnuDdRecordServiceImpl implements IAhnuDdRecordService 
{
    @Autowired
    private AhnuDdRecordMapper ahnuDdRecordMapper;

    /**
     * 查询菜单权限
     * 
     * @param ddRecordId 菜单权限主键
     * @return 菜单权限
     */
    @Override
    public AhnuDdRecord selectAhnuDdRecordByDdRecordId(Long ddRecordId)
    {
        return ahnuDdRecordMapper.selectAhnuDdRecordByDdRecordId(ddRecordId);
    }

    /**
     * 查询菜单权限列表
     * 
     * @param ahnuDdRecord 菜单权限
     * @return 菜单权限
     */
    @Override
    public List<AhnuDdRecord> selectAhnuDdRecordList(AhnuDdRecord ahnuDdRecord)
    {
        return ahnuDdRecordMapper.selectAhnuDdRecordList(ahnuDdRecord);
    }

    /**
     * 新增菜单权限
     * 
     * @param ahnuDdRecord 菜单权限
     * @return 结果
     */
    @Override
    public int insertAhnuDdRecord(AhnuDdRecord ahnuDdRecord)
    {
        ahnuDdRecord.setCreateTime(DateUtils.getNowDate());
        return ahnuDdRecordMapper.insertAhnuDdRecord(ahnuDdRecord);
    }

    /**
     * 修改菜单权限
     * 
     * @param ahnuDdRecord 菜单权限
     * @return 结果
     */
    @Override
    public int updateAhnuDdRecord(AhnuDdRecord ahnuDdRecord)
    {
        ahnuDdRecord.setUpdateTime(DateUtils.getNowDate());
        return ahnuDdRecordMapper.updateAhnuDdRecord(ahnuDdRecord);
    }

    /**
     * 批量删除菜单权限
     * 
     * @param ddRecordIds 需要删除的菜单权限主键
     * @return 结果
     */
    @Override
    public int deleteAhnuDdRecordByDdRecordIds(Long[] ddRecordIds)
    {
        return ahnuDdRecordMapper.deleteAhnuDdRecordByDdRecordIds(ddRecordIds);
    }

    /**
     * 删除菜单权限信息
     * 
     * @param ddRecordId 菜单权限主键
     * @return 结果
     */
    @Override
    public int deleteAhnuDdRecordByDdRecordId(Long ddRecordId)
    {
        return ahnuDdRecordMapper.deleteAhnuDdRecordByDdRecordId(ddRecordId);
    }
}
