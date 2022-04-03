package hqr.o365.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hqr.o365.domain.TaOfficeInfo;

@Repository
public interface TaOfficeInfoRepo extends JpaRepository<TaOfficeInfo, Integer> {
	
	@Query(value="select * from ta_office_info order by remarks LIMIT :offset,:pageSize ", nativeQuery = true)
	List<TaOfficeInfo> getOfficeInfos(int offset, int pageSize);
	
	@Transactional
    @Modifying
	@Query(value="update ta_office_info set selected='否'", nativeQuery = true)
	void updateAllNo();
	
	@Query(value="select * from ta_office_info where selected='是'", nativeQuery = true)
	List<TaOfficeInfo> getSelectedApp();
	
}
