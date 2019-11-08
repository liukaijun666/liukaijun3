package com.itheima.service;

import com.itheima.entity.PageResult;
import com.itheima.pojo.CheckGroup;
import com.itheima.pojo.Setmeal;

import java.util.List;

/**
 * 套餐接口
 * @author wangxin
 * @version 1.0
 */
public interface SetmealService {
    /**
     * 新增套餐
     * @param setmeal
     * @param groupIds
     */
    void add(Setmeal setmeal, Integer[] groupIds);
    /**
     * 套餐分页
     *
     * @return
     */
    PageResult findPage(Integer pageSize, Integer currentPage, String queryString);

    /**
     * 移动端-查询所有套餐列表
     * @return
     */
    List<Setmeal> getSetmeal();

    /**
     * 套餐详情页面数据展示(套餐 检查组 检查项数据)
     * @param id
     * @return
     */
    Setmeal findById(Integer id);
}
