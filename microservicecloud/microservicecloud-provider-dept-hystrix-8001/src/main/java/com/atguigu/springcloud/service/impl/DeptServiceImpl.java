package com.atguigu.springcloud.service.impl;

import java.util.List;
import com.atguigu.springcloud.entities.Dept;
import org.springframework.stereotype.Service;
import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.service.DeptService;
import javax.annotation.Resource;

/**
 * @author Tom
 */
@Service
public class DeptServiceImpl implements DeptService
{
    @Resource
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept)
	{
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		return dao.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		return dao.findAll();
	}

}
