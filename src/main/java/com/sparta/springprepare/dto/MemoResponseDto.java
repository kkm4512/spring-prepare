package com.sparta.springprepare.dto;

import lombok.Getter;
import com.sparta.springprepare.entity.Memo;

@Getter
public class MemoResponseDto {
    private final Long id;
    private final String username;
    private final String contents;

    public MemoResponseDto(Memo memo) {
        this.id = memo.getId();
        this.username = memo.getUsername();
        this.contents = memo.getContents();
    }
}
