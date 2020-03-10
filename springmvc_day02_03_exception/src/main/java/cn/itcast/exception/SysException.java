package cn.itcast.exception;

/**
 * @author 喻浩
 * @create 2019-08-25-9:34
 */
public class SysException extends Exception {
    
    //存储提示信息的
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SysException(String message) {
        this.message = message;
    }
}
