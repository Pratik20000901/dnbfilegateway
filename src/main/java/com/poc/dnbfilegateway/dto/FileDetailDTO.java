package com.poc.dnbfilegateway.dto;

public class FileDetailDTO {

    private String producer;
    private String status;
    private String fileName;
    private String consumer;
    private String size;
    private String dateTime;



    public FileDetailDTO(String producer, String status, String fileName, String consumer, String size,
                         String dateTime) {
        this.producer = producer;
        this.status = status;
        this.fileName = fileName;
        this.consumer = consumer;
        this.size = size;
        this.dateTime = dateTime;
    }

    public FileDetailDTO() {
    }

    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getConsumer() {
        return consumer;
    }
    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getDateTime() {
        return dateTime;
    }
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }



}