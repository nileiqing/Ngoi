package com.art.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.art.common.pojo.ArtResult;
import com.art.mapper.MyTUserMapper;
import com.art.mapper.TUserMapper;

import com.art.pojo.TUser;
import com.art.pojo.TUserExample;
import com.art.pojo.TUserExample.Criteria;
import com.art.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private TUserMapper userMapper;
	@Autowired
	private MyTUserMapper myUserMapper;
	/**
	 * 根据用户名查询用户信息
	 * @author lb_yu
	 *
	 */
	@Override
	public TUser findUser(String username) {
		// TODO Auto-generated method stub
		if(username!=""&&username!=null){
			TUserExample tUserExample=new TUserExample();
			Criteria  criteria=tUserExample.createCriteria();
			criteria.andUsernameEqualTo(username);
			List<TUser> userList=userMapper.selectByExample(tUserExample);
			if(userList.size()!=0){
				TUser user=userList.get(0);
				return user;
			}
		}
		return null;
	}
	/**
	 * 于立波
	 * 添加人员 
	 * @param user
	 * @return
	 */
	@Override
	public ArtResult addUser(TUser user) {
		// TODO Auto-generated method stub
		java.util.Date now=new java.util.Date();
	    TUserExample tUserExample=new TUserExample();
		Criteria criteria=tUserExample.createCriteria();
		criteria.andUsernameEqualTo(user.getUsername());
		if(userMapper.selectByExample(tUserExample).size()!=0){
			return ArtResult.build(300, "");//代表已存在用户，不允许添加
		}
		else{
			user.setCreated(now);
		    user.setUpdated(now);
		    if(userMapper.insertSelective(user)==1){
				return ArtResult.ok(200);
			}
		}
		return null;
	}
	/**
	 * 于立波
	 * 更新人员
	 * @param user
	 * @return
	 */
	@Override
	public ArtResult updateUser(TUser user) {
		// TODO Auto-generated method stub
		java.util.Date now=new java.util.Date();	
		Long selectId=myUserMapper.selectIdByUsername(user.getUsername());
		if(selectId!=null&&selectId!=user.getId()){
			return ArtResult.build(300, "");
		}
		else{
			user.setUpdated(now);
			if(userMapper.updateByPrimaryKeySelective(user)==1){
				return ArtResult.ok(200);
			}
		}
		return null;
	}
}
