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
			 Cliente c1 = new Cliente( );
			 Cliente c2 = new Cliente();
			 Cliente c3 = new Cliente();
			 c1.setNomeContato("Anderson");
			 c1.setEmailContato("anderson@gmail.com");
			 c2.setNomeContato("Daniel");
			 c2.setEmailContato("daniel@gmail.com");
			 c3.setNomeContato("Araujo");
			 c3.setEmailContato("araujo@gmail.com");
			 
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