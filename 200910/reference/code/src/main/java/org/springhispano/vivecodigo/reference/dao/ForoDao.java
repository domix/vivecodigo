package org.springhispano.vivecodigo.reference.dao;

import org.springhispano.vivecodigo.reference.model.Foro;
import org.springhispano.vivecodigo.reference.model.Comentario;
import org.springhispano.vivecodigo.reference.model.User;

import java.util.List;
import java.util.Date;

/** Define el comportamiento del DAO que maneja los foros y sus comentarios.
 *
 * @author Enrique Zamudio
 */
public interface ForoDao {

    /** Devuelve el foro con la clave especificada, si es que existe. */
    public Foro getForo(int fid);

    /** Agrega el foro indicado a la base de datos. */
    public void add(Foro foro);
    /** Elimina de la base de datos el foro especificado, junto con todos sus comentarios. */
    public void delete(Foro foro);
    /** Actualiza los datos del foro especificado en base de datos. */
    public void update(Foro foro);

    /** Agrega el comentario especificado al foro especificado. */
    public void addComentario(Comentario comm, Foro foro);

    /** Elimina de base de datos el comentario especificado. */
    public void deleteComentario(Comentario comm);

    /** Devuelve la lista de todos los foros que han sido creados por el usuario indicado. */
    public List<Foro> getForos(User user);

    /** Devuelve una lista con todos los comentarios que han sido hechos por el usuario indicado. */
    public List<Comentario> getComentarios(User user);

    /** Devuelve una lista con los foros que han sido creados o bien que han sido modificados o que han recibido
     * comentarios despues de la fecha especificada. */
    public List<Foro> getForosPosteriores(Date fecha);

}
