package web.service;

import org.springframework.transaction.annotation.Transactional;
import web.repository.UserRepository;
import org.springframework.stereotype.Service;
import web.model.AppUser;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository repo;
    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public void save(AppUser user) {
        repo.save(user);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Optional<AppUser> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<AppUser> findAll() {
        return repo.findAll();
    }


}
