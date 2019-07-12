package com.wwsis.miniblog.controller;

import com.wwsis.miniblog.model.Message;
import com.wwsis.miniblog.model.User;
import com.wwsis.miniblog.service.MiniblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/miniblog")
public class MiniblogController {

    @Qualifier("MiniblogService")
    @Autowired
    private MiniblogService miniblogService;

    @RequestMapping(value = "/profile",method = RequestMethod.GET)
    public String listUserPosts(Model model){
        Message message = new Message();
        User user = miniblogService.getUser("daniel");
        List<Message> userMessages = miniblogService.getUserMessages(user);

        model.addAttribute("usermessages",userMessages);
        model.addAttribute("message",message);
        model.addAttribute("user",user);

        return "profile";
    }

    @RequestMapping(value = "/addPost",method = RequestMethod.POST)
    public String addPost(@ModelAttribute("message") Message message){

        miniblogService.addMessage(message);
        System.out.println("log z controllera: dodawanie posta");

        return "redirect:/miniblog/profile";
    }

}
