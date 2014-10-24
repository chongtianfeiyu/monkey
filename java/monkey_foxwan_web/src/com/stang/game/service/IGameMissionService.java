package com.stang.game.service;

import java.util.List;
import java.util.Map;

import com.stang.game.entity.detail.GameMissionDetail;

public interface IGameMissionService extends IBaseService<GameMissionDetail>{
	public List<GameMissionDetail> getGameMission();
	public List<GameMissionDetail> findAllMission(Map<String,Object> param);
	public List<GameMissionDetail> findGameMissionByid(int id);
	public boolean insertGameMission(GameMissionDetail model);
	public boolean updateGameMission(Map<String, Object> param);
}
