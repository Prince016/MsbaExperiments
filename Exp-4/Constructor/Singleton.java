package Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Singleton {
public static void main(String[] args) {
	ApplicationContext  context = new ClassPathXmlApplicationContext("spring.xml");
	System.out.println("---  Bean factory called ---");
	TennisCoach coachobj1=(TennisCoach)context.getBean("tcoach2");
	TennisCoach coachobj2=(TennisCoach)context.getBean("tcoach2");
	
	coachobj1.setName("prashant");
	coachobj2.setName("hello");

//	System.out.println(coachobj1.getName());
//	System.out.println(coachobj2.getName());
	coachobj1.bestcoach();
	
	((ClassPathXmlApplicationContext)context).close();
	coachobj1.bestcoach();

//	TennisCoach coachobj3 =(TennisCoach)context.getBean("tcoach2");
//	coachobj3.bestcoach();
	
	
	
	
}
}
