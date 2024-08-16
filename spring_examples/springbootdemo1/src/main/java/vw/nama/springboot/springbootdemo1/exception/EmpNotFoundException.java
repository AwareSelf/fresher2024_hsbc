package vw.nama.springboot.springbootdemo1.exception;



public class EmpNotFoundException extends RuntimeException {

   
	private static final long serialVersionUID = 1L;
	private String message;

    public EmpNotFoundException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}