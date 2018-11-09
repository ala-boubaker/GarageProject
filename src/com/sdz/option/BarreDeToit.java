package com.sdz.option;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable {

	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return 29.9d;
	}
	public TypeOption getTypeOption() {
		return TypeOption.BARRE_DE_TOIT;
	}
}
