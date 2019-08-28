package com.ift.api.manager.mapper;

import com.ift.api.manager.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户信息 Mapper 接口
 * </p>
 *
 * @author ift
 * @since 2019-08-27
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
