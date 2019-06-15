package cn.shuwei.mapper;

import cn.shuwei.pojo.TbOrderShipping;
import cn.shuwei.pojo.TbOrderShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderShippingMapper {
    int countByExample(TbOrderShippingExample example);

    int deleteByExample(TbOrderShippingExample example);

    int insert(TbOrderShipping record);

    int insertSelective(TbOrderShipping record);

    List<TbOrderShipping> selectByExample(TbOrderShippingExample example);

    int updateByExampleSelective(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    int updateByExample(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);
}