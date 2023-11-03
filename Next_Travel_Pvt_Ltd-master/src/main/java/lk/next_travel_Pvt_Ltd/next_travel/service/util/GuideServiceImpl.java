package lk.next_travel_Pvt_Ltd.next_travel.service.util;

import lk.next_travel_Pvt_Ltd.next_travel.dto.GuideDTO;
import lk.next_travel_Pvt_Ltd.next_travel.entity.Guide;
import lk.next_travel_Pvt_Ltd.next_travel.persistance.GuideDAO;
import lk.next_travel_Pvt_Ltd.next_travel.service.GuideService;
import lk.next_travel_Pvt_Ltd.next_travel.util.DataTypeConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class GuideServiceImpl implements GuideService {

    @Autowired
    private DataTypeConversion conversion;

    @Autowired
    private GuideDAO dao;

    @Override
    public void saveGuide(GuideDTO guideDTO) {


            dao.save(conversion.getGuide(guideDTO));

//            throw new RuntimeException("Guide is already exists..");


    }

    @Override
    public GuideDTO getSelectedGuide(String guide_id) {
        return null;
    }

    @Override
    public void updateGuide(GuideDTO guideDTO) {

        Optional<Guide> guide = dao.findById(guideDTO.getGuide_Id());
        if (guide.isEmpty()) throw new RuntimeException("Guide not found..");
        guide.get().setGuide_Name(guideDTO.getGuide_Name());
        guide.get().setGuide_address(guideDTO.getGuide_address());
        guide.get().setGuide_age(guideDTO.getGuide_age());
        guide.get().setGuide_gender(guideDTO.getGuide_gender());
        guide.get().setGuide_contact_number(guideDTO.getGuide_contact_number());
        guide.get().setGuide_image(guideDTO.getGuide_image());
        guide.get().setGuide_nic_image(guideDTO.getGuide_nic_image());
        guide.get().setExperience(guideDTO.getExperience());
        guide.get().setMan_day_value(guideDTO.getMan_day_value());
        guide.get().setGuide_remarks(guideDTO.getGuide_remarks());

    }

    @Override
    public void deleteGuide(String guide_id) {

        if (!dao.existsById(guide_id)) throw new RuntimeException("Guide not found..");
        dao.deleteById(guide_id);

    }
}
