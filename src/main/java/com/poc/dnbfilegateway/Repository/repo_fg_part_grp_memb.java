package com.poc.dnbfilegateway.Repository;

import com.poc.dnbfilegateway.Entity.FG_PART_GRP_MEMB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface repo_fg_part_grp_memb extends JpaRepository<FG_PART_GRP_MEMB, String> {

    @Query(value ="select FG_PART_GRP_MEMB.organization_key from FG_PART_GRP_MEMB join FG_PART_GRP on FG_PART_GRP_MEMB.part_grp_key = FG_PART_GRP.part_grp_key where FG_PART_GRP.name = :name ", nativeQuery = true)
    public List<Object[]> getpartners(@Param("name") String name);
}
