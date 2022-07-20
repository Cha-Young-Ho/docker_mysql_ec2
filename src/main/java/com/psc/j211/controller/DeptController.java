package com.psc.j211.controller;

import com.psc.j211.domain.Dept;
import com.psc.j211.domain.DeptRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
@AllArgsConstructor
public class DeptController {

    private final DeptRepository deptRepository;

    @RequestMapping("/")
    public String index(Model model){
        log.debug("controller call 테스트");

        Optional<Dept> optionalDept = deptRepository.findById(3);

        if(optionalDept.isPresent()){
            model.addAttribute("dept", optionalDept.get());


        }

        return "index";
    }
}
