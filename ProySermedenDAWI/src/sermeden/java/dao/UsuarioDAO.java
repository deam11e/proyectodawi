package sermeden.java.dao;

import java.util.List;

import sermeden.java.bean.DMPacienteDTO;
import sermeden.java.bean.UsuarioDTO;

public interface UsuarioDAO {

	public UsuarioDTO buscaPorUsuario(UsuarioDTO elusuario) throws Exception;

	public List<UsuarioDTO> listadoUsuariosXDNI(String filtro);

	public List<UsuarioDTO> listadoUsuariosXApellido(String filtro);

	public boolean validarUsuarioRegistrado(UsuarioDTO usuario) throws Exception;

	public int registrarUsuario(UsuarioDTO usuario) throws Exception;

	public int registrarUsuarioxPersona(UsuarioDTO usuario) throws Exception;

	public UsuarioDTO buscaUsuarioCargar(String idBuscar);

	public int modificarPersona(UsuarioDTO usuario);

	public int modificarUsuarioxPersona(UsuarioDTO usuario);

	public int cambiarEstadoUsuario(UsuarioDTO auxiliar);

	public String recuperaPassUser(String dniBuscado);

	public UsuarioDTO pacienteXDNI(String dniBuscado);

	public List<UsuarioDTO> listadoPacienteXApellido(String filtro);

	public List<UsuarioDTO> listadoPacienteXDNI(String filtro);

	public int registrarDMPaciente(DMPacienteDTO dmpaciente);

	public DMPacienteDTO DMxIdPaciente(String idBuscar);

	public int modificarDMPaciente(DMPacienteDTO dmpaciente);

	public UsuarioDTO usuarioXDNI(String dniBuscado);
	
}
