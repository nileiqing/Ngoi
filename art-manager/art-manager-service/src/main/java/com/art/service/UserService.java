package com.art.service;


import com.art.common.pojo.ArtResult;
import com.art.pojo.TUser;

public interface UserService {
	/**
	 * 根据用户名查询用户信息
	 * @author lb_yu
	 *
	 */
  public TUser findUser(String username);
  /**
   * 于立波
   * 添加人员
   * @param user
   * @return
   */
  public ArtResult addUser(TUser user);
  /**
   * 于立波
   * 更新人员
   * @param user
   * @return
   */
public ArtResult updateUser(TUser user);
}
