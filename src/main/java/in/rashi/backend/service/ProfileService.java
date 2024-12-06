package in.rashi.backend.service;

import in.rashi.backend.dto.ProfileDTO;

public interface ProfileService {

    /**
     * It will save the user details to database
     * @param profileDTO
     * @return profileDto
     * */
    ProfileDTO createProfile(ProfileDTO profileDTO);
}
