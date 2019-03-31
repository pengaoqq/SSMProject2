package cn.goktech.mapper;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.goktech.pojo.Menu;

public interface MenuMapper {
	List<Menu> selByPid(int pid);
}
