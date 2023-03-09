public class classe {
    public static void main(String[] args) {
        String firstName = "Letícia";
        String lastName = "Careli";
        
        System.out.println(firstName);
        System.out.println(firstName.length());
        System.out.println(firstName.concat(" " + lastName));
        System.out.println(firstName.equals(lastName));
        System.out.println(firstName.substring(2, 5));
        System.out.println(firstName.contains("cia"));
        System.out.println(firstName.replace("c", "t"));
      }
}
