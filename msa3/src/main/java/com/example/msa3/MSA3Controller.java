package com.example.msa3;

import com.oracle.tools.packager.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author InSeok <kr.chis@gmail.com>
 * Date : 2019-06-11
 * Time : 14:19
 * Remark :
 */
@RestController
public class MSA3Controller {

    private Logger log = LoggerFactory.getLogger(MSA3Controller.class);
    @RequestMapping("/internal/coffees")
    public String coffeeList(){//@RequestHeader(value="X-B3-TraceId") String traceId) throws Exception{
//        if(true){
//            throw new Exception("장애발생");
//        }
        log.info("MSA3 Response");
        return "아메리카노, 라떼, 모카 ";
    }

    @RequestMapping("/internal/about")
    public String about(){//@RequestHeader(value="X-B3-TraceId") String traceId) throws Exception{

        return "멋진 커피집입니다. ";
    }
}
