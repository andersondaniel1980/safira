package controller;

import java.security.Principal;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MVC_Config extends WebMvcConfigurerAdapter {

	
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
        registry.addViewController("/index2").setViewName("index2");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/corpo").setViewName("corpo");
        registry.addViewController("/teste").setViewName("start");
    }
	
//	@GetMapping("/teste")
//    String index(Principal principal) {
//        return principal != null ? "homeSignedIn" : "homeNotSignedIn";
//    }

   
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry
	      .addResourceHandler("/resources/**")
	      .addResourceLocations("/resources/","classpath:/other-resources/");
	}
	

}