package cn.yunyichina.log.component.index.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/2/27 18:02
 * @Description: 注意, begin和end是有可能为null的!!!!!!!!!!
 * 注意,begin和end是有可能为null的!!!!!!!!!!
 * 注意,begin和end是有可能为null的!!!!!!!!!!
 */
public class ContextInfo implements Serializable {

    private static final long serialVersionUID = -8753201735866113930L;

    private ContextIndex begin;
    private ContextIndex end;

    public ContextInfo() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContextInfo that = (ContextInfo) o;
        return Objects.equals(begin, that.begin) &&
                Objects.equals(end, that.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(begin, end);
    }


    public ContextIndex getBegin() {
        return begin;
    }

    public ContextInfo setBegin(ContextIndex begin) {
        this.begin = begin;
        return this;
    }

    public ContextIndex getEnd() {
        return end;
    }

    public ContextInfo setEnd(ContextIndex end) {
        this.end = end;
        return this;
    }

}
