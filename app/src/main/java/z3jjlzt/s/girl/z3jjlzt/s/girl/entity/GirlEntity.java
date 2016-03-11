package z3jjlzt.s.girl.z3jjlzt.s.girl.entity;

/**
 * Created by s on 2016/3/9.
 * 图片实体
 */
public class GirlEntity {
    private String _id;
    private String _ns;
    private String createdAt;
    private String desc;
    private String publishedAt;
    private String type;
    private String url;
    private String used;

    public String get_ns() {
        return _ns;
    }

    public void set_ns(String _ns) {
        this._ns = _ns;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    private String who;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }



    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }



    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }









    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "GirlEntity{" +
                "_id='" + _id + '\'' +
                ", _ns='" + _ns + '\'' +
                ", createdAt=" + createdAt +
                ", desc='" + desc + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", used=" + used +
                ", who='" + who + '\'' +
                '}';
    }
}
