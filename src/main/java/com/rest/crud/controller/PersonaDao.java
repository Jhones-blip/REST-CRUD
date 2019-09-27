package com.rest.crud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.rest.crud.vo.PersonaVo;

public class PersonaDao {
	
static HashMap<Integer, PersonaVo> countryIdMap = getCountryIdMap();
	
	public PersonaDao(){	
		super();		
		if(countryIdMap==null)
		{
			//registramos personas
			countryIdMap = new HashMap<Integer,PersonaVo>();
			PersonaVo persona1 = new PersonaVo  (1,"Jhon Stiven "," Osorio",1111);
			PersonaVo persona2 = new PersonaVo  (2,"Juan Pablo","Motatin",23546);
			PersonaVo persona3 = new PersonaVo  (3,"Yuliana","Andrea",157);			
			countryIdMap.put(1,persona1);
			countryIdMap.put(2,persona2);
			countryIdMap.put(2, persona3);	
		}	
	}
	
	public List getListaPersonas()
	{		
		List countries= new ArrayList(countryIdMap.values());
		return countries; 
	}	
	 
	public PersonaVo getCountry(int id) {
		PersonaVo country = countryIdMap.get(id);
		return country;
	}	
	
	public String AgregarPersona(PersonaVo AgregarPers ) {
		
		AgregarPers.setId(countryIdMap.size()+1);
		countryIdMap.put(AgregarPers.getId(), AgregarPers);
		
		String msj="Persona agregada satisfactoriamente";
		msj+= "Nombre"+AgregarPers.getNombres()+"Apellido"+AgregarPers.getApellido()+"Documentos"+AgregarPers.getCedula();
		
		return msj;
		
	}	
	
	public PersonaVo ActualizarPersona(PersonaVo actualizarPers)
	{		
		if(actualizarPers.getId()<=0)		
			return null;		
	countryIdMap.put(actualizarPers.getId(),actualizarPers);
	
	return actualizarPers;
	
	}		
	public void EliminarPersona(int id) {
		countryIdMap.remove(id);
	}
	
	public static HashMap<Integer, PersonaVo>getCountryIdMap(){
		return countryIdMap;
	}
	
}
