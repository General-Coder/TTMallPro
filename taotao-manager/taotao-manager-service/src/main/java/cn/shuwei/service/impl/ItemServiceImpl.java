package cn.shuwei.service.impl;

import cn.shuwei.mapper.TbItemMapper;
import cn.shuwei.pojo.TbItem;
import cn.shuwei.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ItemService")
public class ItemServiceImpl implements IItemService {

    @Autowired
    private TbItemMapper itemMapper;

    /**
     * 通过商品id查询商品
     * @param itemId  商品id
     * @return 商品
     */
    @Override
    public TbItem getItemById(long itemId) {
        TbItem item = itemMapper.selectByPrimaryKey(itemId);
        return item;
    }
}
