package mx.gob.queretaro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.gob.queretaro.beans.Department;
import mx.gob.queretaro.beans.Employee;
import mx.gob.queretaro.beans.Operations;

public class XmlConfigExample {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mx/gob/queretaro/beans/beans.xml");

		Employee employee = ctx.getBean(Employee.class);

		Department department = ctx.getBean(Department.class);

		Operations operations = ctx.getBean(Operations.class);

		System.out.println(department);
		System.out.println(employee);

		operations.helloWorld();

	}

}
