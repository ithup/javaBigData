package com.ithuplion.bjs.controller;

import java.util.List;

import com.ithuplion.bjs.domain.Goods;
import com.ithuplion.bjs.service.GoodsService;

/**
 * 商品信息类
 * @author acer
 *
 */
public class GoodsController {
	private GoodsService goodsService=new GoodsService();
	/**
	 * 查询商品信息类
	 * @return
	 * @throws Exception 
	 */
	public List<Goods> findAllGoods() throws Exception {
		return goodsService.findAllGoods();
	}
	/**
	 * 根据商品ID查询商品信息
	 * @param goodId
	 * @return
	 * @throws Exception 
	 */
	public Goods findGoodsById(int goodId) throws Exception {
		return goodsService.findGoodsById(goodId);
	}

}
