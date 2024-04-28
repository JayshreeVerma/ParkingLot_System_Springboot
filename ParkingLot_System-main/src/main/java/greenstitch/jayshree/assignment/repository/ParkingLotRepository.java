package greenstitch.jayshree.assignment.repository;

import greenstitch.jayshree.assignment.entity.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot, Long> {

}
