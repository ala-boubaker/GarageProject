package com.sdz.option;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable {

	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return 212.35d;
	}
	public TypeOption getTypeOption() {
		return TypeOption.VITRE_ELECTRIQUE;
	}

}
