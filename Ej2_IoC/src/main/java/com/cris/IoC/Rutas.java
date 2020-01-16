package com.cris.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cris.IoC.almacenamiento.Almacenamiento;

@Controller
public class Rutas {
	
	@Autowired 
	@Qualifier("francia")
	Almacenamiento francia;
	
	@Autowired 
	@Qualifier("españa")
	Almacenamiento españa;
	

	@GetMapping("/precio/francia/{cantidad}")
	@ResponseBody
	public String francia(@PathVariable Integer cantidad){
		
		String s = String.valueOf(cantidad * francia.getIVA() + cantidad);
		
		return "cantidad: "+s;
	}
	
	
	@GetMapping("/precio/españa/{cantidad}")
	@ResponseBody
	public String españa(@PathVariable Integer cantidad){
		
		String s = String.valueOf(cantidad * españa.getIVA() + cantidad);
		
		return "cantidad: "+s;
	}
}
