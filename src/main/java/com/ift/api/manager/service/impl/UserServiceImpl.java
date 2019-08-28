package com.ift.api.manager.service.impl;

import com.ift.api.manager.entity.User;
import com.ift.api.manager.mapper.UserMapper;
import com.ift.api.manager.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author ift
 * @since 2019-08-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
