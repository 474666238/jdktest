import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @description：
 * @auther: 赖东
 * @time: 2020/12/9
 */
@Component
@Primary
public class UserServiceImp2  implements  UserService{
    @Override
    public void print() {
        System.out.println("just for it 2222");
    }
}
