package lk.next_travel_Pvt_Ltd.next_travel.persistance;

import lk.next_travel_Pvt_Ltd.next_travel.entity.Guide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuideDAO extends JpaRepository<Guide, String> {
}
