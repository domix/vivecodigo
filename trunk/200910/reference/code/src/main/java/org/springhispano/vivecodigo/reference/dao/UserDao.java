package org.springhispano.vivecodigo.reference.dao;

import org.springhispano.vivecodigo.reference.model.User;

/** Define el comportamiento del DAO para usuarios.
 *
 * @author Enrique Zamudio
 */
public interface UserDao {

    /** Devuelve el usuario con el uid especificado, si es que existe. */
    public User getUser(int uid);

    /** Devuelve el usuario con el login especificado, si es que existe. */
    public User getUser(String login);

    /** Devuevle el usuario con el login y password especificados, siempre y cuando el usuario exista
     * y su password sea valido. */
    public User validateUser(String login, String password);

    /** Agrega un nuevo usuario a la base de datos. */
    public void add(User user);

    /** Elimina de la base de datos el usuario especificado. */
    public void delete(User user);

    /** Actualiza en base de datos la informacion del usuario especificado. */
    public void update(User user);

}
