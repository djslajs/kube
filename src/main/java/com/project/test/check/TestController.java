package com.project.test.check;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @ResponseBody
    @GetMapping("/api/hello")
    public String test() {
        return "테스트 입니다.";
    }
}
