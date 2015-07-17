import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bean.BoardService;
import com.bean.EchoBean;


public class EchoBeanTest {
	public static void main(String[] args) {
		
		//classpath:com/bean/echo.xml
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/bean/echo.xml",
				"echo2.xml");
//		//방법1.
//		EchoBean bean = (EchoBean) ctx.getBean("echo");
//		System.out.println(bean.sayEcho("good"));
//		//방법2.
//		EchoBean bean2 =ctx.getBean(EchoBean.class);
//		System.out.println(bean2.sayEcho("dsdf2"));
		
		//방법3.
		EchoBean bean3 = ctx.getBean("echo3",EchoBean.class);
		EchoBean bean4 = ctx.getBean("echo",EchoBean.class);
		EchoBean bean5 = ctx.getBean("echo",EchoBean.class);
		System.out.println(bean3.sayEcho("dsdf"));
		System.out.println(bean3.getName()+ bean3.getNum());
		System.out.println(bean3==bean4);
		System.out.println("aa");
		System.out.println(bean5==bean4);
		BoardService ser = ctx.getBean("service",BoardService.class);
		System.out.println(ser.getData());
		
	}

}
