import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.AopContext;

/**
 * @description：
 * @auther: 赖东
 * @time: 2020/11/20
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println(this.getClass()+"调用方法前");
        Object ret=invocation.proceed();
        System.out.println(AopContext.currentProxy().getClass());
        System.out.println(this.getClass()+"调用方法后");
        return ret;
    }
}