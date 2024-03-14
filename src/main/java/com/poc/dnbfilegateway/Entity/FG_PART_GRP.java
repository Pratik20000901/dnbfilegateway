package com.poc.dnbfilegateway.Entity;

import jakarta.persistence.*;

@Entity
public class FG_PART_GRP {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "part_grp_key")
    private String part_grp_key;
    @Column(name = "name")
    private String name;

    public FG_PART_GRP() {
        super();
    }

    @Override
    public String toString() {
        return "FG_PART_GRP{" +
                "part_grp_key='" + part_grp_key + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public FG_PART_GRP(String part_grp_key, String name) {
        this.part_grp_key = part_grp_key;
        this.name = name;
    }

    public String getPart_grp_key() {
        return part_grp_key;
    }

    public void setPart_grp_key(String part_grp_key) {
        this.part_grp_key = part_grp_key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
