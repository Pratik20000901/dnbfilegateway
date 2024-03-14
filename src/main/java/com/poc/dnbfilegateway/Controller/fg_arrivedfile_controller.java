package com.poc.dnbfilegateway.Controller;

import java.util.*;

import com.poc.dnbfilegateway.dto.FileDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.poc.dnbfilegateway.Service.arrivedfile_service;


@RestController
@RequestMapping("/dnbfilegatewaypoc")
@CrossOrigin
public class fg_arrivedfile_controller {

    @Autowired 
	private arrivedfile_service Service;

    @GetMapping("/find")
    public List<FileDetailDTO> getAlldetail()
    {
        return Service.findalldetail();
    }
    
    @GetMapping("/Producer/{prod_org_name}")
    public List<FileDetailDTO> getproducerdetail(@PathVariable("prod_org_name") String prod_org_name)
    {
		return Service.findproducerdetail(prod_org_name);
    }

    @GetMapping("/Filename/{file_name}")
    public List<FileDetailDTO> getfilenamedetail(@PathVariable("file_name") String file_name)
    {
		return Service.findfilenamedetail(file_name);
    }

    @GetMapping("/State/{state}")
    public List<FileDetailDTO> getstatedetail(@PathVariable("state") String state)
    {
		return Service.findstatedetail(state);
    }

    @GetMapping("/ProducerFilename/{prod_org_name}/{file_name}")
    public List<FileDetailDTO> getproducerandfilenamedetail(@PathVariable("prod_org_name") String prod_org_name, @PathVariable("file_name") String file_name)
    {
		return Service.findproducerandfilenamedetail(prod_org_name, file_name);
    }

    @GetMapping("/ProducerState/{prod_org_name}/{state}")
    public List<FileDetailDTO> getproducerandstatedetail(@PathVariable("prod_org_name") String prod_org_name, @PathVariable("state") String state)
    {
		return Service.findproducerandstatedetail(prod_org_name, state);
    }

    @GetMapping("/FilenameState/{file_name}/{state}")
    public List<FileDetailDTO> getfilenameandstatedetail(@PathVariable("file_name") String file_name, @PathVariable("state") String state)
    {
		return Service.findfilenameandstatedetail(file_name, state);
    }

    @GetMapping("/ProducerFilenameState/{prod_org_name}/{file_name}/{state}")
    public List<FileDetailDTO> getproducerandfilenameandstatedetail(@PathVariable("prod_org_name") String prod_org_name, @PathVariable("file_name") String file_name, @PathVariable("state") String state)
    {
		return Service.findproducerandfilenameandstatedetail(prod_org_name, file_name, state);
    }

    @GetMapping("/Consumer/{mailbox_path}")
    public List<FileDetailDTO> getconsumerdetail(@PathVariable("mailbox_path") String mailbox_path)
    {
		return Service.findconsumerdetail(mailbox_path);
    }
    
    
    @GetMapping("/ProducerConsumer/{prod_org_name}/{mailbox_path}")
    public List<FileDetailDTO> getproducerandconsumerdetail(@PathVariable("prod_org_name") String prod_org_name, @PathVariable("mailbox_path") String mailbox_path)
    {
		return Service.findproducerandconsumerdetail(prod_org_name, mailbox_path);
    }

    @GetMapping("/ConsumerFilename/{mailbox_path}/{file_name}")
    public List<FileDetailDTO> getconsumerandfilenamedetail(@PathVariable("mailbox_path") String mailbox_path, @PathVariable("file_name") String file_name)
    {
		return Service.findconsumerandfilenamedetail(mailbox_path, file_name);
    }

    @GetMapping("/ConsumerState/{mailbox_path}/{state}")
    public List<FileDetailDTO> getconsumerandstatedetail(@PathVariable("mailbox_path") String mailbox_path, @PathVariable("state") String state)
    {
		return Service.findconsumerandstatedetail(mailbox_path, state);
    }

    @GetMapping("/ProducerConsumerFilename/{prod_org_name}/{mailbox_path}/{file_name}")
    public List<FileDetailDTO> getproducerandconsumerandfilenamedetail(@PathVariable("prod_org_name") String prod_org_name, @PathVariable("mailbox_path") String mailbox_path, @PathVariable("file_name") String file_name)
    {
		return Service.findproducerandconsumerandfilenamedetail(prod_org_name, mailbox_path, file_name);
    }

    @GetMapping("/ProducerConsumerState/{prod_org_name}/{mailbox_path}/{state}")
    public List<FileDetailDTO> getproducerandconsumerandstatedetail(@PathVariable("prod_org_name") String prod_org_name, @PathVariable("mailbox_path") String mailbox_path, @PathVariable("state") String state)
    {
		return Service.findproducerandconsumerandstatedetail(prod_org_name, mailbox_path, state);
    }

     @GetMapping("/ConsumerFilenameState/{mailbox_path}/{file_name}/{state}")
    public List<FileDetailDTO> getconsumerandfilenameandstatedetail(@PathVariable("mailbox_path") String mailbox_path, @PathVariable("file_name") String file_name, @PathVariable("state") String state)
    {
		return Service.findconsumerandfilenameandstatedetail(mailbox_path, file_name, state);
    }

    @GetMapping("/ProducerConsumerFilenameState/{prod_org_name}/{mailbox_path}/{file_name}/{state}")
    public List<FileDetailDTO> getproducerandconsumerandfilenameandstatedetail(@PathVariable("prod_org_name") String prod_org_name, @PathVariable("mailbox_path") String mailbox_path, @PathVariable("file_name") String file_name, @PathVariable("state") String state)
    {
		return Service.findproducerandconsumerandfilenameandstatedetail(prod_org_name, mailbox_path, file_name, state);
    }

}
