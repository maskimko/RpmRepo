/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.pp.msk.yum.sqlite.primary;

import java.io.Serializable;

/**
 *
 * @author edem
 */
public interface Requires extends Serializable {

    boolean equals(Object object);

    String getEpoch();

    String getFlags();

    long getId();

    String getName();

    PackagesImpl getPkgKey();

    boolean getPre();

    String getRelease();

    EntryPK getRequiresPK();

    String getVersion();

    int hashCode();

    void setEpoch(String epoch);

    void setFlags(String flags);

    void setId(long id);

    void setName(String name);

    void setPkgKey(PackagesImpl pkgKey);

    void setPre(boolean pre);

    void setRelease(String release);

    void setRequiresPK(EntryPK requires1PK);

    void setVersion(String version);

    String toString();
    
}
