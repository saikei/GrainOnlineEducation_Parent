package com.grain.ucenter.service.impl;

import com.grain.ucenter.entity.Member;
import com.grain.ucenter.mapper.MemberMapper;
import com.grain.ucenter.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Dragon Wen
 * @since 2020-03-09
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
