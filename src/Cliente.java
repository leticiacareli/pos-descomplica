public class Cliente {
    private String name;
    private String phone;
    private int id;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void ExibirDados(){
        System.out.println(name);
        System.err.println(phone);
        System.err.println(id);
    }

    




}
