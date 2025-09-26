package com.example.xss.XSS.Controller;

import com.example.xss.XSS.entity.Comment;
import com.example.xss.XSS.repository.CommentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentController {

    private final CommentRepository commentRepository;

    public CommentController(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }

    @GetMapping("/")
    public String ListComments(Model model){
        model.addAttribute("comments", commentRepository.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String addComment(@ModelAttribute Comment comment){
        commentRepository.save(comment);
        return "redirect:/";
    }
}
