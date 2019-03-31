package cn.goktech.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.goktech.mapper.MenuMapper;
import cn.goktech.pojo.Menu;
import cn.goktech.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
	@Resource
	private MenuMapper menuMapper;
	
	@Override
	public List<Menu> show() {
		return menuMapper.selByPid(0);
	}

}
