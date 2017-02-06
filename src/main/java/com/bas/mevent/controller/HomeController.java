package com.bas.mevent.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bas.mevent.model.HallDtl;
import com.bas.mevent.model.HallImg;

@Controller
public class HomeController {

	@RequestMapping(value="/search", method=RequestMethod.GET)
	public @ResponseBody List<HallDtl> searchHall(HttpServletRequest request, HttpServletResponse response){
		System.out.println("search hall...........");
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
		List<HallDtl> lstDlt = new ArrayList<HallDtl>();
		
		/*HallDtl hdlt = new HallDtl("test0Hall","new function hall", "Langar House" ,"*****", "http://192.168.1.5:9020/my-events-server/getImage");
		HallDtl hdtl = new HallDtl("test1Hall", "test function hall", "Langar House", "*****", "http://192.168.1.5:9020/my-events-server/getImage");
		HallDtl hdtl2 = new HallDtl("test2Hall", "test2 function hall", "Langar House", "*****", "http://192.168.1.5:9020/my-events-server/getImage");
		HallDtl hdtl3 = new HallDtl("test3Hall","test3 function hall", "Langar House", "*****", "http://192.168.1.5:9020/my-events-server/getImage");
		HallDtl hdtl4 = new HallDtl("test4Hall","test5 ew function hall", "Langar House", "*****", "http://192.168.1.5:9020/my-events-server/getImage");
		HallDtl hdtl6 = new HallDtl("test5Hall", "test4 function hall", "Langar House", "*****", "http://192.168.1.5:9020/my-events-server/getImage");
		*/
		HallDtl hdlt = new HallDtl("test0Hall","new function hall", "Langar House" ,"*****", "http://183.83.130.149:9020/my-events-server/getImage");
		HallDtl hdtl = new HallDtl("test1Hall", "test function hall", "Langar House", "*****", "http://183.83.130.149:9020/my-events-server/getImage");
		HallDtl hdtl2 = new HallDtl("test2Hall", "test2 function hall", "Langar House", "*****", "http://183.83.130.149:9020/my-events-server/getImage");
		HallDtl hdtl3 = new HallDtl("test3Hall","test3 function hall", "Langar House", "*****", "http://183.83.130.149:9020/my-events-server/getImage");
		HallDtl hdtl4 = new HallDtl("test4Hall","test5 ew function hall", "Langar House", "*****", "http://183.83.130.149:9020/my-events-server/getImage");
		HallDtl hdtl6 = new HallDtl("test5Hall", "test4 function hall", "Langar House", "*****", "http://183.83.130.149:9020/my-events-server/getImage");
	
		/*HallDtl hdlt = new HallDtl("test0Hall","new function hall", "Langar House" ,"*****", "http://localhost:9020/my-events-server/getImage");
		HallDtl hdtl = new HallDtl("test1Hall", "test function hall", "Langar House", "*****", "http://localhost:9020/my-events-server/getImage");
		HallDtl hdtl2 = new HallDtl("test2Hall", "test2 function hall", "Langar House", "*****", "http://localhost:9020/my-events-server/getImage");
		HallDtl hdtl3 = new HallDtl("test3Hall","test3 function hall", "Langar House", "*****", "http://localhost:9020/my-events-server/getImage");
		HallDtl hdtl4 = new HallDtl("test4Hall","test5 ew function hall", "Langar House", "*****", "http://localhost:9020/my-events-server/getImage");
		HallDtl hdtl6 = new HallDtl("test5Hall", "test4 function hall", "Langar House", "*****", "http://localhost:9020/my-events-server/getImage");
*/
		
		lstDlt.add(hdlt);
		lstDlt.add(hdtl);
		lstDlt.add(hdtl2);
		lstDlt.add(hdtl4);
		lstDlt.add(hdtl3);
		lstDlt.add(hdtl6);
		
		return lstDlt;
	}
	
	@RequestMapping(value="/getImage", method=RequestMethod.GET)
	public @ResponseBody byte[] getImages(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
		System.out.println("get image..............");
		//Fi''le fnew=new File("resources/images.jpeg");
		BufferedImage originalImage=ImageIO.read(getClass().getResourceAsStream("/images.jpeg"));
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		ImageIO.write(originalImage, "jpg", baos );
		byte[] imageInByte=baos.toByteArray();
		
	    return imageInByte;

	}
	
	@RequestMapping(value="/buildUrl/{hallName}", method=RequestMethod.GET)
	public @ResponseBody HallImg  getImgUrl(@PathVariable String hallName,  HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
		System.out.println("get image.............."+hallName);
		
		HallImg hallImg = new HallImg();
		List<String> imgs = new ArrayList<String>(); 
		for(int i=1; i<=2; i++){
			//String path = "http://localhost:9020/my-events-server/getImage/"+hallName+"/"+i;
			//String path = "http://192.168.1.5:9020/my-events-server/getImage/"+hallName+"/"+i;
			String path = "http://183.83.130.149:9020/my-events-server/getImage/"+hallName+"/"+i;
			imgs.add(path);
		}
		
		hallImg.setImgUrls(imgs);
		//Fi''le fnew=new File("resources/images.jpeg");
		String path = "/"+hallName;
				//Gson gson = new Gson(); 
	    //return "{\"imgUrl\":\"http://192.168.1.8:9020/my-events-server/getImage"+path+"\"}";
	    //return "{\"imgUrl\":\"http://183.83.167.51:9020/my-events-server/getImage"+path+"\"}";
		//return "{\"imgUrl\":\"http://localhost:9020/my-events-server/getImage"+path+"\"}";
		return hallImg;

	}
	
	@RequestMapping(value="/getImage/{hallName}/{id}", method=RequestMethod.GET)
	public @ResponseBody byte[] getHallImages(@PathVariable String hallName, @PathVariable String id, HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
		System.out.println("get image.............."+hallName);
		//Fi''le fnew=new File("resources/images.jpeg");
		String path = "/"+hallName+"/images"+id+".jpeg";
		BufferedImage originalImage=ImageIO.read(getClass().getResourceAsStream(path));
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		ImageIO.write(originalImage, "jpg", baos );
		byte[] imageInByte=baos.toByteArray();
		
	    return imageInByte;

	}
}
