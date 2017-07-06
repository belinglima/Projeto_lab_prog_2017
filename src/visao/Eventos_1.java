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

@Entity
@Table(name = "eventos", catalog = "porta", schema = "")
@NamedQueries({
    @NamedQuery(name = "Eventos_1.findAll", query = "SELECT e FROM Eventos_1 e")
    , @NamedQuery(name = "Eventos_1.findById", query = "SELECT e FROM Eventos_1 e WHERE e.id = :id")
    , @NamedQuery(name = "Eventos_1.findByNome", query = "SELECT e FROM Eventos_1 e WHERE e.nome = :nome")
    , @NamedQuery(name = "Eventos_1.findByHoras", query = "SELECT e FROM Eventos_1 e WHERE e.horas = :horas")
    , @NamedQuery(name = "Eventos_1.findByCriadorId", query = "SELECT e FROM Eventos_1 e WHERE e.criadorId = :criadorId")
    , @NamedQuery(name = "Eventos_1.findByInstituicao", query = "SELECT e FROM Eventos_1 e WHERE e.instituicao = :instituicao")
    , @NamedQuery(name = "Eventos_1.findByLocal", query = "SELECT e FROM Eventos_1 e WHERE e.local = :local")
    , @NamedQuery(name = "Eventos_1.findByCpf", query = "SELECT e FROM Eventos_1 e WHERE e.cpf = :cpf")})
public class Eventos_1 implements Serializable {

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
    @Column(name = "horas")
    private String horas;
    @Basic(optional = false)
    @Column(name = "criador_id")
    private String criadorId;
    @Basic(optional = false)
    @Column(name = "instituicao")
    private String instituicao;
    @Basic(optional = false)
    @Column(name = "local")
    private String local;
    @Basic(optional = false)
    @Column(name = "cpf")
    private short cpf;

    public Eventos_1() {
    }

    public Eventos_1(Integer id) {
        this.id = id;
    }

    public Eventos_1(Integer id, String nome, String horas, String criadorId, String instituicao, String local, short cpf) {
        this.id = id;
        this.nome = nome;
        this.horas = horas;
        this.criadorId = criadorId;
        this.instituicao = instituicao;
        this.local = local;
        this.cpf = cpf;
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

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        String oldHoras = this.horas;
        this.horas = horas;
        changeSupport.firePropertyChange("horas", oldHoras, horas);
    }

    public String getCriadorId() {
        return criadorId;
    }

    public void setCriadorId(String criadorId) {
        String oldCriadorId = this.criadorId;
        this.criadorId = criadorId;
        changeSupport.firePropertyChange("criadorId", oldCriadorId, criadorId);
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        String oldInstituicao = this.instituicao;
        this.instituicao = instituicao;
        changeSupport.firePropertyChange("instituicao", oldInstituicao, instituicao);
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        String oldLocal = this.local;
        this.local = local;
        changeSupport.firePropertyChange("local", oldLocal, local);
    }

    public short getCpf() {
        return cpf;
    }

    public void setCpf(short cpf) {
        short oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
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
        if (!(object instanceof Eventos_1)) {
            return false;
        }
        Eventos_1 other = (Eventos_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "visao.Eventos_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
         
        
     
}
