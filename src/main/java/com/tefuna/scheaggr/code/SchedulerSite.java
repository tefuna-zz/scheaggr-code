package com.tefuna.scheaggr.code;

import java.util.Arrays;

import com.tefuna.common.code.ICode;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * コード定義: SchedulerSite
 *
 * @author tefuna
 */
@AllArgsConstructor
@Getter
public enum SchedulerSite implements ICode {

    YOYAKUYA("yoyakuya", "yoyakuya"),
    GOOGLE("google", "google calendar"),
    CYBOZU("cybozu", "cybozu"),;

    private String code;
    private String name;

    public static String getName(String code) {
        return Arrays.stream(values())
                .filter(e -> e.getCode().equals(code))
                .map(e -> e.getName())
                .findFirst()
                .orElse("");
    }

}
