package com.inadang.controller;

import com.inadang.domain.OptGroup;
import com.inadang.service.OptionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("option")
@RequiredArgsConstructor // 생성자 주입 어노테이션
@Log4j
public class OptionController {

    private final OptionService optionService;

    @PostMapping("insert")
    @ResponseBody
    public void insertOptGroups(@RequestBody List<OptGroup> optGroups) {
        optionService.insertGroup(optGroups);
    }

}
