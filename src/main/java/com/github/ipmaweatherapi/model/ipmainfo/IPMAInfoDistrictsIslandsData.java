package com.github.ipmaweatherapi.model.ipmainfo;

/**
 * IPMAInfoDistrictsIslandsData - This class stores information about the Portuguese locations for which weather
 * forecast data is publicly available. It follows the format fetched from the public IPMA API, available at:
 * <a href="https://api.ipma.pt/open-data/distrits-islands.json">...</a>
 * Regarding the region id, this value is received from the IPMA api in numeric format.
 * @author João Assunção
 */
public class IPMAInfoDistrictsIslandsData {

    private Long idRegiao; //Portugal's area identifier (1 - mainland; 2 - Madeira islands; 3 - Azores islands)
    private String idAreaAviso; //id of the region the local is in, to associate weather warnings by region
    private Long idConcelho; //municipality id
    private Long globalIdLocal; //the unique id to each instance of this object, that identifies the local
    private String latitude;
    private Long idDistrito; //district id
    private String local; //the local's name
    private String longitude;

    //constructors

    public IPMAInfoDistrictsIslandsData(){}

    public IPMAInfoDistrictsIslandsData(
            Long idRegiao, String idAreaAviso, Long idConcelho, Long globalIdLcal, String latitude, Long idDistrito, String local, String longitude) {
        this.idRegiao = idRegiao;
        this.idAreaAviso = idAreaAviso;
        this.idConcelho = idConcelho;
        this.globalIdLocal = globalIdLcal;
        this.latitude = latitude;
        this.idDistrito = idDistrito;
        this.local = local;
        this.longitude = longitude;
    }

    //getters and setters

    public Long getIdRegiao() {
        return idRegiao;
    }

    public void setIdRegiao(Long idRegiao) {
        this.idRegiao = idRegiao;
    }

    public String getIdAreaAviso() {
        return idAreaAviso;
    }

    public void setIdAreaAviso(String idAreaAviso) {
        this.idAreaAviso = idAreaAviso;
    }

    public Long getIdConcelho() {
        return idConcelho;
    }

    public void setIdConcelho(Long idConcelho) {
        this.idConcelho = idConcelho;
    }

    public Long getGlobalIdLocal() {
        return globalIdLocal;
    }

    public void setGlobalIdLocal(Long globalIdLocal) {
        this.globalIdLocal = globalIdLocal;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Long getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(Long idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
