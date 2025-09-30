package com.example.xss.XSS.Controller;

import com.example.xss.XSS.entity.Comment;
import com.example.xss.XSS.repository.CommentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommentController {

    private final CommentRepository commentRepository;

    public CommentController(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }

    @GetMapping("/")
    public String ListComments(@RequestParam(required = false) String search, Model model){
        model.addAttribute("comments", commentRepository.findAll());

        if(search != null && !search.isEmpty()){
            //검색어를 searchKeyword라는 이름으로 모델에 추가
            model.addAttribute("searchKeyword", search);
        }
        return "index";
    }

    @PostMapping("/add")
    public String addComment(@ModelAttribute Comment comment){
        commentRepository.save(comment);
        return "redirect:/";
    }
}
