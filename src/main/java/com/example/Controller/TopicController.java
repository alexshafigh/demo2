package com.example.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics") 
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("Spring " , " Spring framework " , "spring framework description"),
                new Topic("JAVA " , " JAVA CORE " , "JAVA description"),
                new Topic("JAVASCRIPT " , " JS " , "JAVA script description")
        );
    }
}
