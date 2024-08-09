package com.sparta.springprepare.memo;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
class Memo {
    private final String username;
    private final String contents;

    public static void main(String[] args) {
        Memo memo = new Memo("kkm4512", "123");
        System.out.println(memo);
    }
}
