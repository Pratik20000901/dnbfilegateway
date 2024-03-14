package com.poc.dnbfilegateway.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FG_DELIVERY {

     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "data_flow_id")
	private String data_flow_id;
	@Column(name = "mailbox_path ")
	private String mailbox_path;

    @Override
    public String toString() {
        return "FG_DELIVERY [data_flow_id=" + data_flow_id + ", mailbox_path=" + mailbox_path + "]";
    }

    public FG_DELIVERY(String data_flow_id, String mailbox_path) {
        this.data_flow_id = data_flow_id;
        this.mailbox_path = mailbox_path;
    }

    public FG_DELIVERY() {
		super();
		// TODO Auto-generated constructor stub
	}

    public String getData_flow_id() {
        return data_flow_id;
    }
    public void setData_flow_id(String data_flow_id) {
        this.data_flow_id = data_flow_id;
    }
    public String getMailbox_path() {
        return mailbox_path;
    }
    public void setMailbox_path(String mailbox_path) {
        this.mailbox_path = mailbox_path;
    }
    
}
