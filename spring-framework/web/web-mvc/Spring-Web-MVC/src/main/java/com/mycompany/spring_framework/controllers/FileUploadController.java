/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author colin
 *
 */
@Controller
public class FileUploadController {

	@RequestMapping(value = "/uploadSingleFile", method=RequestMethod.GET)
	public String displayUploadFilePage() {
		return "upload";
	}
	
	@RequestMapping(value = "/uploadMultipleFile", method=RequestMethod.GET)
	public String displayUploadMultipleFilesPage() {
		return "uploadMultiple";
	}
	
	/**
	 * 
	 * @param name
	 * @param file
	 * @return
	 */
	@RequestMapping(value = "/upload", method=RequestMethod.POST)
	@ResponseBody
	public String uploadFile(@RequestParam("name") String name, @RequestParam("file") MultipartFile file) {
		
		if(!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "tmpFiles");
				if(!dir.exists()) {
					dir.mkdirs();
				}
				
				File serverFile = new File(dir.getAbsolutePath() + File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				
				return "Successfully uploaded file = " + name;
			}
			catch(Exception e) {
				return "Failed to upload " + name + " => " + e.getMessage();
			}
		}
		
		return "Failed to upload " + name + " because the file was empty.";
	}
	
	@RequestMapping(value = "/uploadMultiple", method=RequestMethod.POST)
	@ResponseBody
	public String uploadMultipleFile(@RequestParam("name") String[] names, @RequestParam("file") MultipartFile[] files) {
		
		if(files.length != names.length) {
			return "Mandatory information missing";
		}
		
		String message = "";
		for(int i = 0; i < files.length; i++) {
			MultipartFile file = files[i];
			
			try{
				byte[] bytes = file.getBytes();
				
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "tmpFiles");
				if(!dir.exists()) {
					dir.mkdirs();
				}
				
				File serverFile = new File(dir.getAbsolutePath() + File.separator + names[i]);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				
				message = message + "You successfully uploaded file = " + names[i] + "<br />";
			
			}
			catch(Exception e) {
				return "You failed to upload " + names[i] + " => " + e.getMessage();
			}
				
		}
		
		return message;
	}
}
