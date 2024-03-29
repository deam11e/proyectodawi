package entidades;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name="distrito")
public class Distrito implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="iddistrito")
	private int intIdDistrito;
	
	@Column(name="nombreDis")
	private String strNombreDistrito;
		
	@OneToMany(targetEntity=Persona.class,mappedBy="distritos")
	private Collection<Persona> tbPersonas;
	
	@OneToMany(targetEntity=Alumno.class,mappedBy="distritos")
	private Collection<Alumno> tbAlumnos;

	public int getIntIdDistrito() {
		return intIdDistrito;
	}

	public void setIntIdDistrito(int intIdDistrito) {
		this.intIdDistrito = intIdDistrito;
	}

	public String getStrNombreDistrito() {
		return strNombreDistrito;
	}

	public void setStrNombreDistrito(String strNombreDistrito) {
		this.strNombreDistrito = strNombreDistrito;
	}

	public Collection<Persona> getTbPersonas() {
		return tbPersonas;
	}

	public void setTbPersonas(Collection<Persona> tbPersonas) {
		this.tbPersonas = tbPersonas;
	}

	public Collection<Alumno> getTbAlumnos() {
		return tbAlumnos;
	}

	public void setTbAlumnos(Collection<Alumno> tbAlumnos) {
		this.tbAlumnos = tbAlumnos;
	}
	
}
