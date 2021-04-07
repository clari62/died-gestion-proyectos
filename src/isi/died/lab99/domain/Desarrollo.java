package isi.died.lab99.domain;

public class Desarrollo extends Tarea {
	private Double riesgo;
	private Double presupuestoMax;
	public Double getPresupuestoMax() {
		return presupuestoMax;
	}

	public void setPresupuestoMax(Double presupuestoMax) {
		this.presupuestoMax = presupuestoMax;
	}

	@Override
	public Integer duracion() {
		// TODO Auto-generated method stub
		return null;
	}

@Override
public Double incremento() {
	// TODO Auto-generated method stub
	return 1+(this.riesgo/2.0);
}

@Override
public void asignarEmpleado(Empleado e) {
	// TODO Auto-generated method stub
	
}

@Override
public Boolean esDesarrollo() {
	// TODO Auto-generated method stub
	return true;
}
}
