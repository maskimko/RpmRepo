/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ua.pp.msk.yum.sqlite.other;

import java.util.Date;
import ua.pp.msk.yum.sqlite.common.Changelog;

/**
 *
 * @author Maksym Shkolnyi aka maskimko
 */
public class ChangelogImpl implements Changelog {
    private static final long serialVersionUID = 1L;

    protected ChangelogPK changelogPK;
    private String changelog;
    private int pkgKey;
    private String author;
    private Integer date;
    private Date dateAsDate;
    private String text;


    public ChangelogImpl() {
        this.changelogPK = new ChangelogPK();
    }

    public ChangelogImpl(ChangelogPK changelogPK) {
        this.changelogPK = changelogPK;
    }

    public ChangelogImpl(String author, Integer date) {
        this.changelogPK = new ChangelogPK(author, date);
    }

   
    public ChangelogPK getChangelogPK() {
        return changelogPK;
    }

  
    public void setChangelogPK(ChangelogPK changelogPK) {
        this.changelogPK = changelogPK;
    }

    @Override
    public String getChangelog() {
        return changelog;
    }

    @Override
    public void setChangelog(String changelog) {
        this.changelog = changelog;
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
        int hash = 0;
        hash += (changelogPK != null ? changelogPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChangelogImpl)) {
            return false;
        }
        ChangelogImpl other = (ChangelogImpl) object;
        if ((this.changelogPK == null && other.changelogPK != null) || (this.changelogPK != null && !this.changelogPK.equals(other.changelogPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void setAuthor(String author) {
       this.author = author;
    }

    @Override
    public Integer getDate() {
        return date;
    }

    @Override
    public Date getDateAsDate() {
        return dateAsDate;
    }

    @Override
    public void setDate(Integer date) {
         this.date = date;
    }

    @Override
    public void setDate(Date date) {
        this.dateAsDate = dateAsDate;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
         this.text = text;
    }
}

   

   