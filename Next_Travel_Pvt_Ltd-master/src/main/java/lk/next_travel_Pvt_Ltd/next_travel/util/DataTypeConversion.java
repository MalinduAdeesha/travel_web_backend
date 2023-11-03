package lk.next_travel_Pvt_Ltd.next_travel.util;

import lk.next_travel_Pvt_Ltd.next_travel.dto.*;
import lk.next_travel_Pvt_Ltd.next_travel.entity.*;
import lk.next_travel_Pvt_Ltd.next_travel.entity.Package;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DataTypeConversion {

    private final ModelMapper modelMapper;

    public DataTypeConversion(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public GuideDTO getGuideDTO(Guide guide) {
        return modelMapper.map(guide, GuideDTO.class);
    }

    public Guide getGuide(GuideDTO guideDTO) {
        return modelMapper.map(guideDTO, Guide.class);
    }

    public AdminDTO getAdminDTO(Admin admin) {
        return modelMapper.map(admin, AdminDTO.class);
    }

    public Admin getAdmin(AdminDTO adminDTO) {
        return modelMapper.map(adminDTO, Admin.class);
    }

    public HotelDTO getHotelDTO(Hotel hotel) {
        return modelMapper.map(hotel, HotelDTO.class);
    }

    public Hotel getHotel(HotelDTO hotelDTO) {
        return modelMapper.map(hotelDTO, Hotel.class);
    }

    public PackageDTO getPackageDTO(Package aPackage) {
        return modelMapper.map(aPackage, PackageDTO.class);
    }

    public Package getPackage(PackageDTO packageDTO) {
        return modelMapper.map(packageDTO, Package.class);
    }

    public Registered_UserDTO getRegisteredUserDTO(Registered_User registered_user) {
        return modelMapper.map(registered_user, Registered_UserDTO.class);
    }

    public Registered_User getRegisteredUser(Registered_UserDTO registered_userDTO) {
        return modelMapper.map(registered_userDTO, Registered_User.class);
    }

    public UserDTO getUserDTO(User user) {
        return modelMapper.map(user, UserDTO.class);
    }

    public User getUser(UserDTO user) {
        return modelMapper.map(user, User.class);
    }

    public VehicleDTO getVehicleDTO(Vehicle vehicle) {
        return modelMapper.map(vehicle, VehicleDTO.class);
    }

    public Vehicle getVehicle(VehicleDTO vehicle) {
        return modelMapper.map(vehicle, Vehicle.class);
    }

}
