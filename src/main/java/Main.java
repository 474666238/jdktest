import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);
        ctx.getBean(UserService.class);

    }


}
