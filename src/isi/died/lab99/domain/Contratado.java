package isi.died.lab99.domain;

public class Contratado extends Empleado {
	private Double costoHora;

	public Double getCostoHora() {
		return costoHora;
	}

	public void setCostoHora(Double costoHora) {
		this.costoHora = costoHora;
	}

	@Override
	public Double costo(Tarea t) {
		//no usar instance of
		// TODO Auto-generated method stub
		Double costoTmp= t.duracion()*this.costoHora;
		//TODO si la tarea es desarrollo se descarga la mitad del riesgo
		//TODO si la taarea es de mantenimiento NO rutinario se recarga el 20%
		return costoTmp*t.incremento();

	}

	@Override
	public void agregar(Agendable a) {
		// TODO Auto-generated method stub
		//TODO 
		if(a.esDesarrollo() && a.duracion > this.getHorasMaxDevDia) {
			throw new 
		};
	}
	
}
