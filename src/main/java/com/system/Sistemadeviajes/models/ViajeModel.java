package com.system.Sistemadeviajes.models;

import java.sql.Date;


public class ViajeModel {

	private long idViaje;
	private Date fecha;
	private String direccion;
	private String localidad;
	private double importe;
	private EmpleadoModel empleado;
	private ClienteModel cliente;
	private String detalle;
	private boolean contado;
	private boolean entregado;
	private double descuento;
	private double neto;
	
	
	public ViajeModel() { }

	
	public ViajeModel(long idViaje, Date fecha, String direccion, String localidad, double importe,
			EmpleadoModel empleado, ClienteModel cliente, String detalle, boolean contado, boolean entregado,
			double descuento,double neto) {
		super();
		this.idViaje = idViaje;
		this.fecha = fecha;
		this.direccion = direccion;
		this.localidad = localidad;
		this.importe = importe;
		this.empleado = empleado;
		this.cliente = cliente;
		this.detalle = detalle;
		this.contado = contado;
		this.entregado = entregado;
		this.descuento = descuento;
		this.neto = neto;
	}




	public long getIdViajes() {
		return idViaje;
	}


	public void setIdViajes(long idViajes) {
		this.idViaje = idViajes;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public double getImporte() {
		return importe;
	}


	public void setImporte(double importe) {
		this.importe = importe;
	}


	public EmpleadoModel getEmpleado() {
		return empleado;
	}


	public void setEmpleado(EmpleadoModel empleado) {
		this.empleado = empleado;
	}


	public ClienteModel getCliente() {
		return cliente;
	}


	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}


	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	public long getIdViaje() {
		return idViaje;
	}


	public void setIdViaje(long idViaje) {
		this.idViaje = idViaje;
	}


	public boolean isContado() {
		return contado;
	}


	public void setContado(boolean contado) {
		this.contado = contado;
	}


	public boolean isEntregado() {
		return entregado;
	}


	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}


	public double getDescuento() {
		return descuento;
	}


	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}


	public double getNeto() {
		return neto;
	}


	public void setNeto(double neto) {
		this.neto = neto;
	}


	@Override
	public String toString() {
		return "ViajeModel [idViaje=" + idViaje + ", fecha=" + fecha + ", direccion=" + direccion + ", localidad="
				+ localidad + ", importe=" + importe + ", empleado=" + empleado + ", cliente=" + cliente + ", detalle="
				+ detalle + ", contado=" + contado + ", entregado=" + entregado + ", descuento=" + descuento + ", neto="
				+ neto + "]";
	}


}//fin class