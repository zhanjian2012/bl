package com.bl.controller;

import com.bl.dao.BlDao;
import com.bl.entity.BLEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhanjian@ultrapower.com.cn
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2018/3/6 15:05
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private BlDao blDao;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<BLEntity> findAll(){
        return blDao.findAll();
    }

    /**
     * 按分页查询
     * @param pageNo
     * @return
     */
    @RequestMapping(value = "/findAllByPage", method = RequestMethod.GET)
    public Page<BLEntity> findAllByPage(int pageNo){
        PageRequest pageRequest = PageRequest.of(pageNo, 2);

        //获取分页内容：blDao.findAll(pageRequest).getContent()
        //获取总条数：blDao.findAll(pageRequest).getTotalElements()
        //获取总页数：blDao.findAll(pageRequest).getTotalPages()
        return blDao.findAll(pageRequest);
    }

    /**
     * 按条件分页查询
     * @param pageNo
     * @return
     */
    @RequestMapping(value = "/findByPage", method = RequestMethod.GET)
    public Page<BLEntity> findByPage(int pageNo){
        PageRequest pageRequest = PageRequest.of(pageNo, 2);

        //获取分页内容：blDao.findAll(pageRequest).getContent()
        //获取总条数：blDao.findAll(pageRequest).getTotalElements()
        //获取总页数：blDao.findAll(pageRequest).getTotalPages()
        BLEntity blEntity = new BLEntity();
        blEntity.setName("3");
        Example<BLEntity> blEntitys = Example.of(blEntity);
        return blDao.findAll(blEntitys, pageRequest);
    }

    /**
     * 新增
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public void add(){
        BLEntity blEntity = new BLEntity();
        blEntity.setName("3");
        blDao.save(blEntity);
    }

    /**
     * 删除
     * @return
     */
    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public void del(String id){
        blDao.deleteById(Long.parseLong(id));
    }

}
