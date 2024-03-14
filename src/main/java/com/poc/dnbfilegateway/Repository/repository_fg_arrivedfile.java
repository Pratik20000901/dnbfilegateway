package com.poc.dnbfilegateway.Repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.poc.dnbfilegateway.Entity.FG_ARRIVEDFILE;

public interface repository_fg_arrivedfile extends JpaRepository<FG_ARRIVEDFILE, String> {
    
    @Query(value ="select FG_ARRIVEDFILE.prod_org_name, FG_ARRIVEDFILE.state, FG_ARRIVEDFILE.file_name, FG_DELIVERY.mailbox_path, FG_ARRIVEDFILE.file_size, FG_ARRIVEDFILE.modifyts from FG_ARRIVEDFILE join FG_DELIVERY on FG_ARRIVEDFILE.data_flow_id = FG_DELIVERY.data_flow_id", nativeQuery = true)
	public List<Object[]> getalldetail();

    @Query(value ="select FG_ARRIVEDFILE.prod_org_name, FG_ARRIVEDFILE.state, FG_ARRIVEDFILE.file_name, FG_DELIVERY.mailbox_path, FG_ARRIVEDFILE.file_size, FG_ARRIVEDFILE.modifyts from FG_ARRIVEDFILE join FG_DELIVERY on FG_ARRIVEDFILE.data_flow_id = FG_DELIVERY.data_flow_id where FG_ARRIVEDFILE.prod_org_name = :prod_org_name", nativeQuery = true)
	public List<Object[]> getproducerdetail(@Param("prod_org_name") String prod_org_name);

    @Query(value ="select FG_ARRIVEDFILE.prod_org_name, FG_ARRIVEDFILE.state, FG_ARRIVEDFILE.file_name, FG_DELIVERY.mailbox_path, FG_ARRIVEDFILE.file_size, FG_ARRIVEDFILE.modifyts from FG_DELIVERY join FG_ARRIVEDFILE on FG_ARRIVEDFILE.data_flow_id = FG_DELIVERY.data_flow_id where FG_DELIVERY.mailbox_path like %:mailbox_path%", nativeQuery = true)
	public List<Object[]> getconsumerdetail(@Param("mailbox_path") String mailbox_path);

    @Query(value ="select FG_ARRIVEDFILE.prod_org_name, FG_ARRIVEDFILE.state, FG_ARRIVEDFILE.file_name, FG_DELIVERY.mailbox_path, FG_ARRIVEDFILE.file_size, FG_ARRIVEDFILE.modifyts from FG_ARRIVEDFILE join FG_DELIVERY on FG_ARRIVEDFILE.data_flow_id = FG_DELIVERY.data_flow_id where FG_ARRIVEDFILE.file_name like %:file_name%", nativeQuery = true)
	public List<Object[]> getfilenamedetail(@Param("file_name") String file_name);

    @Query(value ="select FG_ARRIVEDFILE.prod_org_name, FG_ARRIVEDFILE.state, FG_ARRIVEDFILE.file_name, FG_DELIVERY.mailbox_path, FG_ARRIVEDFILE.file_size, FG_ARRIVEDFILE.modifyts from FG_ARRIVEDFILE join FG_DELIVERY on FG_ARRIVEDFILE.data_flow_id = FG_DELIVERY.data_flow_id where FG_ARRIVEDFILE.state = :state", nativeQuery = true)
	public List<Object[]> getstatedetail(@Param("state") String state);

    @Query(value ="select FG_ARRIVEDFILE.prod_org_name, FG_ARRIVEDFILE.state, FG_ARRIVEDFILE.file_name, FG_DELIVERY.mailbox_path, FG_ARRIVEDFILE.file_size, FG_ARRIVEDFILE.modifyts from FG_ARRIVEDFILE join FG_DELIVERY on FG_ARRIVEDFILE.data_flow_id = FG_DELIVERY.data_flow_id where FG_ARRIVEDFILE.prod_org_name = :prod_org_name and FG_DELIVERY.mailbox_path like %:mailbox_path%", nativeQuery = true)
	public List<Object[]> getproducerandconsumerdetail(@Param("prod_org_name") String prod_org_name, @Param("mailbox_path") String mailbox_path);

    @Query(value ="select FG_ARRIVEDFILE.prod_org_name, FG_ARRIVEDFILE.state, FG_ARRIVEDFILE.file_name, FG_DELIVERY.mailbox_path, FG_ARRIVEDFILE.file_size, FG_ARRIVEDFILE.modifyts from FG_ARRIVEDFILE join FG_DELIVERY on FG_ARRIVEDFILE.data_flow_id = FG_DELIVERY.data_flow_id where FG_ARRIVEDFILE.prod_org_name = :prod_org_name and FG_ARRIVEDFILE.file_name like %:file_name%", nativeQuery = true)
	public List<Object[]> getproducerandfilenamedetail(@Param("prod_org_name") String prod_org_name, @Param("file_name") String file_name);

    @Query(value ="select FG_ARRIVEDFILE.prod_org_name, FG_ARRIVEDFILE.state, FG_ARRIVEDFILE.file_name, FG_DELIVERY.mailbox_path, FG_ARRIVEDFILE.file_size, FG_ARRIVEDFILE.modifyts from FG_ARRIVEDFILE join FG_DELIVERY on FG_ARRIVEDFILE.data_flow_id = FG_DELIVERY.data_flow_id where FG_ARRIVEDFILE.prod_org_name = :prod_org_name and FG_ARRIVEDFILE.state = :state", nativeQuery = true)
	public List<Object[]> getproducerandstatedetail(@Param("prod_org_name") String prod_org_name, @Param("state") String state);

     @Query(value ="select FG_ARRIVEDFILE.prod_org_name, FG_ARRIVEDFILE.state, FG_ARRIVEDFILE.file_name, FG_DELIVERY.mailbox_path, FG_ARRIVEDFILE.file_size, FG_ARRIVEDFILE.modifyts from FG_ARRIVEDFILE join FG_DELIVERY on FG_ARRIVEDFILE.data_flow_id = FG_DELIVERY.data_flow_id where FG_ARRIVEDFILE.file_name like %:file_name% and FG_ARRIVEDFILE.state = :state", nativeQuery = true)
	public List<Object[]> getfilenameandstatedetail(@Param("file_name") String file_name, @Param("state") String state);

    @Query(value ="select FG_ARRIVEDFILE.prod_org_name, FG_ARRIVEDFILE.state, FG_ARRIVEDFILE.file_name, FG_DELIVERY.mailbox_path, FG_ARRIVEDFILE.file_size, FG_ARRIVEDFILE.modifyts from FG_ARRIVEDFILE join FG_DELIVERY on FG_ARRIVEDFILE.data_flow_id = FG_DELIVERY.data_flow_id where FG_ARRIVEDFILE.prod_org_name = :prod_org_name and FG_ARRIVEDFILE.file_name like %:file_name% and FG_ARRIVEDFILE.state = :state", nativeQuery = true)
	public List<Object[]> getproducerandfilenameandstatedetail(@Param("prod_org_name") String prod_org_name, @Param("file_name") String file_name, @Param("state") String state);

    @Query(value ="select FG_ARRIVEDFILE.prod_org_name, FG_ARRIVEDFILE.state, FG_ARRIVEDFILE.file_name, FG_DELIVERY.mailbox_path, FG_ARRIVEDFILE.file_size, FG_ARRIVEDFILE.modifyts from FG_ARRIVEDFILE join FG_DELIVERY on FG_ARRIVEDFILE.data_flow_id = FG_DELIVERY.data_flow_id where FG_DELIVERY.mailbox_path like %:mailbox_path% and FG_ARRIVEDFILE.file_name like %:file_name%", nativeQuery = true)
	public List<Object[]> getconsumerandfilenamedetail(@Param("mailbox_path") String mailbox_path, @Param("file_name") String file_name);
   
    @Query(value ="select FG_ARRIVEDFILE.prod_org_name, FG_ARRIVEDFILE.state, FG_ARRIVEDFILE.file_name, FG_DELIVERY.mailbox_path, FG_ARRIVEDFILE.file_size, FG_ARRIVEDFILE.modifyts from FG_ARRIVEDFILE join FG_DELIVERY on FG_ARRIVEDFILE.data_flow_id = FG_DELIVERY.data_flow_id where FG_DELIVERY.mailbox_path like %:mailbox_path% and FG_ARRIVEDFILE.state = :state", nativeQuery = true)
	public List<Object[]> getconsumerandstatedetail(@Param("mailbox_path") String mailbox_path, @Param("state") String state);

    @Query(value ="select FG_ARRIVEDFILE.prod_org_name, FG_ARRIVEDFILE.state, FG_ARRIVEDFILE.file_name, FG_DELIVERY.mailbox_path, FG_ARRIVEDFILE.file_size, FG_ARRIVEDFILE.modifyts from FG_ARRIVEDFILE join FG_DELIVERY on FG_ARRIVEDFILE.data_flow_id = FG_DELIVERY.data_flow_id where FG_ARRIVEDFILE.prod_org_name = :prod_org_name and FG_DELIVERY.mailbox_path like %:mailbox_path% and FG_ARRIVEDFILE.file_name like %:file_name%", nativeQuery = true)
	public List<Object[]> getproducerandconsumerandfilenamedetail(@Param("prod_org_name") String prod_org_name, @Param("mailbox_path") String mailbox_path, @Param("file_name") String file_name);

    @Query(value ="select FG_ARRIVEDFILE.prod_org_name, FG_ARRIVEDFILE.state, FG_ARRIVEDFILE.file_name, FG_DELIVERY.mailbox_path, FG_ARRIVEDFILE.file_size, FG_ARRIVEDFILE.modifyts from FG_ARRIVEDFILE join FG_DELIVERY on FG_ARRIVEDFILE.data_flow_id = FG_DELIVERY.data_flow_id where FG_ARRIVEDFILE.prod_org_name = :prod_org_name and FG_DELIVERY.mailbox_path like %:mailbox_path% and FG_ARRIVEDFILE.state = :state", nativeQuery = true)
	public List<Object[]> getproducerandconsumerandstatedetail(@Param("prod_org_name") String prod_org_name, @Param("mailbox_path") String mailbox_path, @Param("state") String state);

    @Query(value ="select FG_ARRIVEDFILE.prod_org_name, FG_ARRIVEDFILE.state, FG_ARRIVEDFILE.file_name, FG_DELIVERY.mailbox_path, FG_ARRIVEDFILE.file_size, FG_ARRIVEDFILE.modifyts from FG_ARRIVEDFILE join FG_DELIVERY on FG_ARRIVEDFILE.data_flow_id = FG_DELIVERY.data_flow_id where FG_DELIVERY.mailbox_path like %:mailbox_path% and FG_ARRIVEDFILE.file_name like %:file_name% and FG_ARRIVEDFILE.state = :state", nativeQuery = true)
	public List<Object[]> getconsumerandfilenameandstatedetail(@Param("mailbox_path") String mailbox_path, @Param("file_name") String file_name, @Param("state") String state);

    @Query(value ="select FG_ARRIVEDFILE.prod_org_name, FG_ARRIVEDFILE.state, FG_ARRIVEDFILE.file_name, FG_DELIVERY.mailbox_path, FG_ARRIVEDFILE.file_size, FG_ARRIVEDFILE.modifyts from FG_ARRIVEDFILE join FG_DELIVERY on FG_ARRIVEDFILE.data_flow_id = FG_DELIVERY.data_flow_id where FG_ARRIVEDFILE.prod_org_name = :prod_org_name and FG_DELIVERY.mailbox_path like %:mailbox_path% and FG_ARRIVEDFILE.file_name like %:file_name% and FG_ARRIVEDFILE.state = :state", nativeQuery = true)
	public List<Object[]> getproducerandconsumerandfilenameandstatedetail(@Param("prod_org_name") String prod_org_name, @Param("mailbox_path") String mailbox_path, @Param("file_name") String file_name, @Param("state") String state);

}
