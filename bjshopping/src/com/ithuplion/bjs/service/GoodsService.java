package com.ithuplion.bjs.service;
/**
 * 业务层
 * 商品信息类
 */
import java.util.List;

import com.ithuplion.bjs.dao.GoodsDao;
import com.ithuplion.bjs.domain.Goods;

public class GoodsService {
	private GoodsDao goodsDao=new GoodsDao();
	public List<Goods> findAllGoods() throws Exception {
		return goodsDao.selectAllGoods();
	}
	/**
	 * 根据商品id查询商品信息
	 * @param goodId
	 * @return
	 * @throws Exception 
	 */
	public Goods findGoodsById(int goodId) throws Exception {
		return goodsDao.selectGoodsById(goodId);
	}
}
