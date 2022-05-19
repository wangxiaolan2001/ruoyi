package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.AhnuDdRecord;
import com.ruoyi.system.service.IAhnuDdRecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 菜单权限Controller
 * 
 * @author ruoyi
 * @date 2022-05-19
 */
@RestController
@RequestMapping("/system/record")
public class AhnuDdRecordController extends BaseController
{
    @Autowired
    private IAhnuDdRecordService ahnuDdRecordService;

    /**
     * 查询菜单权限列表
     */
    @PreAuthorize("@ss.hasPermi('system:record:list')")
    @GetMapping("/list")
    public TableDataInfo list(AhnuDdRecord ahnuDdRecord)
    {
        startPage();
        List<AhnuDdRecord> list = ahnuDdRecordService.selectAhnuDdRecordList(ahnuDdRecord);
        return getDataTable(list);
    }

    /**
     * 导出菜单权限列表
     */
    @PreAuthorize("@ss.hasPermi('system:record:export')")
    @Log(title = "菜单权限", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AhnuDdRecord ahnuDdRecord)
    {
        List<AhnuDdRecord> list = ahnuDdRecordService.selectAhnuDdRecordList(ahnuDdRecord);
        ExcelUtil<AhnuDdRecord> util = new ExcelUtil<AhnuDdRecord>(AhnuDdRecord.class);
        util.exportExcel(response, list, "菜单权限数据");
    }

    /**
     * 获取菜单权限详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:record:query')")
    @GetMapping(value = "/{ddRecordId}")
    public AjaxResult getInfo(@PathVariable("ddRecordId") Long ddRecordId)
    {
        return AjaxResult.success(ahnuDdRecordService.selectAhnuDdRecordByDdRecordId(ddRecordId));
    }

    /**
     * 新增菜单权限
     */
    @PreAuthorize("@ss.hasPermi('system:record:add')")
    @Log(title = "菜单权限", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AhnuDdRecord ahnuDdRecord)
    {
        return toAjax(ahnuDdRecordService.insertAhnuDdRecord(ahnuDdRecord));
    }

    /**
     * 修改菜单权限
     */
    @PreAuthorize("@ss.hasPermi('system:record:edit')")
    @Log(title = "菜单权限", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AhnuDdRecord ahnuDdRecord)
    {
        return toAjax(ahnuDdRecordService.updateAhnuDdRecord(ahnuDdRecord));
    }

    /**
     * 删除菜单权限
     */
    @PreAuthorize("@ss.hasPermi('system:record:remove')")
    @Log(title = "菜单权限", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ddRecordIds}")
    public AjaxResult remove(@PathVariable Long[] ddRecordIds)
    {
        return toAjax(ahnuDdRecordService.deleteAhnuDdRecordByDdRecordIds(ddRecordIds));
    }
}
