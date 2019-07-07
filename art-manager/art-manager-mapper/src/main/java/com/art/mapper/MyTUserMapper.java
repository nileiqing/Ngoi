package com.art.mapper;

public interface MyTUserMapper {
    /**
     * 于立波
     * 根据用户名查出用户ID
     * @param username
     * @return
     */
    Long selectIdByUsername(String username);

}