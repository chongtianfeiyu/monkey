package com.stang.game.dao;

import java.util.List;
import java.util.Map;

import com.stang.game.entity.detail.GamblingItemDetail;

public interface IGamblingItemDao extends IEntityDao<GamblingItemDetail> {
	public List<GamblingItemDetail> getgambling_item();
	public List<GamblingItemDetail> findAllgambling_item(Map<String,Object> param);
	public List<GamblingItemDetail> findgambling_itemByid(int id);
	public boolean insertgambling_item(GamblingItemDetail model);
	public boolean updateGamblingItemByParam(Map<String, Object> param);
}
