package com.sparta.springprepare.repository;

import com.sparta.springprepare.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {

}
