package org.techhub.Config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.context.ContextLoaderListener;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class webAppInitilizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext ();
		ctx.register(DBConfig.class);
		servletContext.addListener(new ContextLoaderListener(ctx));

		
		AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
		context.register(WebMvcConfig.class);
		
		
		
		DispatcherServlet ds=new DispatcherServlet(context);
			ServletRegistration.Dynamic servlet=servletContext.addServlet("dispatcher", ds);
			servlet.addMapping("/");
			servlet.setLoadOnStartup(1);
			
		
		
		}
	}


