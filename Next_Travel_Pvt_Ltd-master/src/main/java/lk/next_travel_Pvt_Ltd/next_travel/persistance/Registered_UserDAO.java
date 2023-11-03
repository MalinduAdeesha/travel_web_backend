package lk.next_travel_Pvt_Ltd.next_travel.persistance;

import lk.next_travel_Pvt_Ltd.next_travel.entity.Registered_User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Registered_UserDAO extends JpaRepository<Registered_User, String> {

}
