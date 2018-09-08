package com.moxi.mogublog.admin.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moxi.mogublog.xo.entity.Admin;
import com.moxi.mogublog.xo.service.AdminService;

/**
 * <p>
 * 管理员表 前端控制器
 * </p>
 *
 * @author xuzhixiang
 * @since 2018-09-04
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("/getList")
	public String getList() {
		
		List<Admin> list = adminService.list(new QueryWrapper<Admin>().eq("username", "admin"));
		String str = list.toString(); 
		return str;
	}
}
