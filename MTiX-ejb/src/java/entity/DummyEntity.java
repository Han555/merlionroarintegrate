/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Student-ID
 */
@Entity
public class DummyEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dummyId;

    public Long getDummyId() {
        return dummyId;
    }

    public void setDummyId(Long dummyId) {
        this.dummyId = dummyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dummyId != null ? dummyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the dummyId fields are not set
        if (!(object instanceof DummyEntity)) {
            return false;
        }
        DummyEntity other = (DummyEntity) object;
        if ((this.dummyId == null && other.dummyId != null) || (this.dummyId != null && !this.dummyId.equals(other.dummyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DummyEntity[ id=" + dummyId + " ]";
    }
    
}
