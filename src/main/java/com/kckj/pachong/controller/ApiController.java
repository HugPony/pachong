package com.kckj.pachong.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ApiController {

    @GetMapping("/sexy")
    public Object sexy(){
        List<Map> videoList = new ArrayList<>();
        try {
            Element element = Jsoup.connect("http://www.fuliget.net/player").get().getElementById("videoSelect");
            Elements videos = element.getAllElements();
            for(Element video :videos){
                Map<String,String> videoObject = new HashMap<>();
                String img_url = video.attr("data-pic");
                String video_url = video.attr("value");
                videoObject.put("img_url",img_url);
                videoObject.put("video_url",video_url);
                videoList.add(videoObject);
            }
        }catch (Exception e){
            return "error";
        }
        return videoList;
    }


}
