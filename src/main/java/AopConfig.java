import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @description：
 * @auther: 赖东
 * @time: 2020/11/20
 */
@Configuration
@Import({UserServiceImp2.class,UserServiceImpl.class})
public class AopConfig {

    @Bean
    public MyMethodInterceptor myMethodInterceptor() {
        return new MyMethodInterceptor();
    }



    @Bean
    public BeanNameAutoProxyCreator beanNameAutoProxyCreator() {
        BeanNameAutoProxyCreator creator = new BeanNameAutoProxyCreator();
        creator.setBeanNames("userSer*");
        creator.setInterceptorNames("myMethodInterceptor");
        creator.setExposeProxy(true);
        creator.setProxyTargetClass(true);
        return creator;
    }
}
