package southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class NativeApplication {
    public static void main(String[] args){
        SpringApplication.run(NativeApplication.class,args);

    }
}
