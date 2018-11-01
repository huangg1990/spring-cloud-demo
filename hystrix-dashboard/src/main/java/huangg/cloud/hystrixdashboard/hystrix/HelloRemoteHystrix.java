package huangg.cloud.hystrixdashboard.hystrix;


import huangg.cloud.hystrixdashboard.contract.HelloRemote;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "hello" +name+", this messge send failed ";
    }
}
