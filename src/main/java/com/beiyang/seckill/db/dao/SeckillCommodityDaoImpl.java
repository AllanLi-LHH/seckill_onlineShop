package com.beiyang.seckill.db.dao;

import com.beiyang.seckill.db.mappers.SeckillCommodityMapper;
import com.beiyang.seckill.db.po.SeckillCommodity;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class SeckillCommodityDaoImpl implements SeckillCommodityDao {

    @Resource
    private SeckillCommodityMapper seckillCommodityMapper;

    @Override
    public SeckillCommodity querySeckillCommodityById(long commodityId) {
        return seckillCommodityMapper.selectByPrimaryKey(commodityId);
    }
}
