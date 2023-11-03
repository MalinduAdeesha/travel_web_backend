package lk.next_travel_Pvt_Ltd.next_travel.service.util;

import lk.next_travel_Pvt_Ltd.next_travel.dto.PackageDTO;
import lk.next_travel_Pvt_Ltd.next_travel.persistance.PackageDAO;
import lk.next_travel_Pvt_Ltd.next_travel.service.PackageService;
import lk.next_travel_Pvt_Ltd.next_travel.util.DataTypeConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PackageServiceImpl implements PackageService {

    @Autowired
    private DataTypeConversion conversion;

    @Autowired
    private PackageDAO dao;

    @Override
    public void savePackage(PackageDTO packageDTO) {

    }

    @Override
    public PackageDTO getSelectedPackage(String package_id) {
        return null;
    }

    @Override
    public void updatePackage(PackageDTO packageDTO) {

    }

    @Override
    public void deletePackage(String package_id) {

    }
}
