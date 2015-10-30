/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peternakanayam;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Andreas Suharto
 */
@Entity
@Table(name = "tbl_ayam", catalog = "ayam", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblAyam.findAll", query = "SELECT t FROM TblAyam t"),
    @NamedQuery(name = "TblAyam.findByIdjumlah", query = "SELECT t FROM TblAyam t WHERE t.idjumlah = :idjumlah"),
    @NamedQuery(name = "TblAyam.findByJumlahayam", query = "SELECT t FROM TblAyam t WHERE t.jumlahayam = :jumlahayam"),
    @NamedQuery(name = "TblAyam.findByJumlahSehat", query = "SELECT t FROM TblAyam t WHERE t.jumlahSehat = :jumlahSehat"),
    @NamedQuery(name = "TblAyam.findByJumlahSakit", query = "SELECT t FROM TblAyam t WHERE t.jumlahSakit = :jumlahSakit"),
    @NamedQuery(name = "TblAyam.findByJumlahMati", query = "SELECT t FROM TblAyam t WHERE t.jumlahMati = :jumlahMati"),
    @NamedQuery(name = "TblAyam.findByTanggalCatat", query = "SELECT t FROM TblAyam t WHERE t.tanggalCatat = :tanggalCatat")})
public class TblAyam implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_jumlah")
    private Integer idjumlah;
    @Basic(optional = false)
    @Column(name = "Jumlah_ayam")
    private String jumlahayam;
    @Basic(optional = false)
    @Column(name = "Jumlah_Sehat")
    private String jumlahSehat;
    @Basic(optional = false)
    @Column(name = "Jumlah_Sakit")
    private String jumlahSakit;
    @Basic(optional = false)
    @Column(name = "Jumlah_Mati")
    private String jumlahMati;
    @Basic(optional = false)
    @Column(name = "Tanggal_Catat")
    @Temporal(TemporalType.DATE)
    private Date tanggalCatat;

    public TblAyam() {
    }

    public TblAyam(Integer idjumlah) {
        this.idjumlah = idjumlah;
    }

    public TblAyam(Integer idjumlah, String jumlahayam, String jumlahSehat, String jumlahSakit, String jumlahMati, Date tanggalCatat) {
        this.idjumlah = idjumlah;
        this.jumlahayam = jumlahayam;
        this.jumlahSehat = jumlahSehat;
        this.jumlahSakit = jumlahSakit;
        this.jumlahMati = jumlahMati;
        this.tanggalCatat = tanggalCatat;
    }

    public Integer getIdjumlah() {
        return idjumlah;
    }

    public void setIdjumlah(Integer idjumlah) {
        Integer oldIdjumlah = this.idjumlah;
        this.idjumlah = idjumlah;
        changeSupport.firePropertyChange("idjumlah", oldIdjumlah, idjumlah);
    }

    public String getJumlahayam() {
        return jumlahayam;
    }

    public void setJumlahayam(String jumlahayam) {
        String oldJumlahayam = this.jumlahayam;
        this.jumlahayam = jumlahayam;
        changeSupport.firePropertyChange("jumlahayam", oldJumlahayam, jumlahayam);
    }

    public String getJumlahSehat() {
        return jumlahSehat;
    }

    public void setJumlahSehat(String jumlahSehat) {
        String oldJumlahSehat = this.jumlahSehat;
        this.jumlahSehat = jumlahSehat;
        changeSupport.firePropertyChange("jumlahSehat", oldJumlahSehat, jumlahSehat);
    }

    public String getJumlahSakit() {
        return jumlahSakit;
    }

    public void setJumlahSakit(String jumlahSakit) {
        String oldJumlahSakit = this.jumlahSakit;
        this.jumlahSakit = jumlahSakit;
        changeSupport.firePropertyChange("jumlahSakit", oldJumlahSakit, jumlahSakit);
    }

    public String getJumlahMati() {
        return jumlahMati;
    }

    public void setJumlahMati(String jumlahMati) {
        String oldJumlahMati = this.jumlahMati;
        this.jumlahMati = jumlahMati;
        changeSupport.firePropertyChange("jumlahMati", oldJumlahMati, jumlahMati);
    }

    public Date getTanggalCatat() {
        return tanggalCatat;
    }

    public void setTanggalCatat(Date tanggalCatat) {
        Date oldTanggalCatat = this.tanggalCatat;
        this.tanggalCatat = tanggalCatat;
        changeSupport.firePropertyChange("tanggalCatat", oldTanggalCatat, tanggalCatat);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjumlah != null ? idjumlah.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblAyam)) {
            return false;
        }
        TblAyam other = (TblAyam) object;
        if ((this.idjumlah == null && other.idjumlah != null) || (this.idjumlah != null && !this.idjumlah.equals(other.idjumlah))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "peternakanayam.TblAyam[ idjumlah=" + idjumlah + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
