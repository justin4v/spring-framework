import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
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
		/*jdk动态代理class输出文件位置*/
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		/*cglib 生成的class文件目录*/
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "");
		ApplicationContext context = new ClassPathXmlApplicationContext("demo-config.xml");
		Student student = (Student) context.getBean("student");
		System.out.println("学生名称是：" + student.getName() + " 年龄是：" + student.getAge());

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("demo-config.xml"));
		Student student1 = (Student) factory.getBean("student");
		System.out.println("学生名称是：" + student1.getName() + " 年龄是：" + student1.getAge());
	}
}
