package enigma.todo_list.utils.responseWrapper;

public class MyResponse {
    private boolean success;
    private String message;
    private String token;

    // Constructors
    public MyResponse() {}

    public MyResponse(boolean success, String message, String token) {
        this.success = success;
        this.message = message;
        this.token = token;
    }

    // Getters and Setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
