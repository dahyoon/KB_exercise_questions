public class DatabaseExample {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();

        String db_name = db1.connect();
        System.out.printf("데이터베이스: %s\n", db_name);
        db1.close();

    }
}