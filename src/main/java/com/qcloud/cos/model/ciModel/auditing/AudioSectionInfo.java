package com.qcloud.cos.model.ciModel.auditing;

/**
 * 截图信息，只返回违规的截图信息
 */
public class AudioSectionInfo extends SectionInfo {
    private String url;
    private String offsetTime;
    private String duration;
    private String text;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOffsetTime() {
        return offsetTime;
    }

    public void setOffsetTime(String offsetTime) {
        this.offsetTime = offsetTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AudioSectionInfo{");
        sb.append("url='").append(url).append('\'');
        sb.append(", offsetTime='").append(offsetTime).append('\'');
        sb.append(", duration='").append(duration).append('\'');
        sb.append(", text='").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
