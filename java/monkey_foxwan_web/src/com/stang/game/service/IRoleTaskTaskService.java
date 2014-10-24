package com.stang.game.service;

import java.util.List;
import java.util.Map;

import com.stang.game.entity.detail.RoleTaskTaskDetail;



public interface IRoleTaskTaskService extends IBaseService<RoleTaskTaskDetail>{
   public boolean insertRoleTask0(Map<String, Object> param);
	
	public boolean deleteRoleTaskByTaskId0(Map<String, Object> param);

	public boolean updateRoleTaskState0(Map<String, Object> param);// 任务是否完成

	public List<RoleTaskTaskDetail> findRoleTask0(Map<String, Object> param);

	public List<RoleTaskTaskDetail> findRoleTaskBytype0(Map<String, Object> param);

	public boolean updateRoleTaskProgress(Map<String, Object> param);// 任务进度
	
	public boolean updateRoleTaskNum(Map<String, Object> param);

}
