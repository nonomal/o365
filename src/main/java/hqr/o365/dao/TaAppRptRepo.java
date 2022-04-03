package hqr.o365.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hqr.o365.domain.TaAppRpt;

@Repository
public interface TaAppRptRepo extends JpaRepository<TaAppRpt, Integer>{
	
	@Query(value="select * from ta_app_rpt order by remarks limit :offset,:pageSize", nativeQuery = true)
	List<TaAppRpt> getSysRpt(int offset, int pageSize);
	
	@Transactional
    @Modifying
	@Query(value="delete from ta_app_rpt where tenant_id= :tenantId", nativeQuery = true)
	void deleteByTenantId(String tenantId);
	
}
