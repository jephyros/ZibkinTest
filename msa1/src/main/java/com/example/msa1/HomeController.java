package com.example.msa1;

import com.oracle.tools.packager.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author InSeok <kr.chis@gmail.com>
 * Date : 2019-06-11
 * Time : 14:33
 * Remark :
 */
@RestController
public class HomeController {

    private Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    HomeService homeService;

    @RequestMapping("/")
    public String home(){

        log.info("MSA1 main call");
        return homeService.coffeeList();
    }

    @RequestMapping("/about")
    public String about(){
        log.info("MSA1 about call");
        return homeService.about();
    }
}
