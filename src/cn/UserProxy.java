package cn;

public class UserProxy implements Iuser {
    private Iuser user = new UserImpl();
    @Override
    public void eat(String s) {
        System.out.println("静态代理前置内容");
         user.eat(s);
         System.out.println("静态代理后置内容");
    }
}
