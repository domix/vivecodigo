package org.springhispano.vivecodigo.reference.model;

import javax.persistence.*;
import java.util.Date;

/** Representa un usuario del sistema. Solamente los usuarios registrados pueden participar en foros.
 *
 * @author: Domingo Suarez
 */
@Entity
public class User {
	@Id
    @SequenceGenerator(name="pk", sequenceName="user_uid_seq", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="pk")
	private int uid;
	private String login;
	private String nombre;
	private String apellidos;
	private String passwd;
	private Date alta;

	public int getUid() {
		return uid;
	}
	public void setUid(int value) {
		uid = value;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getPassword() {
		return passwd;
	}
	public void setPassword(String value) {
		passwd = value;
	}

	public Date getFechaAlta() {
		return alta;
	}
	public void setFechaAlta(Date value) {
		alta = value;
	}

}
