package Model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cartel")
public class Cartel {
	
	private String eventoId;
	private String nombreEvento;
	private String categoriaEvento;
	private String detalleEvento;
	private Date fechaEvento;
	
	public Cartel () {
		
	}
	
	public Cartel(String eventoId, String nombreEvento, String categoriaEvento, String detalleEvento,
			Date fechaEvento) {
		super();
		this.eventoId = eventoId;
		this.nombreEvento = nombreEvento;
		this.categoriaEvento = categoriaEvento;
		this.detalleEvento = detalleEvento;
		this.fechaEvento = fechaEvento;
	}

	public String getEventoId() {
		return eventoId;
	}

	public void setEventoId(String eventoId) {
		this.eventoId = eventoId;
	}

	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public String getCategoriaEvento() {
		return categoriaEvento;
	}

	public void setCategoriaEvento(String categoriaEvento) {
		this.categoriaEvento = categoriaEvento;
	}

	public String getDetalleEvento() {
		return detalleEvento;
	}

	public void setDetalleEvento(String detalleEvento) {
		this.detalleEvento = detalleEvento;
	}

	public Date getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}
	

	
}
