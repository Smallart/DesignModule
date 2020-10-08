package com.smallart;

public class MemoHolder {
    private Memo memo;

    public MemoHolder(Memo memo) {
        this.memo = memo;
    }

    public Memo getMemo() {
        return memo;
    }

    public void setMemo(Memo memo) {
        this.memo = memo;
    }
}
