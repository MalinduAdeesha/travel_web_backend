package lk.next_travel_Pvt_Ltd.next_travel.service;

import lk.next_travel_Pvt_Ltd.next_travel.dto.GuideDTO;

public interface GuideService {

    void saveGuide(GuideDTO guideDTO);
    GuideDTO getSelectedGuide(String guide_id);
    void updateGuide(GuideDTO guideDTO);
    void deleteGuide(String guide_id);

}
