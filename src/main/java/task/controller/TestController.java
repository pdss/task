package task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import task.service.AsyncService;

/**
 * @author luotao
 * @date 2018/11/6-22:24
 */
@RestController
public class TestController {
    @Autowired
    private AsyncService asyncService;
    @GetMapping("/hello")
    public String test(){
        asyncService.test();
        return "hello";
    }
}
