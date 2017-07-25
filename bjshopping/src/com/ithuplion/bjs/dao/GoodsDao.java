package com.ithuplion.bjs.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.ithuplion.bjs.domain.Goods;
import com.ithuplion.bjs.tools.JDBCUtils;

/**
 * ���ݲ�
 * @author acer
 *
 */
public class GoodsDao {
	private QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
	/**
	 * ��ѯ��Ʒ��Ϣ
	 * @return
	 * @throws Exception 
	 */
	public List<Goods> selectAllGoods() throws Exception {
		String sql="select * from goods";
		return qr.query(sql, new BeanListHandler<>(Goods.class));
	}
	/**
	 * ������Ʒid��ѯ��Ʒ��Ϣ
	 * @param goodId
	 * @return
	 * @throws Exception 
	 */
	public Goods selectGoodsById(int goodId) throws Exception {
		String sql="select * from goods where id=?";
		Object[] params={goodId};
		return qr.query(sql, new BeanHandler<>(Goods.class),params);
	}

}
