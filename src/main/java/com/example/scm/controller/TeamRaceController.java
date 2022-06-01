package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.TeamRace;
import com.example.scm.service.TeamRaceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 参赛表(TeamRace)表控制层
 *
 * @author makejava
 * @since 2022-05-30 19:46:44
 */
@RestController
@RequestMapping("teamRace")
public class TeamRaceController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TeamRaceService teamRaceService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param teamRace 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<TeamRace> page, TeamRace teamRace) {
        return success(this.teamRaceService.page(page, new QueryWrapper<>(teamRace)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.teamRaceService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param teamRace 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody TeamRace teamRace) {
        return success(this.teamRaceService.save(teamRace));
    }

    /**
     * 修改数据
     *
     * @param teamRace 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody TeamRace teamRace) {
        return success(this.teamRaceService.updateById(teamRace));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.teamRaceService.removeByIds(idList));
    }
}
