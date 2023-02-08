package com.KarlexYan.mapper;

import com.KarlexYan.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    // 查找所有品牌
    public List<Brand> selectAll();

    // 根据id查找品牌所有信息
    public Brand selectById(int id);

    /*
     * 条件查询
     *   * 参数接收
     *       1. 散装参数：如果方法中有多个参数，需要使用 @Param("SQL参数占位符名称")
     *       2. 对象参数：对象的属性名称要和参数占位符名称一致
     *       3. map集合： SQL中的参数名和map集合的键的名称一致
     * */
    public List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);

    public List<Brand> selectByCondition(Brand brand);

    public List<Brand> selectByCondition(Map map);

    public List<Brand> selectByConditionSingle(Brand brand);

    // 添加
    public void add(Brand brand);

    // 修改
    public int update(Brand brand);

    // 删除
    public void deleteById(int id);

    // 批量删除，传入的是id数组ids
    public void deleteByIds(@Param("ids") int[] ids);
}
