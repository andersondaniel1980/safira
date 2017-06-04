package controller;
 
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import entity.Cliente;

@Controller
public class GreetingController extends WebMvcConfigurerAdapter{

//	@Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/home").setViewName("home");
//        registry.addViewController("/").setViewName("home");
//        registry.addViewController("/hello").setViewName("hello");
//        registry.addViewController("/login").setViewName("login");
//    }
//	
    
//    @RequestMapping("/")
//    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "index";
//    }

	
	
//    @RequestMapping("/cadastro")
//    public String cadastro(){
//    	return "cadastro";
//    }

    @RequestMapping(value="/cadastrar", method=RequestMethod.POST)
	 public ModelAndView cadastrar(ModelAndView modelV, Model model){
		 modelV = new ModelAndView("cadastrar");
		 try{
			  modelV.addObject("msg","Dados Gravados ...");
		 }catch(Exception ex){
			 modelV.addObject("msg", "Error :" + ex.getMessage());
		 }
		 return modelV;
	 }

    @RequestMapping(value="/listar", method=RequestMethod.GET)
	 public ModelAndView listar(ModelAndView modelV, Model model){
		 modelV = new ModelAndView("listar");
		 try{
			 Cliente c1 = new Cliente("Anderson", "anderson@gmail.com");
			 Cliente c2 = new Cliente("Leandra", "leandra@gmail.com");
			 Cliente c3 = new Cliente("Leticia", "leticia@gmail.com");
			 List<Cliente> lst =  new ArrayList<>();
			 lst.add(c1);
			 lst.add(c2);
			 lst.add(c3);
			 modelV.addObject("lista", lst);
			 modelV.addObject("msg","Dados Listados");
		 }catch(Exception ex){
			 modelV.addObject("msg", "Error :" + ex.getMessage());
		 }
		 return modelV;
	 }
    	
    
    
    

}