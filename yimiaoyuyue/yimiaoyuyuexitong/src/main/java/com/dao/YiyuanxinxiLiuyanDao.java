package com.dao;

import com.entity.YiyuanxinxiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YiyuanxinxiLiuyanView;

/**
 * 医院留言 Dao 接口
 *
 * @author 
 */
public interface YiyuanxinxiLiuyanDao extends BaseMapper<YiyuanxinxiLiuyanEntity> {

   List<YiyuanxinxiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
