package com.stang.game.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.stang.game.common.GameConstants;
import com.stang.game.dao.IRoleInsDao;
import com.stang.game.entity.detail.RoleInsDetail;

public class RoleInsDaoImpl extends EntityDao<RoleInsDetail> implements
IRoleInsDao {

	@Override
	public List<RoleInsDetail> getRoleIns(int roleId) {
		List<RoleInsDetail> list = null;
		try {
			list = sqlMapper.queryForList("getRoleIns", roleId);
		} catch (SQLException e) {
			GameConstants.log.warn("", e);
		}
		return list;
	}

	@Override
	public List<RoleInsDetail> getRoleInsDetail(Map<String, Object> param) {
		List<RoleInsDetail> list = null;
		try {
			list = sqlMapper.queryForList("getRoleInsDetail", param);
		} catch (SQLException e) {
			GameConstants.log.warn("", e);
		}
		return list;
	}

	@Override
	public boolean insertRoleIns(RoleInsDetail detail) {
		boolean isSuccess = false;
		try {
			sqlMapper.startTransaction();
			sqlMapper.insert("insertRoleIns", detail);
			sqlMapper.commitTransaction();
			isSuccess = true;
		} catch (Exception e) {
			GameConstants.log.warn("", e);
		} finally {
			try {
				sqlMapper.endTransaction();
			} catch (SQLException e) {
				GameConstants.log.warn("", e);
			}
		}
		return isSuccess;
	}

	@Override
	public boolean updateIns(Map<String, Object> param) {
		boolean isSuccess = false;
		try {
			sqlMapper.startTransaction();
			sqlMapper.update("updateIns", param);
			sqlMapper.commitTransaction();
			isSuccess = true;
		} catch (Exception e) {
			GameConstants.log.warn("", e);
		} finally {
			try {
				sqlMapper.endTransaction();
			} catch (SQLException e) {
				GameConstants.log.warn("", e);
			}
		}
		return isSuccess;
	}

	@Override
	public boolean insertRoleInsRat(RoleInsDetail detail) {
		boolean isSuccess = false;
		try {
			sqlMapper.startTransaction();
			sqlMapper.insert("insertRoleInsRat", detail);
			sqlMapper.commitTransaction();
			isSuccess = true;
		} catch (Exception e) {
			GameConstants.log.warn("", e);
		} finally {
			try {
				sqlMapper.endTransaction();
			} catch (SQLException e) {
				GameConstants.log.warn("", e);
			}
		}
		return isSuccess;
	}

	@Override
	public List<RoleInsDetail> findAlloleIns() {
		List<RoleInsDetail> list = null;
		try {
			list = sqlMapper.queryForList("findAlloleIns");
		} catch (SQLException e) {
			GameConstants.log.warn("", e);
		}
		return list;
	}

	@Override
	public boolean updateRoleIns(RoleInsDetail detail) {
		boolean isSuccess = false;
		try {
			sqlMapper.startTransaction();
			sqlMapper.insert("updateRoleIns", detail);
			sqlMapper.commitTransaction();
			isSuccess = true;
		} catch (Exception e) {
			GameConstants.log.warn("", e);
		} finally {
			try {
				sqlMapper.endTransaction();
			} catch (SQLException e) {
				GameConstants.log.warn("", e);
			}
		}
		return isSuccess;
	}

}
