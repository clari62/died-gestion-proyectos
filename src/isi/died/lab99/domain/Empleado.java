package isi.died.lab99.domain;

public abstract class Empleado {
	protected String nombre;
	protected Long cuit;
	protected Byte seniority;
	protected Integer horasMaxDevDia;
	protected Integer horasMaxOtrasDia;
	
	public Integer getHorasMaxDevDia() {
		return horasMaxDevDia;
	}
	public void setHorasMaxDevDia(Integer horasMaxDevDia) {
		this.horasMaxDevDia = horasMaxDevDia;
	}
	public Integer getHorasMaxOtrasDia() {
		return horasMaxOtrasDia;
	}
	public void setHorasMaxOtrasDia(Integer horasMaxOtrasDia) {
		this.horasMaxOtrasDia = horasMaxOtrasDia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getCuit() {
		return cuit;
	}
	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}
	public Byte getSeniority() {
		return seniority;
	}
	public void setSeniority(Byte seniority) {
		this.seniority = seniority;
	}
	
	
}
