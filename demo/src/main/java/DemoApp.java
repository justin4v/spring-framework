import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.demo.domain.Student;

/**
 * program: spring
 * description: main
 *
 * @author junjie.fu
 * create: 2021-06-18 09:29
 */
public class DemoApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("demo-config.xml");
		Student student = (Student)context.getBean("student");
		System.out.println("学生名称是：" + student.getName() + " 年龄是：" + student.getAge());
	}
}
