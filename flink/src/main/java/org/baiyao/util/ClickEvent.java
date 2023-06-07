package org.baiyao.util;

import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/18/21:49
 * @Description: 样例类
 */
public class ClickEvent {
    public String username;
    public String url;
    public Long ts;

    public ClickEvent() {
    }

    public ClickEvent(String username, String url, Long ts) {
        this.username = username;
        this.url = url;
        this.ts = ts;
    }

    @Override
    public String toString() {
        return "ClickEvent{" +
                "username='" + username + '\'' +
                ", url='" + url + '\'' +
                ", ts=" + new Timestamp(ts) +
                '}';
    }
}
