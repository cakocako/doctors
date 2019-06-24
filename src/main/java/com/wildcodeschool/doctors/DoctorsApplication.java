package com.wildcodeschool.doctors;

import javax.swing.SwingContainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DoctorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorsApplication.class, args);
	}

	@RequestMapping("/doctor/1")
    @ResponseBody
    public String index4() {
        return "William Hartnell";
    }
    @RequestMapping("/doctor/2")
    @ResponseBody
    public String index3() {
        return "Patrick Troughton";
    }
    @RequestMapping("/doctor/3")
    @ResponseBody
    public String index5() {
        return "Jon Pertwee";
    }
    @RequestMapping("/doctor/4")
    @ResponseBody
    public String index7() {
        return "Tom Backer";
	}
	@RequestMapping("/")
	@ResponseBody
	public String index(){
		return "<ul><li><a href='doctor/1'>1</a></li>" +
		"<li><a href='doctor/2'>2</a></li>" +
		"<li><a href='doctor/3'>3</a></li>" +
		"<li><a href='doctor/4'>4</a></li></ul>";
	}
}
