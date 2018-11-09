package com.sdz.option;

import java.io.Serializable;

public class Climatisation implements Option, Serializable{

	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return 347.3d;
	}

	public TypeOption getTypeOption() {
		return TypeOption.CLIMATISATION;
	}
}
