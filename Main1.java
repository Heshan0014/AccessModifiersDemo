public class Main1 {
    public static void main(String[] args) {
        AccessModifiersDemo obj= new AccessModifiersDemo();


        obj.defaultVar=4.3;
        obj.protectedVar=true;
        obj.publicVar="heshan";

        System.out.println(" default var "+obj.defaultVar);
        System.out.println(" public var "+obj.publicVar);

        SubclassDemo obj1 = new SubclassDemo();
        obj1.displayProtectedVar();

}
}