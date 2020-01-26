package ua.polina.finalProject.SystemOfCheckingTaxReports.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ua.polina.finalProject.SystemOfCheckingTaxReports.dto.UsersDTO;
import ua.polina.finalProject.SystemOfCheckingTaxReports.entity.User;
import ua.polina.finalProject.SystemOfCheckingTaxReports.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Slf4j
@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UsersDTO getAllUsers(int page, int size, String sortParametr, String sortDir) {
        PageRequest pageReq = PageRequest.of(page, size, Sort.Direction.fromString(sortDir), sortParametr);
        Page<User> allUsers = userRepository.findAll(pageReq);
        return new UsersDTO(allUsers.getContent());
    }

    public Optional<User> getById(Long id){
        return userRepository.findById(id);
    }

    public Optional<User> getByEmail(String email){
        return userRepository.findByEmail(email);
    }
}