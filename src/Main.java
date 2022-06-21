
public class Main {

    public static void main(String[] args) {
        fridge fridge = new fridge("Холодильник Bosch KGN39VW25R",92990, 4);
        client1 client1 = new client1("Холодильник Bosch KGN39VW25R","Mishka","6104073",92990,4);
        client1.viev();

        telephone telephone = new telephone("Honor 9X",16990,4);
        client2 client2 = new client2("Honor 9X","Elizaveta","1kk9af0",16990,4);
        client2.viev();

        laptop laptop = new laptop("Lenovo 6V73QJQE ",39990,4);
        client3 client3 = new client3("Lenovo 6V73QJQE","Vitaliy","lkz00092",39990,4);
        client3.viev();
    }

    interface product {
        void productName();

        void price();

        void raiting();
    }

    static class fridge implements product {

        String tv;
        int price, raiting;

        fridge(String tv, int price, int raiting) {
            this.tv = tv;
            this.price = price;
            this.raiting = raiting;
        }

        @Override
        public void productName() {
            System.out.println(tv);
        }

        @Override
        public void price() {
            System.out.println(price);
        }

        @Override
        public void raiting() {
            System.out.println(raiting);
        }
    }

    static class telephone implements product {

        String phone;
        int price, raiting;

        telephone(String phone, int price, int raiting) {
            this.phone = phone;
            this.price = price;
            this.raiting = raiting;
        }

        @Override
        public void productName() {
            System.out.println(phone);
        }

        @Override
        public void price() {
            System.out.println(price);
        }

        @Override
        public void raiting() {
            System.out.println(raiting);
        }
    }

    static class laptop implements product {

        String laptop;
        int price, raiting;

        laptop(String laptop, int price, int raiting) {
            this.laptop = laptop;
            this.price = price;
            this.raiting = raiting;
        }

        @Override
        public void productName() {
            System.out.println(laptop);
        }

        @Override
        public void price() {
            System.out.println(price);
        }

        @Override
        public void raiting() {
            System.out.println(raiting);
        }
    }

    interface consumer{
        void login();
        void password();
    }

    static class client1 implements consumer,product{

        private final String fridge;
        String tv,login,password;
        int price,raiting;

        client1(String fridge,String login, String password, int price, int raiting){

            this.login = login;
            this.fridge = fridge;
            this.password = password;
            this.price = price;
            this.raiting = raiting;

        }

        public void login() {
            System.out.println(login);
        }

        @Override
        public void password() {
            System.out.println(password);
        }


        @Override
        public void productName() {
            System.out.println(tv);
        }

        @Override
        public void price() {
            System.out.println(price);
        }

        @Override
        public void raiting() {
            System.out.println(raiting);
        }
        public void viev(){
            System.out.println("Пользователь: "+login + " покупает " + fridge);
        }
    }
    static class client2 implements consumer,product{

        String phone,login,password;
        int price,raiting;

        client2(String phone,String login, String password, int price, int raiting){

            this.login = login;
            this.phone = phone;
            this.password = password;
            this.price = price;
            this.raiting = raiting;

        }

        public void login() {
            System.out.println(login);
        }

        @Override
        public void password() {
            System.out.println(password);
        }

        @Override
        public void productName() {
            System.out.println(phone);
        }

        @Override
        public void price() {
            System.out.println(price);
        }

        @Override
        public void raiting() {
            System.out.println(raiting);
        }
        public void viev(){
            System.out.println("Пользователь: "+login + " покупает " + phone);
        }
    }
    static class client3 implements consumer,product{

        String laptop,login,password;
        int price,raiting;

        client3(String laptop,String login, String password, int price, int raiting){

            this.login = login;
            this.laptop = laptop;
            this.password = password;
            this.price = price;
            this.raiting = raiting;

        }

        public void login() {
            System.out.println(login);
        }

        @Override
        public void password() {
            System.out.println(password);
        }

        @Override
        public void productName() {
            System.out.println(laptop);
        }

        @Override
        public void price() {
            System.out.println(price);
        }

        @Override
        public void raiting() {
            System.out.println(raiting);
        }

        public void viev(){
            System.out.println("Пользователь: "+login + " покупает " + laptop);
        }
    }

}