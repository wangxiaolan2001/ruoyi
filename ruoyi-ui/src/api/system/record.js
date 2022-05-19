import request from '@/utils/request'

// 查询菜单权限列表
export function listRecord(query) {
  return request({
    url: '/system/record/list',
    method: 'get',
    params: query
  })
}

// 查询菜单权限详细
export function getRecord(ddRecordId) {
  return request({
    url: '/system/record/' + ddRecordId,
    method: 'get'
  })
}

// 新增菜单权限
export function addRecord(data) {
  return request({
    url: '/system/record',
    method: 'post',
    data: data
  })
}

// 修改菜单权限
export function updateRecord(data) {
  return request({
    url: '/system/record',
    method: 'put',
    data: data
  })
}

// 删除菜单权限
export function delRecord(ddRecordId) {
  return request({
    url: '/system/record/' + ddRecordId,
    method: 'delete'
  })
}
