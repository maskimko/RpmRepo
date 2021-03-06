/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.pp.msk.yum.sqlite;

import ua.pp.msk.yum.sqlite.common.RPM;
import java.util.Collection;
import ua.pp.msk.yum.sqlite.common.Changelog;
import ua.pp.msk.yum.sqlite.common.Conflicts;
import ua.pp.msk.yum.sqlite.common.Enhances;
import ua.pp.msk.yum.sqlite.common.Filelist;
import ua.pp.msk.yum.sqlite.common.Files;
import ua.pp.msk.yum.sqlite.common.Obsoletes;
import ua.pp.msk.yum.sqlite.common.Provides;
import ua.pp.msk.yum.sqlite.common.Recommends;
import ua.pp.msk.yum.sqlite.common.Requires;
import ua.pp.msk.yum.sqlite.common.Suggests;
import ua.pp.msk.yum.sqlite.common.Supplements;
/**
 
 * @author Maksym Shkolnyi aka maskimko
 */

public class RpmPackage implements RPM {

    private Collection<Changelog> changelogCollection;
    private String name;
    private String arch;
    private String version;
    private String epoch;
    private String release;
    private String summary;
    private String description;
    private String url;
    private Integer timeFile;
    private Integer timeBuild;
    private String rpmLicense;
    private String rpmVendor;
    private String rpmGroup;
    private String rpmBuildhost;
    private String rpmSourcerpm;
    private Integer rpmHeaderStart;
    private Integer rpmHeaderEnd;
    private String rpmPackager;
    private Integer sizePackage;
    private Integer sizeInstalled;
    private Integer sizeArchive;
    private String locationHref;
    private String locationBase;
    private String checksumType;
    private Collection<Conflicts> conflictsCollection;
    private Collection<Obsoletes> obsoletesCollection;
    private Collection<Files> filesCollection;
    private Collection<Provides> providesCollection;
    private Collection<Suggests> suggestsCollection;
    private Collection<Enhances> enhancesCollection;
    private Collection<Requires> requiresCollection;
    private Collection<Supplements> supplementsCollection;
    private Collection<Recommends> recommendsCollection;
    private static final long serialVersionUID = 1L;
    private Integer pkgKey;
    private String pkgId;
    private Collection<Filelist> filelistCollection;
    private String compressedChecksum;
    
    public RpmPackage() {
    }

  
    
    
    
    @Override
    public Integer getPkgKey() {
        return pkgKey;
    }

    @Override
    public void setPkgKey(Integer pkgKey) {
        this.pkgKey = pkgKey;
    }

    @Override
    public String getPkgId() {
        return pkgId;
    }

    @Override
    public void setPkgId(String pkgId) {
        this.pkgId = pkgId;
    }

    @Override
    public Collection<Filelist> getFilelistCollection() {
        return filelistCollection;
    }

    @Override
    public void setFilelistCollection(Collection<Filelist> filelistCollection) {
        this.filelistCollection = filelistCollection;
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
    public String getArch() {
        return arch;
    }

    @Override
    public void setArch(String arch) {
        this.arch = arch;
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
    public String getEpoch() {
        return epoch;
    }

    @Override
    public void setEpoch(String epoch) {
        this.epoch = epoch;
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
    public String getSummary() {
        return summary;
    }

    @Override
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public Integer getTimeFile() {
        return timeFile;
    }

    @Override
    public void setTimeFile(Integer timeFile) {
        this.timeFile = timeFile;
    }

    @Override
    public Integer getTimeBuild() {
        return timeBuild;
    }

    @Override
    public void setTimeBuild(Integer timeBuild) {
        this.timeBuild = timeBuild;
    }

    @Override
    public String getRpmLicense() {
        return rpmLicense;
    }

    @Override
    public void setRpmLicense(String rpmLicense) {
        this.rpmLicense = rpmLicense;
    }

    @Override
    public String getRpmVendor() {
        return rpmVendor;
    }

    @Override
    public void setRpmVendor(String rpmVendor) {
        this.rpmVendor = rpmVendor;
    }

    @Override
    public String getRpmGroup() {
        return rpmGroup;
    }

    @Override
    public void setRpmGroup(String rpmGroup) {
        this.rpmGroup = rpmGroup;
    }

    @Override
    public String getRpmBuildhost() {
        return rpmBuildhost;
    }

    @Override
    public void setRpmBuildHost(String rpmBuildhost) {
        this.rpmBuildhost = rpmBuildhost;
    }

    @Override
    public String getRpmSourcerpm() {
        return rpmSourcerpm;
    }

    @Override
    public void setRpmSourcerpm(String rpmSourcerpm) {
        this.rpmSourcerpm = rpmSourcerpm;
    }

    @Override
    public Integer getRpmHeaderStart() {
        return rpmHeaderStart;
    }

    @Override
    public void setRpmHeaderStart(Integer rpmHeaderStart) {
        this.rpmHeaderStart = rpmHeaderStart;
    }

    @Override
    public Integer getRpmHeaderEnd() {
        return rpmHeaderEnd;
    }

    @Override
    public void setRpmHeaderEnd(Integer rpmHeaderEnd) {
        this.rpmHeaderEnd = rpmHeaderEnd;
    }

    @Override
    public String getRpmPackager() {
        return rpmPackager;
    }

    @Override
    public void setRpmPackager(String rpmPackager) {
        this.rpmPackager = rpmPackager;
    }

    @Override
    public Integer getSizePackage() {
        return sizePackage;
    }

    @Override
    public void setSizePackage(Integer sizePackage) {
        this.sizePackage = sizePackage;
    }

    @Override
    public Integer getSizeInstalled() {
        return sizeInstalled;
    }

    @Override
    public void setSizeInstalled(Integer sizeInstalled) {
        this.sizeInstalled = sizeInstalled;
    }

    @Override
    public Integer getSizeArchive() {
        return sizeArchive;
    }

    @Override
    public void setSizeArchive(Integer sizeArchive) {
        this.sizeArchive = sizeArchive;
    }

    @Override
    public String getLocationHref() {
        return locationHref;
    }

    @Override
    public void setLocationHref(String locationHref) {
        this.locationHref = locationHref;
    }

    @Override
    public String getLocationBase() {
        return locationBase;
    }

    @Override
    public void setLocationBase(String locationBase) {
        this.locationBase = locationBase;
    }

    @Override
    public String getChecksumType() {
        return checksumType;
    }

    @Override
    public void setChecksumType(String checksumType) {
        this.checksumType = checksumType;
    }

    @Override
    public Collection<Conflicts> getConflictsCollection() {
        return conflictsCollection;
    }

    @Override
    public void setConflictsCollection(Collection<Conflicts> conflictsCollection) {
        this.conflictsCollection = conflictsCollection;
    }

    @Override
    public Collection<Obsoletes> getObsoletesCollection() {
        return obsoletesCollection;
    }

    @Override
    public void setObsoletesCollection(Collection<Obsoletes> obsoletesCollection) {
        this.obsoletesCollection = obsoletesCollection;
    }

    @Override
    public Collection<Files> getFilesCollection() {
        return filesCollection;
    }

    @Override
    public void setFilesCollection(Collection<Files> filesCollection) {
        this.filesCollection = filesCollection;
    }

    @Override
    public Collection<Provides> getProvidesCollection() {
        return providesCollection;
    }

    @Override
    public void setProvidesCollection(Collection<Provides> providesCollection) {
        this.providesCollection = providesCollection;
    }

    @Override
    public Collection<Suggests> getSuggestsCollection() {
        return suggestsCollection;
    }

    @Override
    public void setSuggestsCollection(Collection<Suggests> suggestsCollection) {
        this.suggestsCollection = suggestsCollection;
    }

    @Override
    public Collection<Enhances> getEnhancesCollection() {
        return enhancesCollection;
    }

    @Override
    public void setEnhancesCollection(Collection<Enhances> enhancesCollection) {
        this.enhancesCollection = enhancesCollection;
    }

    @Override
    public Collection<Requires> getRequiresCollection() {
        return requiresCollection;
    }

    @Override
    public void setRequiresCollection(Collection<Requires> requiresCollection) {
        this.requiresCollection = requiresCollection;
    }

    @Override
    public Collection<Supplements> getSupplementsCollection() {
        return supplementsCollection;
    }

    @Override
    public void setSupplementsCollection(Collection<Supplements> supplementsCollection) {
        this.supplementsCollection = supplementsCollection;
    }

    @Override
    public Collection<Recommends> getRecommendsCollection() {
        return recommendsCollection;
    }

    @Override
    public void setRecommendsCollection(Collection<Recommends> recommendsCollection) {
        this.recommendsCollection = recommendsCollection;
    }

    @Override
    public Collection<Changelog> getChangelogCollection() {
        return changelogCollection;
    }

    @Override
    public void setChangelogCollection(Collection<Changelog> changelogCollection) {
        this.changelogCollection = changelogCollection;
    }

 

}
