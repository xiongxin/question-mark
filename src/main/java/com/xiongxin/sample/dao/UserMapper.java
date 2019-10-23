package com.xiongxin.sample.dao;

import com.xiongxin.sample.domain.DO.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lihaodong
 * @since 2019-10-22
 */
@Mapper
@Component
public interface UserMapper extends BaseMapper<User> {

}
