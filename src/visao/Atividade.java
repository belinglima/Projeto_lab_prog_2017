/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author frederico
 */
@Entity
@Table(name = "atividade", catalog = "porta", schema = "")
@NamedQueries({
    @NamedQuery(name = "Atividade.findAll", query = "SELECT a FROM Atividade a")
    , @NamedQuery(name = "Atividade.findById", query = "SELECT a FROM Atividade a WHERE a.id = :id")
    , @NamedQuery(name = "Atividade.findByNome", query = "SELECT a FROM Atividade a WHERE a.nome = :nome")
    , @NamedQuery(name = "Atividade.findByCategoria", query = "SELECT a FROM Atividade a WHERE a.categoria = :categoria")
    , @NamedQuery(name = "Atividade.findByEventoId", query = "SELECT a FROM Atividade a WHERE a.eventoId = :eventoId")})
public class Atividade implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;
    @Basic(optional = false)
    @Column(name = "evento_id")
    private String eventoId;

    public Atividade() {
    }

    public Atividade(Integer id) {
        this.id = id;
    }

    public Atividade(Integer id, String nome, String categoria, String eventoId) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.eventoId = eventoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        String oldCategoria = this.categoria;
        this.categoria = categoria;
        changeSupport.firePropertyChange("categoria", oldCategoria, categoria);
    }

    public String getEventoId() {
        return eventoId;
    }

    public void setEventoId(String eventoId) {
        String oldEventoId = this.eventoId;
        this.eventoId = eventoId;
        changeSupport.firePropertyChange("eventoId", oldEventoId, eventoId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atividade)) {
            return false;
        }
        Atividade other = (Atividade) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "visao.Atividade[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
