package com.cris.IoC.almacenamiento.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cris.IoC.almacenamiento.Almacenamiento;

@Component
@Qualifier("francia")
public class Francia implements Almacenamiento{

	@Override
	public float getIVA() {

		return 0.25f;
	}

}
