package org.springhispano.vivecodigo.reference.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;
import java.util.Date;

/** Representa un foro del sitio, que debe haber sido creado por un usuario registrado.
 * Un foro puede tener varios tags y varios comentarios.
 *
 * @author: Enrique Zamudio
 */
@Entity
public class Foro {
    @Id
    private int fid;
    private String titulo;
    private String texto;
    private Date alta;
    private User autor;
    private Set<String> tags;
    private Set<Comentario> comments;

    public int getFid() {
        return fid;
    }
    public void setFid(int value) {
        fid = value;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String value) {
        titulo = value;
    }

    public String getTexto() {
        return texto;
    }
    public void setTexto(String value) {
        texto = value;
    }

    public Set<String> getTags() {
        return tags;
    }
    public void setTags(Set<String> value) {
        tags = value;
    }

    public Date getFechaAlta() {
        return alta;
    }
    public void setFechaAlta(Date value) {
        alta = value;
    }

    public User getAutor() {
        return autor;
    }
    public void setAutor(User value) {
        autor = value;
    }

    public Set<Comentario> getComentarios() {
        return comments;
    }
    public void setComentarios(Set<Comentario> value) {
        comments = value;
    }

}

