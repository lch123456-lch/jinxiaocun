package com.springboot.demo.service;

import java.util.List;

import com.springboot.demo.bean.Tnum;
import com.springboot.demo.bean.Ttool;
import com.springboot.demo.dao.TnumMapper;
import com.springboot.demo.dao.TtoolMapper;
import org.springframework.stereotype.Service;

import com.springboot.demo.util.ExcelReaderUtil;

import javax.annotation.Resource;

@Service
public class FileService {

	@Resource
	private TnumMapper tnumMapper;
	@Resource
	private TtoolMapper ttoolMapper;

	public FileService() {
		// TODO Auto-generated constructor stub
	}

	public void uploadFile(String path) {
		List<List<String>> lists = ExcelReaderUtil.readExcel(path);
		for (List<String> list : lists) {
			Ttool ttool = new Ttool();
			ttool.setCode(list.get(0));
			ttool.setName(list.get(1));
			ttool.setUnitbase(list.get(2));
			ttool.setUnitprice(Integer.parseInt(list.get(3)));
			ttool.setItemtype(list.get(5));
			//将ttool插入物料表

			ttoolMapper.insertTool(ttool);
			//获取刚插入的物料id
			int id=ttoolMapper.selectIdByName(ttool.getName());
			Tnum tnum = new Tnum();
			tnum.setToolId(id);
			tnum.setNumber(Integer.parseInt(list.get(4)));
			//最后将tnum插入到库存料
			tnumMapper.insert(tnum);
		}

		System.out.println(lists);
	}

}
