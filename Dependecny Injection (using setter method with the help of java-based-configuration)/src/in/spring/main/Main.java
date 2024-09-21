package in.spring.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.spring.beans.Student;
import in.spring.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext();
		Student st =context.getBean(Student.class);
		st.display();
		
	}

}
