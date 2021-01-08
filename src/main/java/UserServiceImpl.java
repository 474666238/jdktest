import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @description：
 * @auther: 赖东
 * @time: 2020/11/20
 */
@Component
@Primary
public class UserServiceImpl implements UserService {
    @Override
    public void print() {
        System.out.println("just do it");
    }
}
