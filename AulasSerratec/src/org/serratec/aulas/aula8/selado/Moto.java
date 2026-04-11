package org.serratec.aulas.aula8.selado;

public final class Moto extends VeiculoSelado {
	private boolean bau;
	
	public Moto(String chassi, String modelo, boolean bau) {
		super(chassi, modelo);
		this.bau = bau;
	}

	public boolean isBau() {
		return bau;
	}

	public void setBau(boolean bau) {
		this.bau = bau;
	}

	@Override
	public String toString() {
		return "[bau=" + bau + ", chassi=" + chassi + ", modelo=" + modelo + "]";
	}
	
	
	
	
}
