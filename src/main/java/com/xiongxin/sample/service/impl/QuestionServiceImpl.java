package com.xiongxin.sample.service.impl;

import com.xiongxin.sample.domain.DO.Question;
import com.xiongxin.sample.dao.QuestionMapper;
import com.xiongxin.sample.service.IQuestionService;
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
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements IQuestionService {

}
