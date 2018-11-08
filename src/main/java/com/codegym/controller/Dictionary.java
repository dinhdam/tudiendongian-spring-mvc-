package com.codegym.controller;

import com.codegym.converter.DictionaryConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dictionary {
    DictionaryConverter dictionaryConverter = new DictionaryConverter();
    @GetMapping("/")
    public String DictionarySimple(){
        return "index";
    }
    @PostMapping("/translate")
    public String translate(@RequestParam String english, Model model){
        String vietnamese = dictionaryConverter.getvietnamese(english);
        model.addAttribute("vietnamese",vietnamese);
        return "index";

    }

}
