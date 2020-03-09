package site.azhe.otoken.common.constants;

public enum  HttpStatusConstants {
    BAD_GATEWAY(502, "从上游服务器接收到无效的响应");

    public int getStatus() {
        return status;
    }

    public String getContent() {
        return content;
    }

    private int status;
    private String content;

    private HttpStatusConstants(int status, String content){
        this.status = status;
        this.content = content;
    }
}
