package com.stang.game.dao;

import java.util.List;
import java.util.Map;

import com.stang.game.entity.detail.RoleTavernDetail;

public interface IRoleTavernDao extends IEntityDao<RoleTavernDetail> {
	public List<RoleTavernDetail> findAllRoleTavern();
	public boolean insertRoleTavern(Map<String, Object> param);

	public boolean updateRoleTavern(Map<String, Object> param);
	public boolean insertRoleTavern(RoleTavernDetail model);

	public boolean updateRoleTavern(RoleTavernDetail model);

	public List<RoleTavernDetail> getRoleTavern(int roleId);
	
}
