package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.AhnuDdRecord;

/**
 * 菜单权限Service接口
 * 
 * @author ruoyi
 * @date 2022-05-19
 */
public interface IAhnuDdRecordService 
{
    /**
     * 查询菜单权限
     * 
     * @param ddRecordId 菜单权限主键
     * @return 菜单权限
     */
    public AhnuDdRecord selectAhnuDdRecordByDdRecordId(Long ddRecordId);

    /**
     * 查询菜单权限列表
     * 
     * @param ahnuDdRecord 菜单权限
     * @return 菜单权限集合
     */
    public List<AhnuDdRecord> selectAhnuDdRecordList(AhnuDdRecord ahnuDdRecord);

    /**
     * 新增菜单权限
     * 
     * @param ahnuDdRecord 菜单权限
     * @return 结果
     */
    public int insertAhnuDdRecord(AhnuDdRecord ahnuDdRecord);

    /**
     * 修改菜单权限
     * 
     * @param ahnuDdRecord 菜单权限
     * @return 结果
     */
    public int updateAhnuDdRecord(AhnuDdRecord ahnuDdRecord);

    /**
     * 批量删除菜单权限
     * 
     * @param ddRecordIds 需要删除的菜单权限主键集合
     * @return 结果
     */
    public int deleteAhnuDdRecordByDdRecordIds(Long[] ddRecordIds);

    /**
     * 删除菜单权限信息
     * 
     * @param ddRecordId 菜单权限主键
     * @return 结果
     */
    public int deleteAhnuDdRecordByDdRecordId(Long ddRecordId);
}
