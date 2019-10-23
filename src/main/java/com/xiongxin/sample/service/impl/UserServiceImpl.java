package com.xiongxin.sample.service.impl;

import com.xiongxin.sample.domain.DO.User;
import com.xiongxin.sample.dao.UserMapper;
import com.xiongxin.sample.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lihaodong
 * @since 2019-10-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
