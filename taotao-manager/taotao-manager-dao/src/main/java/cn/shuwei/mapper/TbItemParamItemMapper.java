package cn.shuwei.mapper;

import cn.shuwei.pojo.TbItemParamItem;
import cn.shuwei.pojo.TbItemParamItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemParamItemMapper {
    int countByExample(TbItemParamItemExample example);

    int deleteByExample(TbItemParamItemExample example);

    int insert(TbItemParamItem record);

    int insertSelective(TbItemParamItem record);

    List<TbItemParamItem> selectByExampleWithBLOBs(TbItemParamItemExample example);

    List<TbItemParamItem> selectByExample(TbItemParamItemExample example);

    int updateByExampleSelective(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);

    int updateByExampleWithBLOBs(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);

    int updateByExample(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);
}