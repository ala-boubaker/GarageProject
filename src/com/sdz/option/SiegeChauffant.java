package com.sdz.option;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable{

	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return 562.9d;
	}
	public TypeOption getTypeOption() {
		return TypeOption.SIEGE_CHAUFFANT;
	}
}
