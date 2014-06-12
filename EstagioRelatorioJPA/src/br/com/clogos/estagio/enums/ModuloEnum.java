package br.com.clogos.estagio.enums;

public enum ModuloEnum {
	Modulo_I("I M�dulo"), 
	Modulo_II("II M�dulo"), 
	Modulo_III_1("III M�dulo 1� Fase"), 
	Modulo_III_2("III M�dulo 2� Fase");
	
	private String label;
	
	ModuloEnum(String label) {
		this.label=label;
	}
	
	public String getLabel() {
		return label;
	}
	
	public static ModuloEnum getModulo(String str) {
		if(str.equalsIgnoreCase("I M�dulo"))  {
			return Modulo_I;
		} else if (str.equalsIgnoreCase("II M�dulo")) {
			return Modulo_II;
		} else if(str.equalsIgnoreCase("III M�dulo 1� Fase")) {
			return Modulo_III_1;
		} else if(str.equalsIgnoreCase("III M�dulo 2� Fase")) {
			return Modulo_III_2;
		} else {
			return null;
		}
	}
}
