package greenstitch.jayshree.assignment.service.serviceImpl;

import greenstitch.jayshree.assignment.entity.ParkingLot;
import greenstitch.jayshree.assignment.exception.MessageException;
import greenstitch.jayshree.assignment.repository.ParkingLotRepository;
import greenstitch.jayshree.assignment.service.ParkingLotService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {
    ParkingLotRepository parkingLotRepository;

    public ParkingLotServiceImpl(ParkingLotRepository parkingLotRepository){
        this.parkingLotRepository = parkingLotRepository;
    }

    @Override
    public ParkingLot createParkingLot(ParkingLot parkingLot){
        Optional<ParkingLot> oneRow = parkingLotRepository.findById(1L);

        if(oneRow.isPresent()){
            throw new MessageException("Already made", "No need to make another ParkingLot");
        }


        ParkingLot newData = parkingLotRepository.save(parkingLot);
        return newData;
    }

}
