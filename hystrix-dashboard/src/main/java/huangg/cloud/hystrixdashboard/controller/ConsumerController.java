package huangg.cloud.hystrixdashboard.controller;


import huangg.cloud.hystrixdashboard.contract.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * http://127.0.0.1:9001/hystrix
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloRemote helloRemote;


    @RequestMapping("/hello/{name}")
    public String hello2(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }

}
