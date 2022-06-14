package kr.co.clozet.clozet.services;

import kr.co.clozet.auth.domains.Messenger;
import kr.co.clozet.clozet.domains.Closet;
import kr.co.clozet.clozet.domains.Clothes;
import kr.co.clozet.clozet.repositories.ClosetRepository;
import kr.co.clozet.clozet.repositories.ClothesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static kr.co.clozet.lambda.Lambda.string;

/**
 * packageName    : kr.co.clozet.clozet.services
 * fileName       : ClosetServiceImpl
 * author         : kimyunseop
 * date           : 2022-05-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-31        kimyunseop       최초 생성
 */
@Service
@RequiredArgsConstructor
public class ClosetServiceImpl implements ClosetService{
    private final ClosetRepository repository;

    @Override
    public List<Closet> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Closet> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Closet> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Messenger count() {
        return Messenger.builder().message(string(repository.count())).build();
    }

    @Override
    public Messenger delete(Closet closet) {
        repository.delete(closet);
        return Messenger.builder().build();
    }

    @Override
    public Messenger save(Closet closet) {
        return null;
    }

    @Override
    public Optional<Closet> findByDate(String date) {
        return Optional.empty();
    }

    @Override
    public Messenger getOne(Long id) {
        return null;
    }

    @Override
    public Optional<Closet> findByUserId(String userId) {
        return Optional.empty();
    }

    @Override
    public Messenger update(Closet closet) {
        return null;
    }
}
