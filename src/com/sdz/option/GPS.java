package com.sdz.option;

import java.io.Serializable;

public class GPS implements Option, Serializable{

	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return 113.5d;
	}

	public TypeOption getTypeOption() {
		return TypeOption.GPS;
	}
}
