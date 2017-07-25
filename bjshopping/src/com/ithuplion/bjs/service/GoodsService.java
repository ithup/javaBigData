package com.ithuplion.bjs.service;
/**
 * ҵ���
 * ��Ʒ��Ϣ��
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
	 * ������Ʒid��ѯ��Ʒ��Ϣ
	 * @param goodId
	 * @return
	 * @throws Exception 
	 */
	public Goods findGoodsById(int goodId) throws Exception {
		return goodsDao.selectGoodsById(goodId);
	}
}
