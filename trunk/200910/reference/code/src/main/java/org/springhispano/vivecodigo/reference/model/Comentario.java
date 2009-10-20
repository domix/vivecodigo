package org.springhispano.vivecodigo.reference.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ezamudio
 * Date: Oct 20, 2009
 * Time: 11:37:06 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Comentario implements Comparable<Comentario> {
    @Id
    private int cid;
    private Date alta;
    private String texto;
    private User autor;
    private Foro foro;

    public int getCid() {
        return cid;
    }
    public void setCid(int value) {
        cid = value;
    }

    public Date getFechaAlta() {
        return alta;
    }
    public void setFechaAlta(Date value) {
        alta = value;
    }

    public String getTexto() {
        return texto;
    }
    public void setTexto(String value) {
        texto = value;
    }

    public User getAutor() {
        return autor;
    }
    public void setAutor(User value) {
        autor = value;
    }

    public Foro getForo() {
        return foro;
    }
    public void setForo(Foro value) {
        foro = value;
    }

    public int compareTo(Comentario o) {
        if (o == null) {
            return 1;
        } else if (cid > o.getCid()) {
            return 1;
        }
        return cid == o.getCid() ? 0 : -1;
    }

    public boolean equals(Object o) {
        if (o instanceof Comentario) {
            return ((Comentario)o).getCid() == cid;
        }
        return false;
    }

}
