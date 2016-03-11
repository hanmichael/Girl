package z3jjlzt.s.girl.z3jjlzt.s.girl.entity;

import java.util.List;

/**
 * Created by s on 2016/3/10.
 * 返回的json文本
 */
public class GirlJsonData {
    private String error;
    private List<GirlEntity> results;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<GirlEntity> getResults() {
        return results;
    }

    public void setResults(List<GirlEntity> results) {
        this.results = results;
    }
}
