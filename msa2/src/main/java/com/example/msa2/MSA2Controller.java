package com.example.msa2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * @author InSeok <kr.chis@gmail.com>
 * Date : 2019-06-11
 * Time : 14:22
 * Remark :
 */
@RestController
public class MSA2Controller {

    private Logger log = LoggerFactory.getLogger(MSA2Controller.class);

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("external/coffees")
    public String delay(){//@RequestHeader(value="X-B3-TraceId") String traceId){
        try {
            Thread.sleep(10);
            log.info("딜레이오류발생");
            return restTemplate.getForObject("http://localhost:8083/internal/coffees",String.class);
        }catch (HttpServerErrorException e){
            return "HttpServerErrorException";
        }catch (InterruptedException e){
            e.printStackTrace();
            return "InterruptedException";
        }




    }
}
