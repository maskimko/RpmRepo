/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ua.pp.msk.yum.sqlite.primary;

import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;
import ua.pp.msk.yum.sqlite.common.AbstractEntry;
import ua.pp.msk.yum.sqlite.common.Entry;
import ua.pp.msk.yum.sqlite.common.Provides;

/**
 *
 * @author Maksym Shkolnyi aka maskimko
 */
@XmlRootElement

public class ProvidesImpl extends AbstractEntry implements Provides {
    private static final long serialVersionUID = 1L;
    
    private long id;
    private String name;
    private String flags;
    private String epoch;
    private String version;
    private String release;
    private int pkgKey;
      
     public ProvidesImpl() {}
    
    public ProvidesImpl(String name, String flags, String epoch, String version, String release) {
        this.name = name;
        this.flags = flags;
        this.epoch = epoch;
        this.version = version;
        this.release = release;
    }
    public ProvidesImpl(Entry entry){
      this(entry.getName(), entry.getFlags(), entry.getEpoch(), entry.getVersion(), entry.getRelease());
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @Override
    public String getFlags() {
        return flags;
    }

    @Override
    public void setFlags(String flags) {
        this.flags = flags;
    }

     @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEpoch() {
        return epoch;
    }

    @Override
    public void setEpoch(String epoch) {
        this.epoch = epoch;
        }

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public void setVersion(String version) {
       this.version = version;
    }

    @Override
    public String getRelease() {
        return release;
    }

    @Override
    public void setRelease(String release) {
        this.release = release;
    }

    @Override
    public int getPkgKey() {
        return pkgKey;
    }

    @Override
    public void setPkgKey(int pkgKey) {
        this.pkgKey = pkgKey;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.flags);
        hash = 97 * hash + Objects.hashCode(this.epoch);
        hash = 97 * hash + Objects.hashCode(this.version);
        hash = 97 * hash + Objects.hashCode(this.release);
        hash = 97 * hash + this.pkgKey;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProvidesImpl other = (ProvidesImpl) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.flags, other.flags)) {
            return false;
        }
        if (!Objects.equals(this.epoch, other.epoch)) {
            return false;
        }
        if (!Objects.equals(this.version, other.version)) {
            return false;
        }
        if (!Objects.equals(this.release, other.release)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProvidesImpl{" + "id=" + id + ", name=" + name + ", flags=" + flags + ", epoch=" + epoch + ", version=" + version + ", release=" + release + ", pkgKey=" + pkgKey + '}';
    }
    
    
}