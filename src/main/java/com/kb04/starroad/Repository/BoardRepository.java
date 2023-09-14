package com.kb04.starroad.Repository;

import com.kb04.starroad.Entity.Board;
import com.kb04.starroad.Entity.Comment;
import com.kb04.starroad.Entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer>, JpaSpecificationExecutor<Board> {
    Page<Board> findByType(String type, Pageable pageable);
    Page<Board> findAllByOrderByLikesDesc(Pageable pageable);
    List<Board> findAllByMemberNoOrderByRegdate(Member memberNo);
    Optional<Board> findById(Integer no);

}
