package com.qcloud.cos.model.ciModel.job;

/**
 * 媒体处理拼接节点
 */
public class MediaConcatFragmentObject {
    /**
     * 拼接cos资源完整url
     */
    private String url;
    /**
     * Start：开头
     * End：结尾
     */
    private String mode;
    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 拼接对象的索引位置
     * 大于等于0的整数
     * 默认值 0
     */
    private String fragmentIndex;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getFragmentIndex() {
        return fragmentIndex;
    }

    public void setFragmentIndex(String fragmentIndex) {
        this.fragmentIndex = fragmentIndex;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MediaConcatFragmentObject{");
        sb.append("url='").append(url).append('\'');
        sb.append(", mode='").append(mode).append('\'');
        sb.append(", startTime='").append(startTime).append('\'');
        sb.append(", endTime='").append(endTime).append('\'');
        sb.append(", fragmentIndex='").append(fragmentIndex).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
