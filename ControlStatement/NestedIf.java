public class NestedIf {
    public static void main(String[] args) {
        String addresss = "Delhi,India";

        if (addresss.endsWith("India")) {
                if (addresss.contains("Delhi")) {
                    System.out.println("The Country is INDIA and City is DELHI");
                }

                if (addresss.contains("Merrut")) {
                    System.out.println("The city is MERRUT");
                } else if (addresss.contains("Noida")) {
                    System.out.println("The City of YOurs is NOIDA");
                }
                else {
                    System.out.println(addresss.split(",")[1]);
                }
        } else {
            System.out.println("You Not LIVING in INDIA");
        }
    }
}
