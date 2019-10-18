package southwind.feign;

import org.springframework.stereotype.Component;
import southwind.entity.Student;

import java.util.Collection;
@Component
public class FeignError implements  FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(Long id) {
        return null;
    }
}
