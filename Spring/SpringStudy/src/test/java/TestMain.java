import jakarta.annotation.PostConstruct;
import org.book.config.MainConfiguration;
import org.book.service.TestService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = MainConfiguration.class)
public class TestMain {

    @Autowired
    TestService service;

    @Test
    public void test(){
        service.test();
    }
    @PostConstruct
    void init(){
        System.out.println("我被初始化了！");
    }
}