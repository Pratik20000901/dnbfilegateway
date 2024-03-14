package com.poc.dnbfilegateway.Entity;

import jakarta.persistence.*;

@Entity
public class FG_PART_GRP_MEMB {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "part_grp_key")
    private String part_grp_key;
    @Column(name = "organization_key")
    private String organization_key;

    public FG_PART_GRP_MEMB() {
        super();
    }

    public FG_PART_GRP_MEMB(String part_grp_key, String organization_key) {
        this.part_grp_key = part_grp_key;
        this.organization_key = organization_key;
    }

    @Override
    public String toString() {
        return "FG_PART_GRP_MEMB{" +
                "part_grp_key='" + part_grp_key + '\'' +
                ", organization_key='" + organization_key + '\'' +
                '}';
    }

    public String getPart_grp_key() {
        return part_grp_key;
    }

    public void setPart_grp_key(String part_grp_key) {
        this.part_grp_key = part_grp_key;
    }

    public String getOrganization_key() {
        return organization_key;
    }

    public void setOrganization_key(String organization_key) {
        this.organization_key = organization_key;
    }
}
