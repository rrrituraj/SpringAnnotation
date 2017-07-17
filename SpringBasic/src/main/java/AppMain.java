import com.rituraj.controller.Application;
import com.rituraj.controller.ApplicationTwo;
import com.rituraj.services.Rectangle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by RITURAJ on 13-06-2017.
 */
public class AppMain {
    public static void main(String[] args) {
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(Application.class, ApplicationTwo.class);
        Rectangle rec=(Rectangle)context.getBean("rectangles") ;
        rec.getShape();
        System.out.println(rec.getSize());
        Rectangle rec1=(Rectangle)context.getBean("setSizeRectangle1") ;
        System.out.println(rec1.getSize());
        context.close();
    }
}
