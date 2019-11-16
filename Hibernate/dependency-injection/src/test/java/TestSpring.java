import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.AtmInterface;
import com.lti.component.Car;
import com.lti.component.TextEditor;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("dependency-config.xml");
		TextEditor ob=(TextEditor)ctx.getBean("text");
		ob.load("JON");
		AtmInterface ai=(AtmInterface)ctx.getBean("atm");
		ai.requestWithdraw(5200.00);
	}

}
