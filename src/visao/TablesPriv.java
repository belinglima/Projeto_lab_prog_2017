/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author frederico
 */
@Entity
@Table(name = "tables_priv", catalog = "mysql", schema = "")
@NamedQueries({
    @NamedQuery(name = "TablesPriv.findAll", query = "SELECT t FROM TablesPriv t")
    , @NamedQuery(name = "TablesPriv.findByHost", query = "SELECT t FROM TablesPriv t WHERE t.tablesPrivPK.host = :host")
    , @NamedQuery(name = "TablesPriv.findByDb", query = "SELECT t FROM TablesPriv t WHERE t.tablesPrivPK.db = :db")
    , @NamedQuery(name = "TablesPriv.findByUser", query = "SELECT t FROM TablesPriv t WHERE t.tablesPrivPK.user = :user")
    , @NamedQuery(name = "TablesPriv.findByTablename", query = "SELECT t FROM TablesPriv t WHERE t.tablesPrivPK.tablename = :tablename")
    , @NamedQuery(name = "TablesPriv.findByGrantor", query = "SELECT t FROM TablesPriv t WHERE t.grantor = :grantor")
    , @NamedQuery(name = "TablesPriv.findByTimestamp", query = "SELECT t FROM TablesPriv t WHERE t.timestamp = :timestamp")
    , @NamedQuery(name = "TablesPriv.findByTablepriv", query = "SELECT t FROM TablesPriv t WHERE t.tablepriv = :tablepriv")
    , @NamedQuery(name = "TablesPriv.findByColumnpriv", query = "SELECT t FROM TablesPriv t WHERE t.columnpriv = :columnpriv")})
public class TablesPriv implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TablesPrivPK tablesPrivPK;
    @Basic(optional = false)
    @Column(name = "Grantor")
    private String grantor;
    @Basic(optional = false)
    @Column(name = "Timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
    @Basic(optional = false)
    @Column(name = "Table_priv")
    private String tablepriv;
    @Basic(optional = false)
    @Column(name = "Column_priv")
    private String columnpriv;

    public TablesPriv() {
    }

    public TablesPriv(TablesPrivPK tablesPrivPK) {
        this.tablesPrivPK = tablesPrivPK;
    }

    public TablesPriv(TablesPrivPK tablesPrivPK, String grantor, Date timestamp, String tablepriv, String columnpriv) {
        this.tablesPrivPK = tablesPrivPK;
        this.grantor = grantor;
        this.timestamp = timestamp;
        this.tablepriv = tablepriv;
        this.columnpriv = columnpriv;
    }

    public TablesPriv(String host, String db, String user, String tablename) {
        this.tablesPrivPK = new TablesPrivPK(host, db, user, tablename);
    }

    public TablesPrivPK getTablesPrivPK() {
        return tablesPrivPK;
    }

    public void setTablesPrivPK(TablesPrivPK tablesPrivPK) {
        this.tablesPrivPK = tablesPrivPK;
    }

    public String getGrantor() {
        return grantor;
    }

    public void setGrantor(String grantor) {
        String oldGrantor = this.grantor;
        this.grantor = grantor;
        changeSupport.firePropertyChange("grantor", oldGrantor, grantor);
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        Date oldTimestamp = this.timestamp;
        this.timestamp = timestamp;
        changeSupport.firePropertyChange("timestamp", oldTimestamp, timestamp);
    }

    public String getTablepriv() {
        return tablepriv;
    }

    public void setTablepriv(String tablepriv) {
        String oldTablepriv = this.tablepriv;
        this.tablepriv = tablepriv;
        changeSupport.firePropertyChange("tablepriv", oldTablepriv, tablepriv);
    }

    public String getColumnpriv() {
        return columnpriv;
    }

    public void setColumnpriv(String columnpriv) {
        String oldColumnpriv = this.columnpriv;
        this.columnpriv = columnpriv;
        changeSupport.firePropertyChange("columnpriv", oldColumnpriv, columnpriv);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tablesPrivPK != null ? tablesPrivPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TablesPriv)) {
            return false;
        }
        TablesPriv other = (TablesPriv) object;
        if ((this.tablesPrivPK == null && other.tablesPrivPK != null) || (this.tablesPrivPK != null && !this.tablesPrivPK.equals(other.tablesPrivPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "visao.TablesPriv[ tablesPrivPK=" + tablesPrivPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
