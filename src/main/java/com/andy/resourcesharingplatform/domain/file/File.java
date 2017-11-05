package com.andy.resourcesharingplatform.domain.file;

import com.andy.resourcesharingplatform.domain.Uri;

/**
 * 文件节点
 * @author Andy
 * @date 2017/11/05 22:54
 */
public class File extends AbstractNode {
    private Uri uri;

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "File{" +
                "uri=" + uri +
                '}';
    }
}
