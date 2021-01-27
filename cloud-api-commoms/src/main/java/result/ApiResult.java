package result;

import lombok.Data;

/**
 * @FileName: ApiResult.java
 * @Description: ApiResult.java类说明
 * @Author: camille
 * @Date: 2021/1/26 23:37
 */
@Data
public class ApiResult<T> {

    private Integer code;
    private String message;
    private T data;

    public ApiResult() {
    }

    public ApiResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ApiResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
