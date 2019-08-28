package com.ift.api.manager.service.impl;

import com.ift.api.manager.entity.UserRoles;
import com.ift.api.manager.mapper.UserRolesMapper;
import com.ift.api.manager.service.IUserRolesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色关系 服务实现类
 * </p>
 *
 * @author ift
 * @since 2019-08-27
 */
@Service
public class UserRolesServiceImpl extends ServiceImpl<UserRolesMapper, UserRoles> implements IUserRolesService {

}
