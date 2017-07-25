package com.ithuplion.bjs.controller;

import java.util.List;

import com.ithuplion.bjs.domain.Goods;
import com.ithuplion.bjs.service.GoodsService;

/**
 * ��Ʒ��Ϣ��
 * @author acer
 *
 */
public class GoodsController {
	private GoodsService goodsService=new GoodsService();
	/**
	 * ��ѯ��Ʒ��Ϣ��
	 * @return
	 * @throws Exception 
	 */
	public List<Goods> findAllGoods() throws Exception {
		return goodsService.findAllGoods();
	}
	/**
	 * ������ƷID��ѯ��Ʒ��Ϣ
	 * @param goodId
	 * @return
	 * @throws Exception 
	 */
	public Goods findGoodsById(int goodId) throws Exception {
		return goodsService.findGoodsById(goodId);
	}

}
