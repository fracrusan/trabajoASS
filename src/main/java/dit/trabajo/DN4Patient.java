package dit.trabajo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DN4Patient implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Asocia el dolor al de piinchazos de alfileres")
	private java.lang.Boolean alfileres;
	@org.kie.api.definition.type.Label(value = "¿Tiene el dolor la característica de quemazón?")
	private java.lang.Boolean quemazon;
	@org.kie.api.definition.type.Label(value = "¿Tiene el dolor la característica de frío doloroso?")
	private java.lang.Boolean frioDoloroso;
	@org.kie.api.definition.type.Label(value = "¿tiene el dolor la características de descarga eleéctricas?")
	private java.lang.Boolean descargaEléctrica;
	@org.kie.api.definition.type.Label(value = "¿Tiene el dolor sensación de hormigueo?")
	private java.lang.Boolean hormigueo;
	@org.kie.api.definition.type.Label(value = "¿tiene el dolor sensación de picazón?")
	private java.lang.Boolean picazon;
	@org.kie.api.definition.type.Label(value = "¿asocia el dolor a la sensación de entumecimiento en la misma zona?")
	private java.lang.Boolean entumecimiento;
	private java.lang.Long id;
	private java.lang.Integer puntuacion;

	public DN4Patient() {
	}

	public java.lang.Boolean getAlfileres() {
		return this.alfileres;
	}

	public void setAlfileres(java.lang.Boolean alfileres) {
		this.alfileres = alfileres;
	}

	public java.lang.Boolean getQuemazon() {
		return this.quemazon;
	}

	public void setQuemazon(java.lang.Boolean quemazon) {
		this.quemazon = quemazon;
	}

	public java.lang.Boolean getFrioDoloroso() {
		return this.frioDoloroso;
	}

	public void setFrioDoloroso(java.lang.Boolean frioDoloroso) {
		this.frioDoloroso = frioDoloroso;
	}

	public java.lang.Boolean getDescargaEléctrica() {
		return this.descargaEléctrica;
	}

	public void setDescargaEléctrica(java.lang.Boolean descargaEléctrica) {
		this.descargaEléctrica = descargaEléctrica;
	}

	public java.lang.Boolean getHormigueo() {
		return this.hormigueo;
	}

	public void setHormigueo(java.lang.Boolean hormigueo) {
		this.hormigueo = hormigueo;
	}

	public java.lang.Boolean getPicazon() {
		return this.picazon;
	}

	public void setPicazon(java.lang.Boolean picazon) {
		this.picazon = picazon;
	}

	public java.lang.Boolean getEntumecimiento() {
		return this.entumecimiento;
	}

	public void setEntumecimiento(java.lang.Boolean entumecimiento) {
		this.entumecimiento = entumecimiento;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.Integer getPuntuacion() {
		return this.puntuacion;
	}

	public void setPuntuacion(java.lang.Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

	public DN4Patient(java.lang.Boolean alfileres, java.lang.Boolean quemazon,
			java.lang.Boolean frioDoloroso,
			java.lang.Boolean descargaEléctrica, java.lang.Boolean hormigueo,
			java.lang.Boolean picazon, java.lang.Boolean entumecimiento,
			java.lang.Long id, java.lang.Integer puntuacion) {
		this.alfileres = alfileres;
		this.quemazon = quemazon;
		this.frioDoloroso = frioDoloroso;
		this.descargaEléctrica = descargaEléctrica;
		this.hormigueo = hormigueo;
		this.picazon = picazon;
		this.entumecimiento = entumecimiento;
		this.id = id;
		this.puntuacion = puntuacion;
	}

}