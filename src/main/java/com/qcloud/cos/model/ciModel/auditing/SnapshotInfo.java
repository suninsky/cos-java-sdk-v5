package com.qcloud.cos.model.ciModel.auditing;

/**
 * 截图信息，只返回违规的截图信息
 */
public class SnapshotInfo {
    private String url;
    private PornInfo pornInfo;
    private TerroristInfo terroristInfo;
    private PoliticsInfo politicsInfo;
    private AdsInfo adsInfo;
    private TeenagerInfo teenagerInfo = new TeenagerInfo();
    private String text;
    private String label;
    private String result;
    private String snapshotTime;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PornInfo getPornInfo() {
        if (pornInfo == null) {
            pornInfo = new PornInfo();
        }
        return pornInfo;
    }

    public void setPornInfo(PornInfo pornInfo) {
        this.pornInfo = pornInfo;
    }

    public TerroristInfo getTerroristInfo() {
        if (terroristInfo == null) {
            terroristInfo = new TerroristInfo();
        }
        return terroristInfo;
    }

    public void setTerroristInfo(TerroristInfo terroristInfo) {
        this.terroristInfo = terroristInfo;
    }

    public PoliticsInfo getPoliticsInfo() {
        if (politicsInfo == null) {
            politicsInfo = new PoliticsInfo();
        }
        return politicsInfo;
    }

    public void setPoliticsInfo(PoliticsInfo politicsInfo) {
        this.politicsInfo = politicsInfo;
    }

    public AdsInfo getAdsInfo() {
        if (adsInfo == null) {
            adsInfo = new AdsInfo();
        }
        return adsInfo;
    }

    public void setAdsInfo(AdsInfo adsInfo) {
        this.adsInfo = adsInfo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TeenagerInfo getTeenagerInfo() {
        return teenagerInfo;
    }

    public void setTeenagerInfo(TeenagerInfo teenagerInfo) {
        this.teenagerInfo = teenagerInfo;
    }

    public String getSnapshotTime() {
        return snapshotTime;
    }

    public void setSnapshotTime(String snapshotTime) {
        this.snapshotTime = snapshotTime;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SnapshotInfo{");
        sb.append("url='").append(url).append('\'');
        sb.append(", pornInfo=").append(pornInfo);
        sb.append(", terroristInfo=").append(terroristInfo);
        sb.append(", politicsInfo=").append(politicsInfo);
        sb.append(", adsInfo=").append(adsInfo);
        sb.append(", text='").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
