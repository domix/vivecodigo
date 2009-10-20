package org.springhispano.vivecodigo.reference.model;

import javax.persistence.*;
import java.util.Date;

/** Representa un comentario hecho por un usuario en un foro.
 *
 * @author: Enrique Zamudio
 */
@Entity
public class Comentario implements Comparable<Comentario> {
    @Id
    @SequenceGenerator(name="pk", sequenceName="comentario_cid_seq", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="pk")
    private int cid;
    private Date alta;
    private String texto;
    @ManyToOne(optional=false)
    @JoinColumn(name="uid")
    private User autor;
    @ManyToOne(optional=false)
    @JoinColumn(name="fid")
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
