package southwind.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/native")
public class nativeconfighandler {
    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String foo;
    @GetMapping("/find")
    public String find(){
        return foo+"-"+port;
    }
}
