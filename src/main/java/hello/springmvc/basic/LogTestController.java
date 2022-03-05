package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @Slf4j  //밑에 private자동으로 넣어줘
    @RestController //->String이 그대로 반환
public class LogTestController {
    //private final Logger log= LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logerTest(){
        String name = "Spring";

        //log.trace("trace mylog="+name); 사용은 가능하나 but연산이 이루어짐
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);
        //로그를 사용하지 않아도 a+b 계산 로직이 먼저 실행됨, 이런 방식으로 사용하면 X
        log.debug("String concat log=" + name);
        return "ok";

    }
}
