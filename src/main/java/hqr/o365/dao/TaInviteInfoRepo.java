package hqr.o365.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import hqr.o365.domain.TaInviteInfo;

@Repository
public interface TaInviteInfoRepo extends JpaRepository<TaInviteInfo, String> {
	@Query(value="select * from ta_invite_info order by start_dt desc limit :offset,:pageSize", nativeQuery = true)
	List<TaInviteInfo> getInviteInfos(int offset, int pageSize);
}
