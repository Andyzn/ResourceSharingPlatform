package com.andy.resourcesharingplatform.domain.resource;

import java.sql.Timestamp;

/**
 * 资源描述类
 * @author Andy
 * @date 2017/11/05 22:46
 */
public class ResourceInfo {
    /**
     * 资源类型ID
     */
    private int id;
    /**
     * 下载量
     */
    private int downloadCount;
    /**
     * 字节大小
     */
    private long byteSize;
    /**
     * 上传时间
     */
    private Timestamp uploadTime;
    /**
     * 上传者
     */
    private String uploader;
    /**
     * 收藏数量
     */
    private int collectedCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    public long getByteSize() {
        return byteSize;
    }

    public void setByteSize(long byteSize) {
        this.byteSize = byteSize;
    }

    public Timestamp getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Timestamp uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public int getCollectedCount() {
        return collectedCount;
    }

    public void setCollectedCount(int collectedCount) {
        this.collectedCount = collectedCount;
    }

    @Override
    public String toString() {
        return "ResourceInfo{" +
                "id=" + id +
                ", downloadCount=" + downloadCount +
                ", byteSize=" + byteSize +
                ", uploadTime=" + uploadTime +
                ", uploader='" + uploader + '\'' +
                ", collectedCount=" + collectedCount +
                '}';
    }
}
