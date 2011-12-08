package servicios;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.PersonaDAO;
import entidades.Apoderado;
import entidades.Persona;

public class PersonaDaoService implements PersonaService {

	private DAOFactory fabrica = null;
	private PersonaDAO personadao;
	
	public PersonaDaoService(int jpa) {
		fabrica = DAOFactory.getDAOFactory(jpa);
        this.personadao = fabrica.getPersonaDAO();
	}

	@Override
	public Persona consultaPersona(Persona p) throws Exception {
		// TODO Auto-generated method stub
		return personadao.consultarPersona(p);
	}

	@Override
	public void registrarPersona(Persona nueva) throws Exception {
		// TODO Auto-generated method stub
		personadao.registrarPersona(nueva);
	}

	@Override
	public void guardaApoderado(Apoderado apo) throws Exception {
		// TODO Auto-generated method stub
		personadao.guardaApoderado(apo);
	}

	@Override
	public ArrayList<Persona> obtenerTodosEmpleados() throws Exception {
		// TODO Auto-generated method stub
		return personadao.obtenerTodosEmpleados();
	}

}