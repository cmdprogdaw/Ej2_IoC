package com.cris.IoC.almacenamiento.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cris.IoC.almacenamiento.Almacenamiento;

@Component
@Qualifier("francia")
public class Francia implements Almacenamiento{

	@Override
	public Integer getIVA() {

		return 25;
	}

}
