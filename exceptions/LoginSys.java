class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String x) {
        super(x);
    }
}
class LoginSys {
    void validate(String a, String b) throws InvalidCredentialsException {
        String x = "user";
        String y = "pass";
        if(!a.equals(x) || !b.equals(y)) {
            throw new InvalidCredentialsException("wrong");
        }
        System.out.println("ok");
    }
    public static void main(String[] z) {
        LoginSys c = new LoginSys();
        try {
            c.validate("abc","123");
        } catch(InvalidCredentialsException e) {
            System.out.println("try again");
        }
    }
}
