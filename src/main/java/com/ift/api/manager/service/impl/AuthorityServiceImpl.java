package com.ift.api.manager.service.impl;

import com.ift.api.manager.entity.Authority;
import com.ift.api.manager.mapper.AuthorityMapper;
import com.ift.api.manager.service.IAuthorityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author ift
 * @since 2019-08-27
 */
@Service
public class AuthorityServiceImpl extends ServiceImpl<AuthorityMapper, Authority> implements IAuthorityService {

}
