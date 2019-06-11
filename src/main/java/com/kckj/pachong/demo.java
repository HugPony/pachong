package com.kckj.pachong;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) throws Exception{

        //获取到网页元素 可通过Jsoup api进行操作
        Element element = Jsoup.connect("https://www.baidu.com").get();

    }

}
