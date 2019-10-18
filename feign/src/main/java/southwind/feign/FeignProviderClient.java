package southwind.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import southwind.entity.Student;

import java.util.Collection;
@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    Collection<Student> findAll();
    @GetMapping("/student/findById/{id}")
    Student findById(@PathVariable(name="id") Long id);
}
