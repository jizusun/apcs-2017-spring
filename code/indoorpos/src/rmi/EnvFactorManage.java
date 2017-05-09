package org.hqu.indoor_pos.rmi;

import java.util.List;

import org.hqu.indoor_pos.bean.EnvFactor;

/**
 * created on 2016年8月26日
 *
 * 环境因子管理服务接口
 *
 * @author  megagao
 * @version  0.0.1
 */
public interface EnvFactorManage {

	/**
	 * 查找所有房间的环境因子
	 *
	 * @return  所有房间的环境因子
	 */
	public List<EnvFactor> findAllEnvFactor(); 
	
	/**
	 * 根据房间id查找相应的环境因子
	 *
	 * @param  roomId
	 * @return  相应的环境因子
	 */
	public EnvFactor findEnvFactorByRoomId(Integer roomId); 
	
	/**
	 * 保存环境因子
	 *
	 * @param  envFactor
	 * @return  是否成功
	 */
	public boolean saveEnvFactor(EnvFactor envFactor);
	
	/**
	 * 修改环境因子
	 *
	 * @param  envFactor
	 * @return  是否成功
	 */
	public boolean updateEnvFactor(EnvFactor envFactor);
	
	/**
	 * 删除环境因子
	 *
	 * @param  roomId
	 * @return  是否成功
	 */
	public boolean deleteEnvFactor(Integer roomId);
	
}
