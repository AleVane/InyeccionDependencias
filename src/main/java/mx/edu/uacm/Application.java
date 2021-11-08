package mx.edu.uacm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Application {
private static final Logger log = LogManager.getLogger(Application.class);
	public static void main(String[] args) {
		/* sin uso dde spring
		Ninja ninja = new Ninja();
		//inyeccion de pendencia
		//agregacion 
		ninja.setArma(new Chacos());
		//inyeccion de pendencia
	    //agregacio
		ninja.setMision("pasar nivel uno");*/
		
		ApplicationContext contenedor = new ClassPathXmlApplicationContext("/context.xml");
		Ninja ninja = (Ninja) contenedor.getBean("ninja");
		log.debug("arma del ninja" + ninja.getArma());
	}
	
 
 
} 
