package com.poc.dnbfilegateway.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FG_ARRIVEDFILE {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "prod_org_name")
	private String prod_org_name;
	@Column(name = "state")
	private String state;
	@Column(name = "file_name")
	private String file_name;
    @Column(name = "file_size")
	private String file_size;
    @Column(name = "data_flow_id")
    private String data_flow_id;
    @Column(name = "modifyts")
    private String modifyts;

    @Override
    public String toString() {
        return "FG_ARRIVEDFILE [prod_org_name=" + prod_org_name + ", state=" + state + ", file_name=" + file_name
                + ", file_size=" + file_size + ", data_flow_id=" + data_flow_id + ", modifyts=" + modifyts + "]";
    }


    public FG_ARRIVEDFILE(String prod_org_name, String state, String file_name, String file_size, String data_flow_id,
            String modifyts) {
        this.prod_org_name = prod_org_name;
        this.state = state;
        this.file_name = file_name;
        this.file_size = file_size;
        this.data_flow_id = data_flow_id;
        this.modifyts = modifyts;
    }

    public FG_ARRIVEDFILE() {
		super();
		// TODO Auto-generated constructor stub
	}

    public String getProd_org_name() {
        return prod_org_name;
    }
    public void setProd_org_name(String prod_org_name) {
        this.prod_org_name = prod_org_name;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getFile_name() {
        return file_name;
    }
    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }
    public String getFile_size() {
        return file_size;
    }
    public void setFile_size(String file_size) {
        this.file_size = file_size;
    }
    public String getData_flow_id() {
        return data_flow_id;
    }
    public void setData_flow_id(String data_flow_id) {
        this.data_flow_id = data_flow_id;
    }
    public String getModifyts() {
        return modifyts;
    }
    public void setModifyts(String modifyts) {
        this.modifyts = modifyts;
    }
    
}
