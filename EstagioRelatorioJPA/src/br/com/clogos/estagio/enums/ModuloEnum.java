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
		switch (str) {
		case "I M�dulo": return Modulo_I; 
		case "II M�dulo": return Modulo_II;
		case "III M�dulo 1� Fase": return Modulo_III_1;
		case "III M�dulo 2� Fase": return Modulo_III_2;
		default: return null;
		}
	}
}
