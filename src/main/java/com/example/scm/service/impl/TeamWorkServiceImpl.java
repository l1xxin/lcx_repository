package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.TeamWorkDao;
import com.example.scm.entity.TeamWork;
import com.example.scm.service.TeamWorkService;
import org.springframework.stereotype.Service;

/**
 * 团队比赛作品审核表(TeamWork)表服务实现类
 *
 * @author makejava
 * @since 2022-05-30 19:46:48
 */
@Service("teamWorkService")
public class TeamWorkServiceImpl extends ServiceImpl<TeamWorkDao, TeamWork> implements TeamWorkService {

}

