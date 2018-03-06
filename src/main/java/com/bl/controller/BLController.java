package com.bl.controller;

import com.bl.dao.BlDao;
import com.bl.entity.BLEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhanjian@ultrapower.com.cn
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2018/3/6 15:05
 */
@RestController
@RequestMapping(value = "/bl")
public class BLController {

    @Autowired
    private BlDao blDao;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<BLEntity> findAll(){
        return blDao.findAll();
    }

    @RequestMapping(value = "/findByPage", method = RequestMethod.GET)
    public Page<BLEntity> findByPage(int pageNo){
        PageRequest pageRequest = PageRequest.of(pageNo, 2);

        //获取分页内容：blDao.findAll(pageRequest).getContent()
        //获取总条数：blDao.findAll(pageRequest).getTotalElements()
        //获取总页数：blDao.findAll(pageRequest).getTotalPages()

//        Example<BLEntity> blEntity = Example.of();
//        blEntity.setName("3");

        return blDao.findAll(pageRequest);

    }
}
