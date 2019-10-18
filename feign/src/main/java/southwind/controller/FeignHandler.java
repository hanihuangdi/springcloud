package southwind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import southwind.entity.Student;
import southwind.feign.FeignProviderClient;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignHandler {

    @Qualifier("provider")
    @Autowired
    FeignProviderClient feignProviderClient;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable(name="id")Long id){
        return feignProviderClient.findById(id);
  }
}
