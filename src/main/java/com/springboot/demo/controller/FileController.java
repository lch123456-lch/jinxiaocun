package com.springboot.demo.controller;

import java.io.*;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.service.FileService;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/toolimport")
public class FileController {

	public FileController() {
		// TODO Auto-generated constructor stub
	}

	@Resource
	private FileService fileService;

	@RequestMapping("/import")
	public String upload(MultipartFile file, HttpServletRequest request) throws IOException {
		File imageFolder= new File(request.getServletContext().getRealPath("xls"));
		String s = file.getOriginalFilename();
		File excel = new File(imageFolder,s);
		file.transferTo(excel);
		String path = request.getServletContext().getRealPath("xls/")+s;
		fileService.uploadFile(path);
		excel.delete();
		return "导入成功";
	}

}
